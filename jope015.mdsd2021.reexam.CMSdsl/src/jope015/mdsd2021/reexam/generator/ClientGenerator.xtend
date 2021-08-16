package jope015.mdsd2021.reexam.generator

import org.eclipse.xtext.generator.IFileSystemAccess2
import jope015.mdsd2021.reexam.cMSdsl.Project
import jope015.mdsd2021.reexam.cMSdsl.Entity
import jope015.mdsd2021.reexam.cMSdsl.Field
import jope015.mdsd2021.reexam.cMSdsl.InputField
import jope015.mdsd2021.reexam.cMSdsl.InputType
import jope015.mdsd2021.reexam.cMSdsl.DataType
import jope015.mdsd2021.reexam.cMSdsl.Str
import jope015.mdsd2021.reexam.cMSdsl.Integ
import jope015.mdsd2021.reexam.cMSdsl.Lng
import jope015.mdsd2021.reexam.cMSdsl.Flt
import jope015.mdsd2021.reexam.cMSdsl.Bool
import jope015.mdsd2021.reexam.cMSdsl.Dt

class ClientGenerator {

	val path = "client/"

	def generateClient(Project project, IFileSystemAccess2 fsa) {
		val entities = project.elements.filter(Entity)
		fsa.generateFile(path + "public/index.html", project.name.compileIndexHtml)
		fsa.generateFile(path + 'src/index.css', compileIndexCss)
		fsa.generateFile(path + 'src/App.js', entities.compileAppJs)
		fsa.generateFile(path + 'src/components/SidebarMenu.jsx', project.compileSidebarMenu)
		fsa.generateFile(path + 'src/components/ResourceTable.jsx', compileResourceTable)
		fsa.generateFile(path + 'src/index.js', compileIndexJs)
		fsa.generateFile(path + 'package.json', compilePackageJson)
		fsa.generateFile(path + 'src/util/index.js', compileUtil)
		entities.forEach [ e |
			fsa.generateFile(path + 'src/services/' + e.name.toFirstLower + '.js', e.compileService)
			fsa.generateFile(path + 'src/components/' + e.name.toFirstUpper + 'List.jsx', e.compileResourceList)
			fsa.generateFile(path + 'src/components/' + e.name.toFirstUpper + 'Display.jsx',
				e.compileDisplayEntityComponent)
			fsa.generateFile(path + 'src/components/Create' + e.name.toFirstUpper + 'Form.jsx', e.compileForm)
		]
	}

	def compileIndexHtml(String projectName) '''
		<!DOCTYPE html>
		<html lang="en">
		  <head>
		    <meta charset="utf-8" />
		    <link rel="icon" href="%PUBLIC_URL%/favicon.ico" />
		    <meta name="viewport" content="width=device-width, initial-scale=1" />
		    <meta
		      name="description"
		      content="Website created using CMS DSL"
		    />
		    <title>«projectName» CMS</title>
		  </head>
		  <body>
		    <div id="root"></div>
		  </body>
		</html>	
	'''

	def compileAppJs(Entity[] entities) {
		'''
			import 'semantic-ui-css/semantic.min.css'
			
			«FOR e : entities»
				import «e.name.toFirstUpper»List from './components/«e.name.toFirstUpper»List'
				import «e.name.toFirstUpper»Display from './components/«e.name.toFirstUpper»Display'
				import Create«e.name.toFirstUpper»Form from './components/Create«e.name.toFirstUpper»Form'
			«ENDFOR»
			import SidebarMenu from './components/SidebarMenu'
			
			
			import React from 'react'
			import {
			  BrowserRouter as Router,
			  Switch,
			  Route,
			} from 'react-router-dom'
			
			
			const App = () => (
			  <Router>
			      <SidebarMenu>
			      
			      <Switch>
			      «FOR e : entities»
			      	<Route path='/«e.name.toFirstLower»s' component={«e.name.toFirstUpper»List} exact />
			      	<Route path='/«e.name.toFirstLower»s/single' component={«e.name.toFirstUpper»Display} exact />
			      	<Route path='/«e.name.toFirstUpper»s/create' component={Create«e.name.toFirstUpper»Form} exact />
			      «ENDFOR»
			      </Switch>
			      </SidebarMenu>
			  </Router>
			);
			
			
			export default App;
			
			
		'''
	}

	def compileIndexCss() '''
		body {
		  margin: 0;
		  font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', 'Roboto', 'Oxygen',
		    'Ubuntu', 'Cantarell', 'Fira Sans', 'Droid Sans', 'Helvetica Neue',
		    sans-serif;
		  -webkit-font-smoothing: antialiased;
		  -moz-osx-font-smoothing: grayscale;
		}
		
		code {
		  font-family: source-code-pro, Menlo, Monaco, Consolas, 'Courier New',
		    monospace;
		}
		
		
		body > #root > div {
		  height: 100vh;
		}
	'''

	def compileService(Entity e) '''
		const axios = require('axios')
		
		export const get«e.name.toFirstUpper»s = () => axios.get(`http://localhost:5000/«e.name.toFirstLower»s`)
		
		export const get«e.name.toFirstUpper» = (id) => axios.get(`http://localhost:5000/«e.name.toFirstLower»s/` + id)
		
		export const create«e.name.toFirstUpper» = (body) => 
		  axios.post('http://localhost:5000/«e.name.toFirstLower»s', body)
	'''

	def compileSidebarMenu(Project project) '''
		import React from 'react'
		import { Menu, Segment, Sidebar, Sticky } from 'semantic-ui-react'
		import styled from 'styled-components'
		import { Link } from 'react-router-dom'
		
		const ContentWrapper = styled.div`
		  padding: 7.5%;
		  display: flex;
		`
		
		const Title = styled.h3`
		  color: #fff;
		  padding-top: 50px;
		  padding-bottom: 100px;
		`
		
		const SidebarMenu = ({children}) => (
		  <Sidebar.Pushable style={{transform: 'none'}} as={Segment}>
		    <Sidebar
		      as={Menu}
		      icon='labeled'
		      inverted
		      visible
		      vertical
		      width='thin'
		      
		    >
		     <Title>«project.name»</Title>
		     <Sticky>
		      «FOR e : project.elements.filter(Entity)»
		      	<Menu.Item as={Link} to='/«e.name.toFirstLower»s'>
		      		«e.name.toFirstUpper»
		      	</Menu.Item>
		      «ENDFOR»
		     </Sticky>
		    </Sidebar>
		  	<Sidebar.Pusher>
		  		<ContentWrapper>
		  				{children}
		  			</ContentWrapper>
		  		</Sidebar.Pusher>
		  </Sidebar.Pushable>
		)
		
		export default SidebarMenu
	'''

	def compileUtil() '''
		import { useState } from 'react'
		
		export const useInputChange = () => {
		  const [input, setInput] = useState({})
		
		  const handleInputChange = (e) => setInput({
		    ...input,
		    [e.currentTarget.name]: e.currentTarget.value
		  })
		
		  return [input, handleInputChange]
		}
		
		export const getKeys = (resource) => {
		  const keys = []
		  for(var key in resource){
		    if(resource.hasOwnProperty(key)) {
		      keys.push(key)
		    }
		  }
		  return keys
		}
		
	'''

	def compileIndexJs() '''
		import React from 'react';
		import ReactDOM from 'react-dom';
		import App from './App';
		import './index.css';
		
		ReactDOM.render(<App />, document.getElementById('root'));
	'''

	def compileResourceTable() '''
		import { Menu, Table, Icon, Button } from 'semantic-ui-react'
		import { Link } from 'react-router-dom'
		import { getKeys } from '../util'
		import { DateTime } from 'luxon'
		
		
		
		
		const ResourceTable = ({ resource, name }) => {
		
		  const resourceSchema = resource[0]
		
		  return (
		    <>  
		     <Button as={Link} to={name + '/create' }  positive  icon labelPosition='right'>
		       <Icon name="plus"/>
		       Create
		     </Button>
		     <Table celled striped sortable style={{width: '80%'}} >
		     <Table.Header>
		       <Table.Row>
		         {resourceSchema !== undefined && getKeys(resourceSchema).map((key, i) => (<Table.HeaderCell key={key + i}>{key}</Table.HeaderCell>))}
		       	<Table.HeaderCell></Table.HeaderCell>
		       </Table.Row>
		     </Table.Header>
			
			    <Table.Body>
			        {resource.map((row, i) => {
			        	const keys = getKeys(row)
			        	const id = row['id']
			        	return(
			        		<Table.Row key={id + i}>
			        			{keys.map((key, i) => {
			        				let val = row[key] 
			        					if(typeof(val) == 'string') {
			        						if(Date.parse(val)){
			        							val = DateTime.fromJSDate(new Date(val))
			        								.toLocaleString(DateTime.DATETIME_FULL)
			        						}
			        					}
			        				return <Table.Cell key={id + i}>{val}</Table.Cell>
			        			})}
			        			<Table.Cell key='edit' >
			        				<Button as={Link} to={{ pathname: name + '/single', state: { id: id } }}  positive  icon labelPosition='right'>
			        					<Icon name="edit outline"/>
			        					Edit
			        				</Button>
			        			</Table.Cell>
			        		</Table.Row>
			        	)
			        })}
			    </Table.Body>
			
			    <Table.Footer>
			      <Table.Row>
			        <Table.HeaderCell colSpan='3'>
			          <Menu floated='right' pagination>
			            <Menu.Item as='a' icon>
			              <Icon name='chevron left' />
			            </Menu.Item>
			            <Menu.Item as='a'>1</Menu.Item>
			            <Menu.Item as='a'>2</Menu.Item>
			            <Menu.Item as='a'>3</Menu.Item>
			            <Menu.Item as='a'>4</Menu.Item>
			            <Menu.Item as='a' icon>
			              <Icon name='chevron right' />
			            </Menu.Item>
			          </Menu>
			        </Table.HeaderCell>
			      </Table.Row>
			    </Table.Footer>
			  </Table>
			 </>
		  )
		
		}
		
		export default ResourceTable
		
	'''

	def compileResourceList(Entity e) '''
		import React, { useEffect, useState } from 'react'
		import { get«e.name.toFirstUpper»s } from '../services/«e.name.toFirstLower»'
		import ResourceTable from './ResourceTable'
		
		
		const «e.name.toFirstUpper»List = () => {
		  const [«e.name.toFirstLower»List, set«e.name.toFirstUpper»List] = useState(undefined)
		
		  useEffect(() => {
		    get«e.name.toFirstUpper»s().then(res => {
		  «IF !e.members.filter(Field).filter[ dontShow ].isEmpty»
		  	res.data.map(«e.name.toFirstLower» => {
		  	«FOR f: e.members.filter(Field).filter[ dontShow ]»
		  		delete «e.name.toFirstLower»['«f.name»']
		  	«ENDFOR»
		  	return «e.name.toFirstLower»
		  	})
		  «ENDIF»
		  
		   	set«e.name.toFirstUpper»List(res.data)
		   	})
		   	  
		  }, [])
		
		
		  return(
		    <div style={{width: '100%'}}>
		      { 
		      	«e.name.toFirstLower»List !== undefined 
		      	? <ResourceTable resource={«e.name.toFirstLower»List} name='«e.name.toFirstLower»s' /> 
		      	: null 
		      }
		    </div>
		  )
		}
		
		export default «e.name.toFirstUpper»List
		
	'''

	def compileDisplayEntityComponent(Entity e) '''
		import { useState, useEffect } from 'react'
		import { get«e.name.toFirstUpper» } from '../services/«e.name.toFirstLower»'
		const «e.name.toFirstUpper»Display = (prop) => {
		
		  const [«e.name.toFirstLower», set«e.name.toFirstUpper»] = useState(null)
		
		  useEffect(() => {
		    const id = prop.location.state.id
		    get«e.name.toFirstUpper»(id).then(res => {
		      set«e.name.toFirstUpper»(res)
		    })
		  }, [prop])
		
		  return (
		    <>
		    { «e.name.toFirstLower» && (
		      <div>
		        {«e.name.toFirstLower».id}
		      </div>
		    )}
		    </>
		  )
		}
		
		export default «e.name.toFirstUpper»Display
	'''

	def compilePackageJson() '''
		{
		  "name": "client",
		  "version": "0.1.0",
		  "private": true,
		  "dependencies": {
		    "axios": "^0.21.1",
		    "luxon": "^2.0.2",
		    "react": "^17.0.2",
		    "react-dom": "^17.0.2",
		    "react-router-dom": "^5.2.0",
		    "react-scripts": "4.0.3",
		    "semantic-ui-css": "^2.4.1",
		    "semantic-ui-react": "^2.0.3",
		    "styled-components": "^5.2.3"
		  },
		  "scripts": {
		    "start": "react-scripts start",
		    "build": "react-scripts build",
		    "test": "react-scripts test",
		    "eject": "react-scripts eject"
		  },
		  "eslintConfig": {
		    "extends": [
		      "react-app",
		      "react-app/jest"
		    ]
		  },
		  "browserslist": {
		    "production": [
		      ">0.2%",
		      "not dead",
		      "not op_mini all"
		    ],
		    "development": [
		      "last 1 chrome version",
		      "last 1 firefox version",
		      "last 1 safari version"
		    ]
		  }
		}
		
	'''

	def compileForm(Entity e) '''
		import React, { useState } from 'react'
		import { Form } from 'semantic-ui-react'
		import { create«e.name.toFirstUpper» } from '../services/«e.name.toFirstLower»';
		
		const Create«e.name.toFirstUpper»Form = () => {
		
		  const [formData, updateFormData] = useState({})
		
		  const handleSubmit = (e) => {
		    e.preventDefault()
		    create«e.name.toFirstUpper»(formData)
		    	.then(res => console.log(res.data))
		    	.catch(err => console.log(err.response.data.errors))
		  }
		
		   const handleChange = (e, smth) => {
		 		const { value } = smth
		     const name = e.target.name
		 
		     if(value && name){
		       updateFormData({
		         ...formData,
		         [name]: value
		       })
		     } else if(smth.radiogroupname !== undefined && value) {
		 			updateFormData({
		 				...formData,
		 				[smth.radiogroupname]: value
		 			})
		 		}
		   }
		  
		
		
		  return(
		  	<>
		  		<h1>Create «e.name.toFirstUpper»</h1>
		  		 <Form>
		  		 «FOR field : e.members.filter(Field)»
		  		 	«IF !field.dontShow»
		  		 		<Form.Field>
		  		 		«IF !field.properties.filter(InputField).isEmpty»
		  		 			{/* Input type:  «field.properties.filter(InputField).head.value.type» */}
		  		 				«field.properties.filter(InputField).head.value.compileInputField(field)»
		  		 		«ELSE»
		  		 			{/* data type: «field.type.type»  */}
		  		 				«field.type.compileInputFieldFromDataType(field)»
		  		 		«ENDIF»
		  		 		</Form.Field>
		  		 	«ENDIF»
		  		 «ENDFOR»
		  		 <Form.Button onClick={handleSubmit} type='submit'>Submit</Form.Button>
		  		 </Form>
			</>
			 )
		}
		
		export default Create«e.name.toFirstUpper»Form
		
	'''

	def compileField(Field f) '''
			
			'''

	def compileInputField(InputType type, Field f) {
		'''<Form.Input type='«type.type»' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''
//			switch type {
//				case InpMail: '''<Form.Input type='«type.type»' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''
//				case InpDate: ''''''
//				case InpNum: ''''''
//				case InpPass: ''''''
//				case InpText: ''''''
//				case InpTextArea: ''''''
//				default: '''<Form.Input type='«type.type»' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''
//			}
	}

	def dispatch compileInputFieldFromDataType(Str type,
		Field f) '''<Form.Input type='text' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''

	def dispatch compileInputFieldFromDataType(Integ type,
		Field f) '''<Form.Input type='number' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''

	def dispatch compileInputFieldFromDataType(Lng type,
		Field f) '''<Form.Input type='number' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''

	def dispatch compileInputFieldFromDataType(Flt type,
		Field f) '''<Form.Input type='number' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''

	def dispatch compileInputFieldFromDataType(Dt type,
		Field f) '''<Form.Input type='date' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''

	def dispatch compileInputFieldFromDataType(Bool type, Field f) '''
		<Form.Group inline>
		          <label>«f.name»</label>
		          <Form.Radio
		            radiogroupname='«f.name»'
		            label='true'
		            value='true'
		            checked={formData['«f.name»'] === 'true'}
		            onChange={handleChange}
		          />
		          <Form.Radio
		          	radiogroupname='«f.name»'
		            label='false'
		            value='false'
		            checked={formData['«f.name»'] === 'false'}
		            onChange={handleChange}
		          />
		        </Form.Group>
	'''

	def compileInputField(DataType type, Field f) {

		switch type {
			case Str: '''<Form.Input type='text' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''
			case Integ: '''<Form.Input type='number' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''
			case Lng: '''<Form.Input type='number' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''
			case Flt: '''<Form.Input type='number' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''
			case Bool: {
				'''
					<Form.Group inline>
					          <label>Size</label>
					          <Form.Radio
					          	name='«f.name»'
					            label='true'
					            value='true'
					            checked={value === 'true'}
					            onChange={handleChange}
					          />
					          <Form.Radio
					          	name='«f.name»'
					            label='false'
					            value='false'
					            checked={value === 'false'}
					            onChange={handleChange}
					          />
					        </Form.Group>
				'''
			}
			default: '''<Form.Input type='«type.type»' name="«f.name»" onChange={handleChange} placeholder='«f.name»' />'''
		}
	}
	
	def createInputValidators(Entity e){
		
	}
	


}
