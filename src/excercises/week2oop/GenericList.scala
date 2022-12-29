package excercises.week2oop

import scala.annotation.tailrec

object GenericList:
  def main(args: Array[String]): Unit = {
    val list = new LogG[String]("INFO_1", new LogG("INFO_2", new LogG("INFO_3", EmptyG)))
    println(list.previous.last)
    println(list.all)
  }


abstract class LogListG[String] {

  def isEmpty: Boolean
  def last: String
  def all: String
  def previous: LogListG[String]
  def add(msg: String): LogListG[String]
}

class LogG[String](head: String, tail: LogListG[String]) extends LogListG[String] {
  override def add(msg: String): LogListG[String] = new LogG(msg, this)

  override def isEmpty: Boolean = false
  override def last: String = this.head
  override def previous: LogListG[String] = this.tail

  override def all: String = {
    def loop(list: LogListG[String], acc: String): String = {
      if (list.previous.isEmpty) acc + list.last
      else loop(list.previous, acc + list.last + " ")
    }
    loop(this, "")
  }
}

object EmptyG extends LogListG[String] {

  override def add(msg: String): LogListG[String] = new LogG(msg, EmptyG)

  override def isEmpty: Boolean = true
  override def last: String = throw new NoSuchElementException
  override def previous: LogListG[String] = throw new NoSuchElementException

  override def all: String = ""
}