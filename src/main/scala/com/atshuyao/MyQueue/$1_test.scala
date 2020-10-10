package com.atshuyao.MyQueue

import scala.collection.mutable

object $1_test {
  def main(args: Array[String]): Unit = {




    /*val que = new mutable.Queue[String]()
    que.enqueue("a","b","c")
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())*/


println(describe(List(1,2,3,4,5)))    //泛型擦除
println(describe(5))
    println(describe(Array(1,2,4)))
    println(describe(Array("abd")))   //保留泛型，数组例外

  }
  def describe(x:Any) = x match {
    case i:Int =>"int"
    //case 5 => "hello five"
    case s:String =>"String hello"
    case m:List[_]=>"list"
    case c:Array[Int] => "Array[Int]"
    case someThing => "something else"+ someThing
  }
}
