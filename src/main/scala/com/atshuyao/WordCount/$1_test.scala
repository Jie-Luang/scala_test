package com.atshuyao.WordCount

object $1_test {
  def main(args: Array[String]): Unit = {
    val stringlist = List("hello scala hbase kafka","hello scala hbase","hello scala","hello")
    val wordList:List[String] = stringlist.flatMap(str=>str.split(" "))
    for (elem <- wordList) {
      println(elem)
    }
    //分组
    val wordToWordsMap:Map[String,List[String]] = wordList.groupBy(word=>word)
    println(wordToWordsMap)
    //计数
    val wordToCountMap = wordToWordsMap.map(tuple => (tuple._1,tuple._2.size))
    println(wordToCountMap)

    //排序,sortWith(true:降序)
    val sortList = wordToCountMap.toList.sortWith {
      (left, right) => {
        left._2 > right._2
      }
    }
    val resultList = sortList.take(3)
    println(resultList)

  }

}
