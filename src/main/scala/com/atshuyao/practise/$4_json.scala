package com.atshuyao.practise

import com.alibaba.fastjson.JSON
import scala.io.Source

/**
 *
 */
object $4_json {

  def main(args: Array[String]): Unit = {

    val source = Source.fromFile("D:\\Program Files\\feiq\\Recv Files\\Thinkpad(54EE75F8C035)\\作业\\pmt.json","utf-8")
    val array = source.getLines().toArray
    var sfile = for (elem <- array) yield{
      val nObject = JSON.parseObject(elem)
      nObject
    }
    val initData = for (elem <- sfile if elem != null) yield{
      var ip = elem.getString("ip")
      var requestmode = elem.getString("requestmode")
      var processnode = elem.getString("processnode")
      ("ip:"+ip+",requestmode:"+requestmode+",processnode:"+processnode)
      //println(elem)
    }
    initData(0)



  }
}
