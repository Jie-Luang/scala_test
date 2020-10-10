package com.atshuyao.myTrait

import scala.math.Ordered
import java.awt.Point
object OrderedPoint{
  def main(args: Array[String]): Unit = {
    def apply(): OrderedPoint = new OrderedPoint()
    var p = apply()
    p.setLocation(10,5)
    println(p.compare(new Point(3, 3)))


  }

}
class OrderedPoint extends Point with Ordered[Point]{
  override def compare(that: Point): Int ={
    if (that.x <= (this.x)*(this.x) && that.y < (this.y)*(this.y)) 0
    else 1
  }
}

