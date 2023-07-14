folder('seedjobs') {
    freeStyleJob('seedJobs/main') {
        label('master')
        scm {
            git {
                branch('dev')
                url('https://github.com/Gitesh-Jawale/SRE-Jenkins-JobDSL.git')
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
