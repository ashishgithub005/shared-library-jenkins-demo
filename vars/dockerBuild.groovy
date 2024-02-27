def dockerImage(){
    sh "docker build -t k8b:latest ."
    sh "docker tag k8s:latest akumar10605/k8s:latest"
}