def dockerImage(){
    echo "*****************: DOcker build START:***************"
    sh "docker build -t akumar10605/k8s:tag ."
    echo "*****************: DOcker build END:***************"
}