// sum() returns a function that takes two integers and returns an integer
def sum(f: Int => Int, a: Int, b: Int): Int = {
  f(a) + f(b)
}

sum(x => x * 10, 2, 5)
