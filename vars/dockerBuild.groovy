def dockerImage(){
    echo "*****************: Docker build START:***************"
    sh "docker build -t akumar10605/k8s:latest ."
    echo "*****************: Docker build END:***************"
}