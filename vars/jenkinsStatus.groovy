// vars/jenkinsStatus.groovy
def call() {
    def jenkins = jenkins.model.Jenkins.instance
    def status = jenkins.isQuietingDown() ? 'Going to shut down' : 'Running'
    echo "Jenkins status: ${status}"
}
