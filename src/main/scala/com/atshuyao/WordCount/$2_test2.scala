package com.atshuyao.WordCount

object $2_test2 {
  def main(args: Array[String]): Unit = {
    val tupleList = List(("hello scala spart world",4),("hello scala spart",3),("hello scala",2),("hello",1))
    val stringses = tupleList.flatMap{
      x => {
        var strings:Array[String] = x._1.split(" ")
        strings.map(c=>(c,x._2))
      }
    }
    println(stringses)
    val list3 = stringses.groupBy(x => (x._1))
    println(list3)
    val list4 = list3.map(t => {
      (t._1, t._2.map(t1 => t1._2))
    })
    println(list4)

    val list5 = list4.map(x => (x._1, x._2.fold(0)(
      (agg, curr) => {
        agg + curr
      })
    )
    )
    println(list5)






  }

}
