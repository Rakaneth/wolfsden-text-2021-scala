package gameobject

import scala.collection.mutable

sealed trait GameObject
case class Item(name: String, desc: String) extends GameObject
case class Person(
    name: String, 
    desc: String,
    stats: mutable.Map[String, Int],
    inventory: Vector[Item]) extends GameObject
case object NullObject extends GameObject