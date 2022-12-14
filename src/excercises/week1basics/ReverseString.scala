package excercises.week1basics

object ReverseString {
  def main(args: Array[String]) : Unit = {
    val word: String = "I like     Scala"

    def reverseString(word: String): Unit = {
      val reversedWord = word
        .trim()
        .split(raw"\s+")
        .reverse
        .mkString(" ")

      print(reversedWord)
    }

    reverseString(word)
  }
}
