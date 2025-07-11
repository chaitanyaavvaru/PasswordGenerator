pipeline {
    agent any

    tools {
        jdk 'Java 21'  // Make sure "Java 21" is configured in Jenkins Global Tool Configuration
    }

    environment {
        JAVA_HOME = tool 'Java 21'
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
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
                // Example input: yes yes yes yes 12
                bat 'java -cp out com.chaitanya.passwordgen.Main yes yes yes yes 12'
            }
        }
    }
}
