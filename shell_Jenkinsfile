@Library('demo')_
import ci.Bar

node('master') {
  stage('Demo') {
   Bar a = new Bar()
   a.runTest('hello', 'world')   
  }
}
