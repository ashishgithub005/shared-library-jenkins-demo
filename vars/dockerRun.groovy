def runDockerIamge(){
    echo "*****************: DOcker build START:***************"
    sh "docker run -p 8081:8080 --name k8s-container1 akumar10605/k8s:tag"
    echo "*****************: DOcker build END:***************"
}