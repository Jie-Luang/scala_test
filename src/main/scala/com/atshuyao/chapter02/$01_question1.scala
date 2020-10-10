package com.atshuyao.chapter02

object $01_question1 {
  def main(args: Array[String]): Unit = {

    //计数
    val F= (str: Array[String]) =>{
      for (elem <- str) yield{
        elem.size
      }
    }

    def q1(asu:Array[String] => Array[Int],arr: String*)={
        F(arr.toArray)
    }

    println(q1(F, "hello", "word", "hadoop", "python").toBuffer)
    //var arr:Array[String]=new Array[String]{"hello","word","hadoop","python"}
    //println(q1(F,"hello","word","hadoop","python"))
  }

}
