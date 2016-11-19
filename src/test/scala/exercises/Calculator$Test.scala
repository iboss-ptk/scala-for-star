package exercises

import org.scalatest.{Matchers, FunSuite}

class Calculator$Test extends FunSuite with Matchers {


  test("should return sum of all numbers") {
    val expected = 2 + 3 + 4
    Calculator sumInts(2,4) should equal (expected)
  }

  test("should return sum of cube of each number") {
    val expected = 2*2*2 + 3*3*3 + 4*4*4
    Calculator sumCube(2,4) should equal (expected)
  }

  test("should return sum of factorial of each number") {
    val expected = 2*1 + 3*2*1 + 4*3*2*1
    Calculator sumFactorial(2,4) should equal (expected)
  }






}
