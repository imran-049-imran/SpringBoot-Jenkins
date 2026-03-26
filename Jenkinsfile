pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Build') {
            steps {
                echo 'Building project...'
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }

        stage('Run Application') {
            steps {
                echo 'Starting app...'
                sh 'nohup java -jar target/*.jar &'
            }
        }
    }
}