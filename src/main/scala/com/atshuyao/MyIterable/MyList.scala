package com.atshuyao.MyIterable

import scala.collection.immutable

object MyList {
  def main(args: Array[String]): Unit = {

    val list1 = 1::2::3::4::Nil
    val list2 = List(1,2,4)
    val list3:List[Int] = List(1,2,4,6)
    //list3.foreach(println)

    val list4 = List(8,9)
    var list7 = list4 :+(5)
    list7.foreach(println)

    val list5 = list3::list4    //相当于一个2维list
    val list6 = list3:::list4  //任然是一维
    //list5.foreach(println)
    //println(list5(0))
    //println(list6(0))
    //list3.foreach(println())
    //val list = list6.map(println)
    //println(list)

  }


}
