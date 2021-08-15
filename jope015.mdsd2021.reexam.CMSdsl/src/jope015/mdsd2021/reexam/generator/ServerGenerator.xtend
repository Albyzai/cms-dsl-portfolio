package jope015.mdsd2021.reexam.generator

import jope015.mdsd2021.reexam.cMSdsl.Project
import org.eclipse.xtext.generator.IFileSystemAccess2
import jope015.mdsd2021.reexam.cMSdsl.Entity
import javax.inject.Inject
import jope015.mdsd2021.reexam.cMSdsl.DBConfig

class ServerGenerator {
	@Inject extension ServerConfigGenerator
	@Inject extension ControllerGenerator
	@Inject extension ModelGenerator
	@Inject extension ValidatorGenerator
	
	val path = "server/"
	
	def generateServer(Project project, IFileSystemAccess2 fsa) {
		val entities = project.elements.filter(Entity)
		val config = project.elements.filter(DBConfig).get(0)
		
		fsa.generateFile(path + 'index.js', entities.generateServerIndexFile)
		fsa.generateFile(path + 'package.json', generatePackageDotJson)
		
		entities.forEach[e |
			e.generateController(path, fsa)
			e.generateValidator(path, fsa)
			e.generateModel(path, fsa)
		]
		
		config.generate(path, fsa)
		
	}
	
	private def generateServerIndexFile(Entity[] entities)
		'''
		const express = require('express')
		const { sequelize } = require('./models')
		const cors = require('cors')
		const app = express()
			
		const main = async () => {
			await sequelize.sync()
		}
		
		main()
		
		app.use(cors({origin: '*'}))
		app.use(express.json())
		app.use(express.urlencoded({extended: true}))
		
		«FOR e: entities»
			app.use('/«e.name.toFirstLower»s', require('./routes/«e.name.toFirstLower».routes'))
		«ENDFOR»
		
		const PORT = process.env.PORT || 5000
		
		app.listen(PORT, console.log('Server started on port 5000'))
		'''
	
	private def generatePackageDotJson()
	'''
	{
	  "name": "server",
	  "version": "1.0.0",
	  "description": "server generated with CMS DSL",
	  "main": "index.js",
	  "scripts": {
	    "start": "node index.js"
	  },
	  "author": "AuthorName",
	  "license": "ISC",
	  "dependencies": {
	    "cors": "^2.8.5",
	    "express": "^4.17.1",
	    "pg": "^8.6.0",
	    "sequelize": "^6.6.2"
	  }
	}
	'''
	
//	private def generateValidationUtil(Project p) {
//		val validators = p.elements.filter(Validator)
//		'''
//		«FOR v: validators»
//			const «v.name.toFirstLower» = («FOR param: v.params»«v.name», «ENDFOR») => 
//		«ENDFOR»
//		'''
//	}
}