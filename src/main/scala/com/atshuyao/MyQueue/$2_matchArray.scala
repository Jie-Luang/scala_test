package com.atshuyao.MyQueue

/**
 * 匹配数组，
 * 匹配符合条件的数组
 */
object $2_matchArray {
  def main(args: Array[String]): Unit = {
    for(arr <- Array(Array(0),Array(1,0),Array(0,1,0),Array(1,1,0)
    ,Array(1,1,0,1),Array("hello",90))){
      val result = arr match{
        case Array(0) => "0"
        case Array(x,y) =>x+","+y
        case Array(0,_*) => "begin with 0"
        case _ => "something else"
      }
      println("result = " + result)
    }
  }
}
