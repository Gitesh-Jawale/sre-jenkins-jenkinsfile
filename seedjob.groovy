folder('seedjobs') {
    freeStyleJob('seedJobs/main') {
        label('master')
        scm {
            git {
                branch('master')
                remote {
                    url('https://github.com/your-username/your-repo.git')
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
