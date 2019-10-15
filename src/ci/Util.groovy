static def printOptions(options = []) {
  echo "this is module"
  for(i = 0; i < options.size(); i++) {
    echo options[i]
  }
}
