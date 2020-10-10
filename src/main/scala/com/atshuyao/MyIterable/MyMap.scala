package com.atshuyao.MyIterable


object MyMap {
  def main(args: Array[String]): Unit = {
    var map1 = Map("a"->1,"b"->2,"c"->3)
    map1.+=("d"->4)
    map1.foreach((x)=>{print(x+"\t")})
    map1.+=("e"->5)
    println("")
    for (elem <- map1) {
      print(elem+"="+map1.get(elem._1).get+"\t")
    }

    map1.+=("f"->6)
    println("")
    map1.foreach((x)=>{print(x+"\t")})



    //map2.foreach((x)=>{println(x)})


  }

}
