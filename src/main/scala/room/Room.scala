package room

import gameobject.{Item, Person}
import direction.Direction

case class Room(
    id: String,
    name: String,
    desc: String,
    objects: Vector[Item],
    people: Vector[Person],
    connections: Map[Direction, String]
)