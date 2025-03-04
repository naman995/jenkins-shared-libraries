def call(String url, String branch){
  echo "This is cloning the Code."
  sh "whoami"
  git url: "${url}", branch: "${branch}"
  echo "Code cloned successfully."
}
