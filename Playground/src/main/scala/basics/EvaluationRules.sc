def example = 2         // evaluated when called
val example = 2         // evaluated immediately
lazy val example = 2    // evaluated once when needed

def square(x: Double)    // call by value
def square(x: => Double) // call by name

// bindings is a sequence of int, containing a varying # of arguments
def myFct(bindings: Int*): Unit = {}
