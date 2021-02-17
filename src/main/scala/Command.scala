package command

import direction.{Direction}
import gameobject.{GameObject, Item, Person}

sealed trait Command
case class Go(person: Person, dir: Direction) extends Command
case class Take(person: Person, obj: GameObject) extends Command
case object Inventory extends Command
case object UnknownCommand extends Command
case class UnknownItem(attempted: String) extends Command
case object Exit extends Command