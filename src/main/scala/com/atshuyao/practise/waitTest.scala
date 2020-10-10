package com.atshuyao.practise

import java.text.SimpleDateFormat

import scala.io.{BufferedSource, Source, StdIn}

/**
 * 需求: 每个区域的平均等客时间[每个区域所有司机的等客时间平均值]
 */
object waitTest {
  def main(args: Array[String]): Unit = {
    val str: BufferedSource = Source.fromFile("d:/aaa/waitTest")
    val arr:Array[String] = str.getLines().toArray
    def dateToLong(dateStr:String)= {
      val format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
      val date = format.parse(dateStr)
      date.getTime      //取时间部分
    }
    //arr.foreach(println)
    val stringses: Array[Array[String]] = arr.map {
      x => x.split("\t")
    }
    for (elem <- stringses) {
      dateToLong(elem(3))
      dateToLong(elem(4))
      println(elem.toBuffer)
    }
    println("-"*30)
    //按司机分组
    val stringToArray: Map[String, Array[Array[String]]] = stringses.groupBy(_(0))
    //flatMap，按时间排序，压平转化为List

    //滑窗，（数据条数-1，1）
    //时间相减，取站名，返回元组




  }
}
