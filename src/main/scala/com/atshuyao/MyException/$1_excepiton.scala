package com.atshuyao.MyException

import scala.util.Try

object $1_exception {
  def main(args: Array[String]): Unit = {
    val list = List[String](
      "1,zhangsan,20,shenzhen",
      "lisi,30,shanghai",
      "2,wangwu,30,shanghai"
    )
    println(list.map(line =>{
      val arr = line.split(",")
      val age:Try[Int] = Try(arr(2).toInt)      //用try包裹，返回一个try对象
      age
    }).filter(_.isSuccess).map(_.get))
  }
}
