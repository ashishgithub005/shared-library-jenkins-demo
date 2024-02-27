def checkout(){
    echo "*****************: Git Checkout START:***************"
    git branch: 'main', url: 'https://github.com/ashishgithub005/k8s-demo.git'
    echo "*****************: Git Checkout END:***************"
}