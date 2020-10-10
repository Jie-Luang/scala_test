package com.atshuyao.genericity

object $1_upAndDown {

}
abstract class Animal{
  val name:String
}

abstract class Pet extends Animal{
}
class Dog extends Pet{
  override val name: String = "dog"
}
class Cat extends Pet{
  override val name: String = "cat"
}
class Lion extends Animal{
  override val name: String = "lion"
}
class PetContainer[P <: Pet](val pet:P){
}
object TestGeneric{
  def printer(petContainer: PetContainer[Pet])={
    println(petContainer.pet.name)
  }

  def main(args: Array[String]): Unit = {
    val dog:Dog = new Dog()
    val cat:Cat = new Cat()
    val lion:Lion = new Lion()

    val dogContainer:PetContainer[Dog] = new PetContainer[Dog](dog)
    val catContainer:PetContainer[Cat] = new PetContainer[Cat](cat)
    //val lionContainer:PetContainer[Lion] = new PetContainer[Lion](lion)

  }
}