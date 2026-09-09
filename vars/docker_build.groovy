def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo "Code is being Build"
  sh "whoami"
  sh "docker build -t notes-app:latest ."
}
