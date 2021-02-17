package direction

sealed trait Direction
case object North extends Direction
case object NorthEast extends Direction
case object East extends Direction
case object SouthEast extends Direction
case object South extends Direction
case object SouthWest extends Direction
case object West extends Direction
case object NorthWest extends Direction
case object In extends Direction
case object Out extends Direction
case object Up extends Direction
case object Down extends Direction
case object NoDirection extends Direction