package exercises

object Calculator {
  def sumInts(a: Int, b: Int): Int =
    if (a > b) 0
    else a + sumInts(a + 1, b)

  def sumCube(a: Int, b: Int): Int =
    if (a > b) 0
    else cube(a) + sumCube(a + 1, b)

  def sumFactorial(a: Int, b: Int): Int =
    if (a > b) 0
    else factorial(a) + sumFactorial(a + 1, b)

  def factorial(a: Int): Int =
    if (a == 0) 1
    else a * factorial(a - 1)

  def cube(a: Int): Int = a * a * a


  //implement sum using higher order function
  def sum(f: Int => Int, a: Int, b: Int): Int = ???

  def sumFactorialsHOF(a: Int, b: Int): Int = ???

  def sumCubesHOF(a: Int, b: Int): Int = ???

  def sumIntsHOF(a: Int, b: Int): Int = ???


  //implement sum using currying syntax


  //implement product using currying syntax


  // implement product for each function
  def productInts(a: Int, b: Int): Int = ???

  def productCubes(a: Int, b: Int): Int = ???

  def productFactorials(a: Int, b: Int): Int = ???


  //implement here for product function
  //find common pattern of sum and product and implement mapReduce


  //

}
