package exercises

object Calculator {
  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0
    else a + sumInts(a + 1, b)

  def sumCube(a: Int, b: Int): Int =
    if (a > b) 0
    else a * a * a + sumCube(a + 1, b)

  def sumFactorial(a: Int, b: Int): Int = ???


  //implement here for sum function


  //

  def productInts(a: Int, b: Int): Int =
    if (a > b) 1
    else a * productInts(a + 1, b)

  def productCubes(a: Int, b: Int): Int = ???

  def productFactorials(a: Int, b: Int): Int = ???


  //implement here for product function


  //

}
