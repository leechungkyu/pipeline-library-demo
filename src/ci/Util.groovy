static def printOptions(options = []) {
  echo "this is module"
  for(int i = 0; i < options.size(); i++) {
    echo options[i]
  }
}
