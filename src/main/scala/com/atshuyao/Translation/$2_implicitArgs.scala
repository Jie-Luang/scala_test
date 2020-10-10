package com.atshuyao.Translation

/**
 * 隐式参数
 */
object $2_implicitArgs {
  //隐式参数优先于默认参数
  //如果默认参数是也是隐式参数，调用可以直接使用方法名，不用括号
  implicit  val str:String = "hello world!"
  implicit val ss:Int=3
  def hello(implicit arg:String="good bye world") :Unit={
    println(arg)
  }
  def show( aa:String="just test")={
    println(aa)
  }

  def main(args: Array[String]): Unit = {
    hello
    show()
  }
}
