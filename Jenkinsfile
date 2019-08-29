node {
    stage('download source')
    git 'https://github.com/gmdbmonolithrefactor/gmdb-discovery-svc.git'

    stage('gradle build and test')
    sh label: '', script: './gradlew build'

    stage('archiving jar file')
    archiveArtifacts 'build/libs/*.jar'

    stage('building docker image')
    sh label: '', script: 'docker build -t gmdb/gateway:${env.BUILD_NUMBER} .'
}