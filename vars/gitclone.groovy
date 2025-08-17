def call(String url,String branch){
  echo "This is copying the code"
  git url:"${url}",branch:"${branch}
  echo "Code clones successfully"
}
