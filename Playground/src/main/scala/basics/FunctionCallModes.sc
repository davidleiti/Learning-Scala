def loop(x: Int): Int = {
  loop(x)
  x
}

def returnFirst(x: Int, y: => Int): Int = x

returnFirst(2, loop(3)) // this is fine, y is passed by name
// i.e. it is only computed when needed

// this causes stack overflow error, x is passed by value
// i.e. loop(3) is evaluated before entering the function body
// causing infinite calls
// returnFirst(loop(3), 2)

def returnSum(x: => Int, y: => Int): Int = x + y

val sum = returnSum(2, 3) // fine, obviously

// stack overflow, this time y is computed as well since we
// need to access its value
val sum = returnSum(2, loop(3))