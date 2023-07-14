folder('seedjobs') {
    freeStyleJob('seedJobs/main') {
        label('master')
        scm {
            git {
                branch('master')
                url('https://github.com/your-username/your-repo.git')
            }
        }
        steps {
            dsl {
                external('jobdsl/*/folders.jenkins')
                external('jobdsl/**/*_job.jenkins')
            }
        }
    }
}
