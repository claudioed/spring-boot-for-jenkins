pipeline {
  environment {
    docker = credentials("claudio-docker")
    BRANCH = 'master'
  }

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
    stage('docker-image-push') {
      steps {
        sh 'mvn -Ddocker.username=$docker_USR -Ddocker.password=$docker_PSW clean install docker:build docker:push'
      }
    }
  }
}