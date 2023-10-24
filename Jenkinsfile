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
		//stage("init") {
			//st
		//}
		stage("build") {
			when {
				expression {
					BRANCH_NAME == 'dev'
				}
			}
			steps {
				//script {

				//}
				echo 'building the app...'
				echo "building version ${NEW_VERSION}"
				//sh 'mvn install'
			}
		}
		stage("test") {
			when {
				expression {
					params.executetests == true
				}
			}
			steps {
				echo 'testing the app...'
			}
		}
		stage("deploy") {
			steps {
				echo 'deploying the app...'
				echo "deploying version ${params.VERSION}"
				//withCredentials([
					//usernamePassword(credentials:'server_credentials', usernameVariable: USER, passwordVariable: PWD)
					//]) {
						//echo "${USER} ${PWD}"
				//}
			}
		}
	}
}
