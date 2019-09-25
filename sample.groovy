pipelineJob('DSL_Pipeline_Demo') {
  definition {
    cpsScm {
      scm {
        git {
              remote {
                  github('vidu19/jenkins_demo', 'https')
              }
              branch('master')
          }
    	}
      scriptPath('Jenkinsfile')
      
    }
  }
}
