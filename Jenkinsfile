pipeline {
    agent any

    tools {
        jdk 'Java 21'  // Make sure "Java 21" is configured in Jenkins Global Tool Config
    }

    environment {
        JAVA_HOME = tool 'Java 21'
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
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
                // Example: yes yes yes yes 12 (uppercase, lowercase, numbers, symbols, length 12)
                bat 'java -cp out com.chaitanya.passwordgen.Main yes yes yes yes 12'
            }
        }
    }
}
