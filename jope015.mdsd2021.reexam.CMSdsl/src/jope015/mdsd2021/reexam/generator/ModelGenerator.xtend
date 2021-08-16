package jope015.mdsd2021.reexam.generator


import jope015.mdsd2021.reexam.cMSdsl.Entity
import javax.inject.Inject
import jope015.mdsd2021.reexam.util.CMSdslUtil
import jope015.mdsd2021.reexam.cMSdsl.Field
import jope015.mdsd2021.reexam.cMSdsl.Relationship
import jope015.mdsd2021.reexam.cMSdsl.BelongsTo
import jope015.mdsd2021.reexam.cMSdsl.BelongsToMany
import jope015.mdsd2021.reexam.cMSdsl.HasOne
import jope015.mdsd2021.reexam.cMSdsl.HasMany
import org.eclipse.xtext.generator.IFileSystemAccess2
import jope015.mdsd2021.reexam.cMSdsl.DataType
import jope015.mdsd2021.reexam.cMSdsl.Str
import jope015.mdsd2021.reexam.cMSdsl.Integ
import jope015.mdsd2021.reexam.cMSdsl.Bool
import jope015.mdsd2021.reexam.cMSdsl.Dt
import jope015.mdsd2021.reexam.cMSdsl.FieldProp
import jope015.mdsd2021.reexam.cMSdsl.Unique
import jope015.mdsd2021.reexam.cMSdsl.Nullable

class ModelGenerator {
	
	@Inject extension CMSdslUtil
	
	val path = 'models/'
	val fileExtension = '.model.js'
	
	def generateModel(Entity e, String basePath, IFileSystemAccess2 fsa) {
		fsa.generateFile(basePath + path + 'index.js', generateModelsIndexFile)
		fsa.generateFile(basePath + path + e.name.toFirstLower + fileExtension, e.compileModel)
	}
	
	
	def compileModel(Entity e) {
		'''
			'use strict';
			const uuidV4 = require('uuid').v4 
			
			const { Model } = require('sequelize');
			
			module.exports = (sequelize, DataTypes) => {
			
			  class «e.name.toFirstUpper» extends Model {
			    /**
			     * Helper method for defining associations.
			     * This method is not a part of Sequelize lifecycle.
			     * The `models/index` file will call this method automatically.
			     */
			    static associate({«FOR r: e.relations» «r.entity.name.toFirstUpper» «ENDFOR»}) {
			      // define association here
			      «FOR r: e.relations» 
			      	«r.compile(e)»
			      «ENDFOR»
			    }
			  };
			
			  «e.name.toFirstUpper».init({
			  	
			  	 id: {
			  	   type: DataTypes.UUID,
			  	   primaryKey: true,
			  	   allowNull: false,
			  	   defaultValue: () => uuidV4()
			  	 },
			  	 «FOR f: e.fields»
			  	 	«f.compile»
			  	 «ENDFOR»
			  }, {
			    sequelize,
			    modelName: '«e.name.toFirstUpper»',
			  });
			  
			  return «e.name.toFirstUpper»;
			};
		'''
	}
	
		def compile(Relationship rel, Entity e) {
			val type = rel.relationType
			switch(type) {
				BelongsTo: '''this.belongsTo(«rel.entity.name.toFirstUpper»)'''
				BelongsToMany: '''this.belongsToMany(«rel.entity.name.toFirstUpper», { through: '«rel.entity.name.toFirstLower»_«e.name.toFirstLower»' })'''
				HasOne: '''this.hasOne(«rel.entity.name.toFirstUpper»)'''
				HasMany: '''this.hasMany(«rel.entity.name.toFirstUpper»)'''
			}
	}
	
	
	
	def generateModelsIndexFile()'''
		'use strict'
		
		const fs = require('fs')
		const path = require('path')
		const Sequelize = require('sequelize')
		const basename = path.basename(__filename)
		const env = process.env.NODE_ENV || 'development'
		const config = require(__dirname + '/../config/config.json')[env]
		const db = {}
		
		let sequelize
		if (config.use_env_variable) {
		  sequelize = new Sequelize(process.env[config.use_env_variable], config)
		} else {
		  sequelize = new Sequelize(
		    config.database,
		    config.username,
		    config.password,
		    config
		  )
		}
		
		fs.readdirSync(__dirname)
		  .filter((file) => {
		    return (
		      file.indexOf('.') !== 0 && file !== basename && file.slice(-3) === '.js'
		    )
		  })
		  .forEach((file) => {
		    const model = require(path.join(__dirname, file))(
		      sequelize,
		      Sequelize.DataTypes
		    )
		    db[model.name] = model
		  })
		
		Object.keys(db).forEach((modelName) => {
		  if (db[modelName].associate) {
		    db[modelName].associate(db)
		  }
		})
		
		db.sequelize = sequelize
		
		module.exports = db
	'''
	
	def compile(DataType type){
		switch type {
			Str: '''DataTypes.STRING'''
			Integ: '''DataTypes.INTEGER'''
			Bool: '''DataTypes.BOOLEAN'''
			Dt: '''DataTypes.DATE'''
		}
	}
	
	def compileTypeValidation(DataType type){
	
		switch type {
			Dt: '''validate: { isDate: true }'''
			Integ: '''validate: { isInt: true }'''	
		}	
	}
	
	def compile(Field f)
		'''
		«f.name»: {
			type: «f.type.compile»,
			«f.type.compileTypeValidation»
			«FOR p: f.properties.filter[ p | p instanceof Unique || p instanceof Nullable]»
			«p.compileServerProp»,
			«ENDFOR»
		},
		
		'''
	
	def compileServerProp(FieldProp prop){
		switch prop {
			Unique: '''unique: «prop.value»'''
			Nullable: '''allowNull: «prop.value»'''
		}
	}

}
