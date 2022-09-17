CODE_CHANGES = GetGitChanges()
pipeline {
    agent any
    environment{
        NEW_VERSION = '1.3.0'
        SERVER_CREDENTIALS = credentials('server-credentials')
    }
    parameters {
        choice(name: 'VERSION' , choices:['1.1.0','1.2.0','1.3.0'], description:'')
        booleanParam(name:'executeTests', defaultValue:true, description:'')
    }


    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                echo "Building new version ${NEW_VERSION}"
            }
        }
        stage('Test') {
            when {
                expression{
                    params.executeTests 
                }
            }
            steps {
                echo 'Testing..'

            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying...." 
                withCredentials([
                    usernamePassword(credentials:'server-credentials', usernameVariable :  USER , passwordVaribale : PWD)
                ]){
                    sh " some script ${USER} ${PWD}"

                }
                echo "deploying version ${params.VERSION} "
            }
        }
    }
}