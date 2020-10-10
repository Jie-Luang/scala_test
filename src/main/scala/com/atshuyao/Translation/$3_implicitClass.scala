package com.atshuyao.Translation

/**
 * 隐式类
 */

object $3_implicitClass {
  //声明在“类”，“伴生对象”，“包对象”中，不能为top_level objects
  //隐式类有且只能有一个参数
  implicit class MyRichInt(arg:Int){
    def myMax(i:Int):Int={
      if(arg < i) i else arg
    }

    def myMin(i:Int) = {
      if (arg < i) arg else i
    }
  }
  def main(args: Array[String]): Unit = {
    println(1.myMax(3))
  }
}
