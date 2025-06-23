pipeline {
    agent any

    tools {
        jdk 'Java 21'
    }

    stages {
        stage('Build') {
            steps {
                bat 'mkdir out'
                bat 'javac -d out src\\com\\chaitanya\\passwordgen\\*.java'
            }
        }

        stage('Run') {
            steps {
                bat 'java -cp out com.chaitanya.passwordgen.Main'
            }
        }
    }
}
