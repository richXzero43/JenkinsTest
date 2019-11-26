pipeline {
  agent { docker { image 'python:3.7.2' } }
  stages {

    stage('build') {
      steps {
         def rootDir = pwd()
            def tools = load "${rootDir}\\vars\tools.groovy"
            mainMethod() {
                echo "hello world from Closure"
          }

       }
     }
}