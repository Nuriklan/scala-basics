package excercises.week2oop

object LogSystem {
  def main(args: Array[String]): Unit = {
    val logger = new Logger
  }
}

class Logger(val msgNum: Int = 0) {

  def info(): Logger = {
    println("INFO New Message")
    new Logger(msgNum + 1)
  }

  def info(msgCount: Int): Logger = {
    if (msgCount <= 0) this
    else info().info(msgCount - 1)
  }

  def print = println(msgNum)
}
