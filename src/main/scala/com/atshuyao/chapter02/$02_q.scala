package com.atshuyao.chapter02
import scala.beans.BeanProperty
object $02_q {
  /**
   * #2、定义一个高阶函数，参数两个:Array,函数，通过传入的函数对Array进行过滤，保留符合我们要求的数据
   * Array(1,3,6,4,2,9)
   * =>
   * Array(6,4,2)
   **/

  def main(args: Array[String]): Unit = {
    var arr = Array(5, 4, 63, 62, 6)
    println(filter(arr, _ % 2 == 0).toBuffer)
    add(3)
  }

  def add(a: Int) {
    println("sheohe")
  }

  /**
   * 1.先写出流程
   * 2.练习整理简写规则
   * 3.整理笔记
   */
  var filter = (a: Array[Int], fun1: (Int) => Boolean) => {
    for (elem <- a if (fun1(elem))) yield {
      elem
    }


    //var ming = (x:Int) =>


  }

  //主构造器


}
class Person(a:Int){
  var name:String="ba"
  @BeanProperty var age:Int=19

}