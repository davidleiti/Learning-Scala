package basics

class MyClass(x: Int, y: Int) {
  require(y > 0, "y must be positive")

  def this (x: Int) = this(x, x + x)

  def nb1: Int = {
    println("\tnb1()")
    x
  }

  def nb2: Int = {
    println("\tnb2()")
    y
  }

  private def test(a: Int): Int = {
    println("\ttest()")
    a + 10
  }

  val nb3: Int = {
    println("\tnb3()")
    x + y
  }

  override def toString: String = (x + y).toString
}

object Run {
  val instance = new MyClass(2, 3)
  println(instance.nb1)
  println(instance.nb1)
  println(instance.nb1)
  println(instance.nb2)
  println(instance.nb2)
  println(instance.nb2)
  println(instance.nb3)
  println(instance.nb3)
  println(instance.nb3)
}
