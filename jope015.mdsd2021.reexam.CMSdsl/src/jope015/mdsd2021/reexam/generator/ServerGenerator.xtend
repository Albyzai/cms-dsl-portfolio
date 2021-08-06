package jope015.mdsd2021.reexam.generator

import jope015.mdsd2021.reexam.cMSdsl.Project
import org.eclipse.xtext.generator.IFileSystemAccess2
import jope015.mdsd2021.reexam.cMSdsl.Entity

class ServerGenerator {
	
	val path = "server/"
	
	def generateServer(Project project, IFileSystemAccess2 fsa) {
		val entities = project.elements.filter(Entity)
		
		fsa.generateFile(path + 'index.js', entities.generateServerIndexFile)
	}
	
	def generateServerIndexFile(Entity[] entities)'''
	const express = require('express')
			const { sequelize } = require('./models')
			const app = express()
			
			const main = async () => {
			  await sequelize.sync()
			}
			
			main()
			
			app.use(express.json())
			app.use(express.urlencoded({extended: true}))
			
			«FOR e: entities»
				app.use('/«e.name.toFirstLower»', require('./routes/«e.name.toFirstLower»'))
			«ENDFOR»
			
			const PORT = process.env.PORT || 5000
			
			app.listen(PORT, console.log('Server started on port 5000'))
	'''
}