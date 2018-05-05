pipeline {
  agent any
  stages {
    stage('clean') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('build-and-test') {
      steps {
        sh 'mvn clean install'
      }
    }
    stage('docker-image') {
      steps {
        sh 'mvn clean install docker:build'
      }
    }
  }
  environment {
    BRANCH = 'master'
  }
}