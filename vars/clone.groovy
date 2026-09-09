def call(String url, String branch){
  echo "Code is being downloaded"
  git url: "${GitUrl}", branch: "${GitBranch}"
  echo "code cloned successfully"
}
