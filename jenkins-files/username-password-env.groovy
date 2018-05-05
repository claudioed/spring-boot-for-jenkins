pipeline {
    environment {

        github = credentials("github-claudio")
    }

    agent any

    stages {
        stage("credentials-github") {
            steps {
                // all credential values are available for use but will be masked in console log
                sh 'echo "GITHUB is $github"'
                sh 'echo "github-user is $github_USR"'
                sh 'echo "github-pass is $github_PSW"'

            }
        }
    }
}