pipeline {
   agent any

   stages {
      stage('Hello') {
         steps {
            echo 'Hello World'
         }
      }
      stage('Maven Build') {
         steps {
            sh 'mvn install package'
         }
      }
   }
}
