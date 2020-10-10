package com.atshuyao.myTrait

import java.io._

import scala.beans.BeanProperty

object $02_seltTwo {
   trait ReadAndWriteObject{
     this:Serializable =>
     //从磁盘读
     def read()={
       val Ois = new ObjectInputStream(new FileInputStream("D:/aaa/bbb.txt"))
       val obj = Ois.readObject()
       Ois.close()
       obj
     }
     //对象写入磁盘
     def write()={
       val oos = new ObjectOutputStream(new FileOutputStream("D:/aaa/bbb.txt"))
       oos.writeObject(this)
       oos.flush()   //刷新输出流，确保将数据全部写出
       oos.close()
     }
   }
  class Person(@BeanProperty val name:String,@BeanProperty val age:Int) extends
  ReadAndWriteObject with Serializable{

  }

  def main(args: Array[String]): Unit = {
    val person = new Person("zhangsan",20)
    person.write()

    val p1 = new Person("lisi",99)
    val obj = p1.read()

    //类型判断
    if(obj.isInstanceOf[Person]){
      val person3 = obj.asInstanceOf[Person]
      println(person3.getAge)
      println(person3.getName)
    }
  }



}
