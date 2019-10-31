val EPSILON = 0.001
val INITIAL_ESTIMATION = 1

def isGoodEnough(guess: Double, value: Double): Boolean =
  Math.abs(guess * guess - value) / value < EPSILON

def improve(guess: Double, value: Double): Double =
  (guess + value / guess) / 2

@scala.annotation.tailrec
def sqrtIter(guess: Double, value: Double): Double =
  if (isGoodEnough(guess, value)) guess
  else sqrtIter(improve(guess, value), value)

def sqrt(value: Double) = sqrtIter(INITIAL_ESTIMATION, value)

sqrt(2)
sqrt(4)
sqrt(0.001)
sqrt(0.1e-20)
sqrt(1.0e20)
sqrt(1.0e50)
