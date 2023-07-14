pipeline {
    agent any
    
    stages {
        stage('Job DSL Execution') {
            steps {
                git branch: 'dev', url: 'https://github.com/Gitesh-Jawale/SRE-Jenkins-JobDSL.git'
                dsl {
                    external('JobDSL/*/folders.jenkins')
                    external('JobDSL/**/*_job.jenkins')
                }
            }
        }
    }
}
