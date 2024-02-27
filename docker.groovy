def dockerImage(){
    sh "docker built -t k8b ."
    sh "docker tag k8s akumar.mt05/k8s:latest"
}