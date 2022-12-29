package excercises.week2oop

import scala.annotation.tailrec

object LinkedList {
  def main(args: Array[String]): Unit = {
    val list = new Log("INFO_1", new Log("INFO_2", new Log("INFO_3", Empty)))
    println(list.previous.last)
    println(list.all)
  }
}

abstract class LogList {

  def isEmpty: Boolean
  def last: String
  def all: String
  def previous: LogList
  def add(msg: String): LogList
}

class Log(head: String, tail: LogList) extends LogList {
  override def add(msg: String): LogList = new Log(msg, this)

  override def isEmpty: Boolean = false
  override def last: String = this.head
  override def previous: LogList = this.tail

  override def all: String = {
    @tailrec
    def loop(list: LogList, acc: String): String = {
      if (list.previous.isEmpty) acc + list.last
      else loop(list.previous, acc + list.last + " ")
    }
    loop(this, "")
  }
}

object Empty extends LogList {

  override def add(msg: String): LogList = new Log(msg, Empty)

  override def isEmpty: Boolean = true
  override def last: String = throw new NoSuchElementException
  override def previous: LogList = throw new NoSuchElementException

  override def all: String = ""
}