package com.atshuyao.MyMatch

import scala.collection.immutable.Map
import scala.collection.{Map, mutable}
import scala.collection.parallel.immutable

/**
 * 匹配list内部元素
 * 两种方式
 * 1：按照一定的规则匹配
 * 2：直接挨个匹配
 */
object $1_listMatch {
  def main(args: Array[String]): Unit = {
    //匹配list
    /*val list:List[Int] = List(1,2,4,6,9)
    list match {
      case first::second::rest::aa=> println(first+"-"+second+
      "-"+rest+"-"+aa)
      case _ => println("something else")
    }*/

    //匹配Array
    val arr:Array[Any] = Array(true,1,"hello")
    arr match {
      case Array(_,1,_*) => println("success")
      case Array(x,y,z) => println("sange")
      case a:Array[Any] => println("sss")
      case _ => "failed"
    }

    //匹配Map里面的元素
    val m1 = mutable.Map[Int,String]((1,"zhao"),(2,"song"))
    for ((k,v) <- m1 if k==1) {
      println(k+"->"+v)
    }
    println("-"*20)
    //匹配Map的类型
    /*m1 match {
      case x:mutable.Map[String,Int] => println("failed")
      case x:mutable.Map[Int,String] => println("success")
      //case x: _ => println("sssss")
    }*/

  }
}
