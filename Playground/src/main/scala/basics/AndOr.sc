// Rewrite AND and OR without using the && and || operators

def and(x: Boolean, y: Boolean): Boolean = if (x) y else false
def or(x: Boolean, y: Boolean): Boolean = if (!x) y else true

println(and(x = true, y = true))
println(and(x = true, y = false))
println(and(x = false, y = true))
println(and(x = false, y = false))

println(or(x = true, y = true))
println(or(x = true, y = false))
println(or(x = false, y = true))
println(or(x = false, y = false))