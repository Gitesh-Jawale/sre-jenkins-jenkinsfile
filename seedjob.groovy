folder('seedjobs') {
    freeStyleJob('seedJobs/main') {
        scm {
            git {
                branch('dev')
                remote {
                    url('https://github.com/Gitesh-Jawale/SRE-Jenkins-JobDSL.git')
                }
            }
        }
        steps {
            dsl {
                external('JobDSL/*/folders.jenkins')
                external('JobDSL/**/*_job.jenkins')
            }
        }
    }
}
