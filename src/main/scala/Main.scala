import scala.io.StdIn.readLine
import parser.CommandParser
import direction._
import gameobject._

object Main extends App {
  val testcmds = List(
    "east", "e",
    "south", "s",
    "north", "n",
    "west", "w",
    "northeast", "ne",
    "southeast", "se",
    "northwest", "nw",
    "southwest", "sw",
    "in", "out", "up", "down")

  testcmds
    .map { case s => CommandParser.parseCommand(s)}
    .foreach(println)

}