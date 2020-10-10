package com.atshuyao.Translation

import com.atshuyao.Translation.$4_implicit4.Teacher
//$4继承于PersonTrait，但是PersonTrait里面怎么能调用$4里面定义的类，
//它的执行顺序时什么样？
trait PersonTrait{
}
object PersonTrait{
  //在另一个object中定义的class使用需要导包
  implicit class Person5(user:Teacher){
    def say():Unit={
      println("say...")
    }
  }
}

object $4_implicit4 extends PersonTrait {
  def main(args: Array[String]): Unit = {
    val teacher = new Teacher()
    teacher.eat()
    teacher.say()
  }
  class Teacher{
    def eat()={
      println("eating...")
    }
  }
}


