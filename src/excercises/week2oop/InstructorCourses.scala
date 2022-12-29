package excercises.week2oop

object InstructorCourses {
  def main(args: Array[String]): Unit = {
    print("Begin")
    val nurik: Instructor = new Instructor(1, "Nurlan", "Hummatli")
    val courseOne: Course = new Course(1, "SQL", "2022", nurik)
    val courseTwo: Course = courseOne.copyCourse("2023")
  }
}

class Instructor(val id: Int, name: String, surname: String) {

  def fullName(): String = {
    val nameFirstLetter: Char = name.charAt(0).toUpper
    val surnameFirstLetter: Char = surname.charAt(0).toUpper
    val nameSurname: String = nameFirstLetter + name.substring(1) + " " + surnameFirstLetter + surname.substring(1)

    nameSurname
  }
}

class Course(courseID: Int, title: String, val releaseYear: String, instructor: Instructor) {

  def getId(): String = courseID.toString + instructor.id
  def isTaughtBy(instructor: Instructor) = instructor == this.instructor
  def copyCourse(newReleaseYear: String): Course = new Course(courseID, title, newReleaseYear, instructor)
}