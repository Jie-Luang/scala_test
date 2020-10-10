package com.atshuyao.MyIterable

object YuanZu {
  def main(args: Array[String]): Unit = {
    val tuple:(Int,String,Boolean)=(40,"bb",true)
    println(tuple.productElement(2))

    for (elem <- tuple.productIterator) {
      println(elem)
    }
  }


}
