def mavenBuild(){
    echo "*****************: Maven Build START:***************"
    sh "mvn clean install"
   echo "*****************: Maven Build END:***************"
}
