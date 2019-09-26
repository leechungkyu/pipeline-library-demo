node {
    checkout scm
  
    def testType
    stage('input') {
      def userInput = input message: 'Choose test type', parameters: [string(defaultValue: 'test', description: 'test or verify', name: 'testType', trim: false)], submitterParameter: 'store'
      testType = userInput.testType
    }

    stage('build') {
        withEnv(["PATH+MAVEN=${tool 'apache-maven-3.6.0'}/bin"]) {
            sh 'mvn --version'
            sh "mvn clean ${testType}"
        }
    }
    
    stage('report') {
        junit 'target/surefire-reports/*.xml'
        jacoco execPattern: 'target/**.exec'
        addShortText background: '', borderColor: '', color: '', link: '', text: testType
    }
}
