def push(tagNumber){
    echo "*****************: Docker push START:***************"
    sh "docker push akumar10605/k8s:latest"
    echo "*****************: Docker push END:***************"
}