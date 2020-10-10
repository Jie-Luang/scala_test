package com.atshuyao.leetcodeTest

/**
 * 用数组中的数字组成一个最大的数字
 * Array(3,30,5,6,43)
 * 结果：654330
 */
object Test1 {
  def main(args: Array[Int]): Unit = {
    var arr=Array(3,30,5,6,43)
    var numLength: Array[Any] = orderMax(arr).map(x=>x.pow())


  }
  def orderMax(arr:Array[Int])={
    val strings: Array[String] = arr.map(x=>x.toString)
    strings.map(x=>x.length)
  }
}
