# Jenkins Shared Library: jenkins-library

This Jenkins Shared Library contains two functions:
- `helloJenkins`: Prints "Hello Jenkins".
- `jenkinsStatus`: Displays whether Jenkins is in quiet mode.

```groovy
(Root directory of the library)
├── vars
│   └── helloJenkins.groovy
|   |__ jenkinsStatus.groovy
├── src
└── README.md


## Usage in a Jenkins Pipeline

To use this library in a Jenkins pipeline, add the following:

### Example Pipeline Script:
```groovy
@Library('jenkinsLibrary') _

pipeline {
    agent any

    stages {
        stage('Hello Jenkins') {
            steps {
                script {
                    jenkins.helloJenkins()
                }
            }
        }

        stage('Display Jenkins Status') {
            steps {
                script {
                    jenkins.jenkinsStatus()
                }
            }
        }
    }
}
