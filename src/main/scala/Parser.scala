package parser

import command._
import gameobject.{Person, Item}
import scala.collection.mutable
import direction._

object CommandParser {
    val goPattern = """go (\w+)""".r
    val takePattern = """take (\w+)""".r
    var player = Person("Player", "The player!", mutable.Map.empty[String, Int], Vector.empty[Item])
    def fromDirString(dirString: String): Direction = dirString match {
        case "north" | "n" => North
        case "northeast" | "ne" => NorthEast
        case "east" | "e" => East
        case "southeast" | "se" => SouthEast
        case "south" | "s" => South
        case "southwest" | "sw" => SouthWest
        case "west" | "w" => West
        case "northwest" | "nw" => NorthWest
        case "in" => In
        case "out" => Out
        case "up" => Up
        case "down" => Down
        case _ => NoDirection
    }
    
    def parseCommand(cmdString: String): Command = cmdString match {
        case goPattern(dir) => Go(player, fromDirString(dir))
        case takePattern(thing) => UnknownItem(thing)
        case "i" | "inventory" => Inventory
        case "exit" => Exit
        case dir =>Go(player, fromDirString(dir))
        case _ => UnknownCommand
    }
}