pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Check Environment') {
            steps {
                sh 'java -version'
                sh './gradlew --version'
            }
        }

        stage('Clean Build') {
            steps {
                sh './gradlew clean'
            }
        }

        stage('Build') {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew build -x test --no-daemon'
            }
        }
    }
}