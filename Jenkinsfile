
// This calls vars/tools.groovy, which is in the JenkinsTest git repository.
// It's defined as a Global Library in Jenkins. (Manage Jenkins/Configure System)

tools.info 'Starting'
tools.warning 'Nothing to do!'

def stage(String label, Closure cl) {
  println "The stage is ${label}"
  cl()
  println "Exiting the stage"
}

stage('Say Hello World') {
  println 'Hello World'
}

tools 'Joe'
tools() /* invoke with default arguments */

// Try and use a src lib:

def c = new utils()
c.hello()
c.runCommand("df -h")

