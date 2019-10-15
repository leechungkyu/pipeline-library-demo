#!/usr/bin/groovy
package ci;

def abc(param1, param2) {
  node('master') {
    sh "echo parameters: ${param1}, ${param2}"
    sh "echo jenkins parameters: ${params.env}"
        
    Util.printOptions([param1, param2])   
  }
}
