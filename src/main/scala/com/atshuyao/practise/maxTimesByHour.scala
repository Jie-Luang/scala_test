package com.atshuyao.practise


import java.text.SimpleDateFormat

import scala.io.Source

/**
 * 求得每个用户一小时内最大的登录次数
 */
object maxTimesByHour {

  //1.计算相邻两条的毫秒值差
  //2.map(for(从当前
  def main(args: Array[String]): Unit = {
    val lines = Source.fromFile("D:\\atguigu\\Thinkpad\\scala_sql\\LoginTimes.txt").getLines().toArray
    val splitData = lines.map(line => {
      val arr = line.split(",")
      val userid = arr.head
      val time = DateToLong(arr.last)
      (userid, time)
    })
    val grouped: Map[String, Array[(String, Long)]] = splitData.groupBy(x=>x._1)
    /*grouped.map(x=>{

    })*/

    println(Array(1, 7, 2, 9).sorted.toBuffer)



  }

  def DateToLong(d:String)={   //将时间转化为毫秒long值
    val format1 = new SimpleDateFormat("yyyy-MM-dd DD:mm:ss")
    val time = format1.parse(d).getTime
    time
  }

}
