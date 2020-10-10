package com.atshuyao.MyMatch

import scala.io.StdIn

object TypeMatch {
  def main(args: Array[String]): Unit = {
    val A: String = "hello world"
    /*val str = StdIn.readLine()
    str match {
      case  A if A.contains("hello") => println("hello world")
      case _ => println("something else")
    }*/

    pp(3,2)

    var c:Array[Int] = Array(3,5,6)
    println("array"+c(2))
    var d:List[Int] = List(5,6,8)
    println("list"+d(2))
    var e:Set[Int] = Set(9,0,7)
    var f=(3,5)
    println("yuanzu"+f._2)
    var g:Map[String,Int] = Map(("a"->2),("b",3))
    println(g.get("a").getOrElse(0))
    println(g.getOrElse("b", 0))

  }
  def pp(a:Any): Unit ={
    a match{
      case x:String => println(s"${}x}sss")
      case y:Double => println("aa")
      case _ => println("cc")
    }
  }
}
