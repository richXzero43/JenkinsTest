def mainMethod(Closure body) {
    println "enter"
    body() // this executes the closure, which you passed when you called `mainMethod() { ... }` in the scripted pipeline
    println "exit"
}