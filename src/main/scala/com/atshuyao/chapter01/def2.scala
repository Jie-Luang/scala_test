package com.atshuyao.chapter01

object def2 {
  val sum = (x: Int, y: Int, z: Int) => x + y + z

  val sum1 = (x: Int) => {
    y: Int => {
      z: Int => {
        x + y + z
      }
    }
  }

  val sum2 = (x: Int) => (y: Int) => (z: Int) => x + y + z

  def sum3(x: Int)(y: Int)(z: Int) = x + y + z


  def main(args: Array[String]): Unit = {
    def factorial(n: Int): Int = {
      def go(n: Int, acc: Int): Int =
        if (n <= 0) acc
        else go(n - 1, n * acc)

      go(n, 1)
    }
    //斐波那契数列
    var count=1
      def feibo(m: Int): Int = {
        if(m==1)
          count = 1
        else  {
          count+feibo(m)
          m-1
        }
        return count
    }
    println(feibo(2))

  //println(factorial(10))












  }
}
