package exercises

object Calculator {
  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0
    else a + sumInts(a + 1, b)

  def sumCube(a: Int, b: Int): Int =
    if (a > b) 0
    else a * a * a + sumCube(a + 1, b)

  def sumFactorial(a: Int, b: Int): Int = ???

}
