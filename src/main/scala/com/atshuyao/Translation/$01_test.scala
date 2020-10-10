package com.atshuyao.Translation

/**
 * 隐式函数
 * @param self
 */
class MyRichInt(val self:Int){
  def myMax(i:Int):Int = {
    if (self < i) i else self
  }

  def myMin(i:Int):Int = {
    if (self < i) self else i
  }
}

object $01_test {
  implicit def convert(arg:Int):MyRichInt = {
    new MyRichInt(arg)
  }

  def main(args: Array[String]): Unit = {
    println(2.myMax(6))

  }
}
