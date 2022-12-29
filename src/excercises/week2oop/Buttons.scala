package excercises.week2oop

object Buttons {

  def main(args: Array[String]): Unit = {
    val justButton = new Button()
    println(justButton.click())

    val rndButton = new RoundedButton()
    println(rndButton.click())

    println(Int.MaxValue)
    println(Int.MaxValue + 1)
  }
}

class Button(val label: String) {

  def this() = this("test")
  def click(): String = s"button -${label}- has been clicked"
}

class RoundedButton extends Button {

  override def click(): String = s"rounded ${super.click()}"
}