def call(String projectName,String imageTag){
    withCredentials([usernamePassword('credentialsId':"dockerhub-token",passwordVariable:"dockerhubPass",usernameVariable:"dockerhubUser")]){
            sh "docker login -u ${env.dockerhubUser} -p ${env.dockerhubPass}"
            sh "docker push ${env.dockerhubUser}/${projectName}:${imageTag}"
        }
}
