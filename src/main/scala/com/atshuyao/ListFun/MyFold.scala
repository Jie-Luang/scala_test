package com.atshuyao.ListFun

import scala.collection.mutable

/**
 * 折叠
 */
object MyFold {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)

    val i = list.foldRight(10)((x,y)=>x-y)//10+4-3-2-1
    val j = list.foldLeft(1)((x,y)=>x-y)  //1+1-2-3-4
    println(i)
    println(j)

    val map1 = mutable.Map("a"->1,"b"->2,"c"->3)
    val map2 = mutable.Map("a"->4, "b"->5, "d"->6)

    val map3:mutable.Map[String,Int] = map2.foldLeft(map1){
      (map,kv) => {
        val k = kv._1
        val v = kv._2
        map(k) = map.getOrElse(k,0) + v
        map
      }
    }
    println("-"*20)
    println(map3)

  }

}
