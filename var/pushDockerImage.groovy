#!usr/bin/env groovy

def pushDockerImage(imageName, registryUrl, credentialsId) {
    script {
        docker.withRegistry(registryUrl, credentialsId) {

          dockerImage.push()
        }
    }
}
