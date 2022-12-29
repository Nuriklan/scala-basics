package lectures.week2oop

object Inheritance {
  class Person {
    def greet: String = "Hello"
  }

  class Student extends Person

  def main(args: Array[String]): Unit = {
    val student = new Student
    println(student.greet)
  }
}