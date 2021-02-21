pipeline {
    agent any
    stages {
        stage('Buildd') {
            steps {
                echo 'Buildd'
            }
        }
        stage('Testt'){
            steps {
                echo 'Testt'
            }
        }
    }
}