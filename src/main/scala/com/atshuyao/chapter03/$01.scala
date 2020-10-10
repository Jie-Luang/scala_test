package com.atshuyao.chapter03
import scala.beans.BeanProperty

class Person(aaa:Int){
  //var bbb:Int=_
  var name:String="dasa"
  @BeanProperty var sex:String = "male"

  def this(aaa:Int,name:String){
    this(aaa)
    this.name = name
  }
}

object $01 {
  def main(args: Array[String]): Unit = {
    val person: Person = new Person(11)
    var p3:Person = new Person(14)
    println(person.name)
    println(person.getSex)
    var a = person
    p3.getSex

  }
}
