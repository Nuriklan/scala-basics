package lectures.week2oop

object ObjectsOOP {
  object Number {
    val Pi = 3.14
  }

  class AnotherNumber

  def main(args: Array[String]): Unit = {
    println(Number.Pi)

    val numOne = Number
    val numTwo = Number
    print(numOne == numTwo)
  }
}
