package S99

object P8 {
  def compress [T] (list: List[T]): List[T] = {
    var result: List[T] = List()
    var previous: Option[T] = None
    var skip = false

    for (element <- list) {
      skip = if (previous.isDefined && previous.get == element) true else false

      if (!skip) {
        result = result :+ element
      }

      previous = Option(element)
    }

    result
  }
}
