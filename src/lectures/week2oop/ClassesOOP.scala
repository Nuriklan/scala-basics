package lectures.week2oop

object ClassesOOP {
  class SomeClass(a: Int, b: Int, val c: Int) {

    def this(a: Int, b: Int) = this(a, b, 0)
    def this() = this(1, 2, 3)

    def someFunc(): Int = b

    val employee = new Employee()
    println(s"${employee.name}'s salary is ${employee.salary}")
  }

  class Employee(val name: String, var salary: Double) {
    def this() = this("John's", 0.0)
  }
}
