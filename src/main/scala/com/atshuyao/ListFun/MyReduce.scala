package com.atshuyao.ListFun

object MyReduce {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)
    val i:Int = list.reduce((x,y)=>x-y)   //默认reduceLeft
    val j:Int = list.reduceLeft((x,y)=>x-y)   //1-2-3-4
    val k:Int = list.reduceRight((x,y)=>x-y)  //4-3-2-1
    println("i="+i)
    println("j="+j)
    println("k="+k)
  }

}
