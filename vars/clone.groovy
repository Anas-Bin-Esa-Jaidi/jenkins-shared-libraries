def call(String url, String branch){
  echo "Code is being downloaded"
  git url: "${url}", branch: "${branch}"
  echo "Code cloned successfully"
}
