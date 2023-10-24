def gv
pipeline {
	agent any
	parameters {
		choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
		booleanParam(name: 'executetests', defaultValue: true, description: '')
	}
	tools {
		maven 'Maven3'
	}
	environment {
		NEW_VERSION = '1.3.0'
		//SERVER_CREDENTIALS = credentials('server_credentials')
	}
	stages {
		stage("init") {
			steps {
				script {
					gv = load "script.groovy"
				}
			}
		}
		stage("build") {
			when {
				expression {
					BRANCH_NAME == 'dev'
				}
			}
			steps {
				script {
					gv.buildApp()
				}
			}
		}
		stage("test") {
			when {
				expression {
					params.executetests == true
				}
			}
			steps {
				script {
					gv.testApp()
				}
			}
		}
		stage("deploy") {
			steps {
				script {
					gv.deployApp()
				}
			}
		}
	}
}