package com.atshuyao.MyIterable

import scala.collection.mutable.ListBuffer

/*object $01_test {
  def main(args: Array[String]): Unit = {
    //不可变，无法再改变List大小
    val immutableList:List[Int] = List(1,2,4,6,8)

    //修改不可变，重写创建List
    val newImmutableList: List[Int] = 0+:immutableList

    println(immutableList)
    println(newImmutableList)

    //可变集合
    val mutableList:ListBuffer[Int] = ListBuffer(1,2,4,6)
    //对可变List进行修改
    val newMutableList:ListBuffer[Int] = 0+:mutableList

    println(newMutableList)
    mutableList.insert(4,5)
    println(mutableList)

  }



}*/
trait ConsoleLogger{
  def log(msg:String){println(msg)}
}
class SavingSAccount extends ConsoleLogger{
  var balance:Double=5
  def withdraw(amount:Double): Unit ={
    if(amount > balance) log("Insufficient funds")
    else balance -= amount
  }
}
object SavingSAccount{
  def main(args: Array[String]): Unit = {
    def apply(): SavingSAccount = new SavingSAccount()
    var s1 = apply()
    s1.withdraw(10)
  }


}