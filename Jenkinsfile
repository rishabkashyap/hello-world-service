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

    stage('build') {
    steps{
    sh 'chmod +x gradlew'
    sh './gradlew build'
    }
}
}
