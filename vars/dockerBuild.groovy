def dockerImage(){
    sh "docker build -t k8b:latest ."
    sh "docker tag k8s akumar.mt05/k8s:latest"
}