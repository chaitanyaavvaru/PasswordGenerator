pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mkdir -p out'
                sh 'javac -d out src/com/chaitanya/passwordgen/*.java'
            }
        }
        stage('Run') {
            steps {
                sh 'java -cp out com.chaitanya.passwordgen.Main'
            }
        }
    }
}
