def call(String Projectname,String Imagetag,String dockerHubUser){
  sh "docker build -t {$dockerHubUser}/${Projectname}:${Imagetag} ."
}
