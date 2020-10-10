package com.atshuyao.MyIterable

import scala.collection.mutable.ArrayBuffer

object Array01 {
  def main(args: Array[String]): Unit = {
    val arr01 = new Array[Int](4)
    val arr2 = ArrayBuffer(0,1,2)
    val arr3 = Array(100,200)
    //println(arr01.length)
    arr01.++:(arr3)

    arr01(3)=10
    arr2.update(0,1)  //给第0个赋值1
    arr2.+:(3)

    println(arr01.zip(arr2).toBuffer)


    //println(arr01.mkString("--"))//遍历

    /*for (elem <- arr01) {  //普通遍历
      println(elem)
    }*/

    /*def printx(elem:Int) : Unit = {
      println(elem)
    }*/
    //arr01.foreach((x) =>(printx(x)))

    println(arr2(2))
    //4.增加元素
    val ints:Array[Int] = 5 +: arr01    //从头加
    val ints1:Array[Int] = ints :+ 6    //从尾加
    //arr2.foreach(println(_))
    println(arr01.size)
    println(arr01.length)
  }

}
