pipeline {
    agent any

    environment {
        CURRENT_VERSION = currentVersion()
        NEXT_VERSION = nextVersion(writeVersion: true)
    }

    stages {
        stage('Hello') {
            steps {
                echo "current vesion = ${CURRENT_VERSION}"
                echo "next version = ${NEXT_VERSION}"
                echo "next version success"
            }
        }
    }
}
