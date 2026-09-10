def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'docker_hub', passwordVariable: 'dockerhub_pwd', usernameVariable: 'dockerhub_user')]) {
      sh "docker login -u ${dockerhub_user} -p ${dockerhub_pwd}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
