def push(tagNumber){
    echo "*****************: DOcker build START:***************"
    sh "docker push akumar10605/k8s:${tagNumber}"
    echo "*****************: DOcker build END:***************"
}