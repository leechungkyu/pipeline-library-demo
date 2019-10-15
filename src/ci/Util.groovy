#!/usr/bin/groovy
package ci;

static def printOptions(options = []) {
  println "this is module"
  for(int i = 0; i < options.size(); i++) {
    echo options[i]
  }
}
