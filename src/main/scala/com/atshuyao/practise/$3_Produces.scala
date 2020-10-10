package com.atshuyao.practise

import scala.io.Source

/**
 * 1、求出哪些省份没有农产品市场
 * 2、获取农产品种类最多的三个省份
 * 3、获取每个省份农产品最多的三个农贸市场
 */
object $3_Produces {
  def main(args: Array[String]): Unit = {
    val provinces = Source.fromFile("D:\\atguigu\\Thinkpad\\scala_sql\\allprovince.txt","utf-8")
    val proarr = provinces.getLines().toArray
    val product = Source.fromFile("D:\\atguigu\\Thinkpad\\scala_sql\\product.txt","utf-8")
    val listPro = product.getLines().toArray
    /*println(proarr.toBuffer)
    println(listPro.toBuffer)*/

    val lines = listPro.map {
      a => a.split("\t")
    }
    /*for (elem <- lines) {
      println(elem.toBuffer)
    }*/
    val p1 = lines.filter(_.length==6).map(_(4))      //取出省份
    val groupPro = p1.groupBy(x=>x).toArray
    val tuples = groupPro.map {               //各个省份的农产品种类数
      x =>
        x._2.size
        (x._1, x._2.size)
    }
    tuples.sortWith((x,y) => x._2>y._2)
    //println(tuples.toBuffer)

    val p2: Array[String] = p1.distinct
    //p2.foreach(println)       //有农副产品的省份
    val result1 = proarr.diff(p2)     //没有农副产品的身份
    println("没有农副产品的省份："+result1.toBuffer)

  }
}
