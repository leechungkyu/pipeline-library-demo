#!/usr/bin/groovy
package ci;

static def printOptions(options = []) {
  // do not use echo: MissingMethodException
  println "this is module"
  for(int i = 0; i < options.size(); i++) {
    println options[i]
    sh "echo ${options[i]}"
  }
}

return this;
