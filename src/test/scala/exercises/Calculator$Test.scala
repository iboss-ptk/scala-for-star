package exercises

import org.scalatest.{Matchers, FunSuite}

class Calculator$Test extends FunSuite with Matchers {


  /*
  * Sum of the integers!!!
  * */

  test("should return the sum of the integers between expected numbers") {
    val expected = 2 + 3 + 4
    Calculator sumInts(2,4) should equal (expected)
  }

  test("should return the sum of cube of all the integers between expected numbers") {
    val expected = 2*2*2 + 3*3*3 + 4*4*4
    Calculator sumCube(2,4) should equal (expected)
  }

  test("should return the sum of factorials of all integers between expected numbers") {
    val expected = 2*1 + 3*2*1 + 4*3*2*1
    Calculator sumFactorial(2,4) should equal (expected)
  }

  /*
  * Product of the integers!!!
  * */

  test("should return the product of the integers between expected numbers") {
    val expected = 2 * 3 * 4
    Calculator productInts (2,4) should equal (expected)
  }

  test("should return the product of cube of all the integers between expected numbers") {
    val expected = (2*2*2) * (3*3*3) * (4*4*4)
    Calculator productCubes (2,4) should equal (expected)
  }

  test("should return the product of factorials of all integers between expected numbers") {
    val expected = (2*1) * (3*2*1) * (4*3*2*1)
    Calculator productFactorials (2,4) should equal (expected)
  }

  /*
  * Using Higher Order Function
  * */

  test("should return the sumHOF of the integers between expected numbers") {
    val expected = 2 + 3 + 4
    Calculator sumIntsHOF (2,4) should equal (expected)
  }

  test("should return the sumHOF of cube of all the integers between expected numbers") {
    val expected = 2*2*2 + 3*3*3 + 4*4*4
    Calculator sumCubesHOF (2,4) should equal (expected)
  }

  test("should return the sumHOF of factorials of all integers between expected numbers") {
    val expected = 2*1 + 3*2*1 + 4*3*2*1
    Calculator sumFactorialsHOF (2,4) should equal (expected)
  }




}
