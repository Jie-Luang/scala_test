package com.atshuyao.chapter02


/**
 * 得到数组中最大元素
 */

object test4 {
  def main(args: Array[String]): Unit = {
    var a=Array(1,3,5,6)
    println(reduceLeft(a))
  }

  var reduceLeft=(arr1:Array[Int]) => {
    var max:Int= arr1(0)
    for (elem <- arr1) {
      if(elem<max)  max
      else max = elem
    }
    max
  }:Int
}
