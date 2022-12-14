package lectures.week1basics

import scala.annotation.tailrec

object Recursion {
  def main(args: Array[String]) : Unit = {
    def factorial(n: Int) : Int = {
      if (n <= 0) 1
      else {
        println(s"Имеем число $n, для которого считаем факториал ${n-1}")
        var res = n * factorial(n-1)
        println(s"Вычислили факториал $n")

        res
      }
    }

    factorial(3)

    def factorialWithTailRecursion(n: Int) : Int = {
      @tailrec
      def loop(x: Int, accumulator: Int = 1): Int = {
        if (x <= 1) accumulator
        else loop(x-1, x*accumulator)
      }

      loop(n)
    }

    print(factorialWithTailRecursion(3))

    def repeatWord(word: String, n: Int) : String = {
      @tailrec
      def loop(i: Int, acc: String = word): String = {
        if (i <= 1) acc
        else loop(i-1, s"$word $acc")
      }

      loop(n)
    }

    println(repeatWord("one", 5))

    def powerOfTwo(n: Int): BigInt = {
      @tailrec
      def loop(x: Int = n, acc: BigInt = 2): BigInt = {
        if (x <= 1) acc
        else loop(x-1, acc * 2)
      }

      loop(n)
    }

    println(powerOfTwo(1))

    def increase(x: Int, y: Int, n: Int): Unit = {
      val sum: Int = x + y * n
      @tailrec
      def loop(num: Int = sum, acc: String = ""): String = {
        if (num == 0) acc + "is the result"
        else loop(num/10, acc + sum.toString + " ")
      }

      print(loop(sum))
    }

    increase(10, 1, 5)

  }
}
