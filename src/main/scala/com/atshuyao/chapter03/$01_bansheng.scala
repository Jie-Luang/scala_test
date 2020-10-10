package com.atshuyao.chapter03

import scala.beans.BeanProperty

class Animal{
  @BeanProperty var score:Long=_     //表示给属性一个默认值
  //var name:String=null
  def this(name:String,score:Long){
    this()
    this.score=score
  }
  @BeanProperty var name:String=_

  Animal.eat
}

object Animal {
  @BeanProperty var name:String = "ss"

  def apply(name:String,score:Long)= {
    if(score>20){
      this.name="wangwu"
    }else{
      this.name="maliu"
    }
    new Animal()
  }


  def eat: Unit ={
    println("aaaaaaaaaaaa"*4)
  }
}
object Test{
  def main(args: Array[String]): Unit = {
    //println(Animal.name)
    val animal = Animal("zhaosi",33)
    println(animal.name)

  }
}
