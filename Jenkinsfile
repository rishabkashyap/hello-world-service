/*
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Hello World from Jenkins 🚀'
            }
        }
    }
}*/
pipeline {
    agent any

    stages {
        stage('Check Java') {
            steps {
                sh 'java -version'
            }
        }

        stage('Checkout Code') {
                    steps {
                        checkout scm
                    }
                }
        stage('Build') {
            steps{
                sh 'chmod +x gradlew'
                sh './gradlew build -x test'
            }
        }
    }
}
