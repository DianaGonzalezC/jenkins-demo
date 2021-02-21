pipeline {
    agent any
    stages {
        stage('Buildd') {
            steps {
                echo 'Build'
            }
        }
        stage('Testt'){
            steps {
                echo 'Test'
            }
        }
    }
}