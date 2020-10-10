package com.atshuyao.MyMatch

class Student(val cname:String,val num:Int)
class User(val name:String,val age:Int)
object User {
  //对象生成器，只能在伴生对象用
  def apply(name: String, age: Int): User = new User(name, age)



  //对象提取器,将对象的属性和方法提取出来
  def unapply(user: User): Option[(String, Int)] = {
    if(user ==null)
      None
    else
      Some(user.name,user.age)
  }
}
object ObjMatch{
  def main(args: Array[String]): Unit = {
    val user:User = User("zhangsan",11)
    val result = user match{
      case User("zhangsan",11) => "yes"
      case _ => "no"
    }
    println(result)
  }
}
