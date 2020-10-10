package com.atshuyao.myTrait

class User(val name:String,val age:Int)

trait Dao{
  def insert(user:User)={
    println("insert into database:" + user.name)
  }
}

/**
 * 自身类型：提醒子类要实现该trait的时候必须提前实现
 * 指定的trait/class
 */
trait APP {
  _:Dao=>      //自身类型
  def login(user: User):Unit={
    println("login :" + user.name)
    insert(user)
  }
}

object SelfTrait extends APP with Dao {
  def main(args: Array[String]): Unit = {

    login(new User("bobo",11))
  }


}
