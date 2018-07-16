package S99

object P7 {
  def flatten [T] (list: List[T]): List[T] = {
    var result: List[T] = List()
    for (element <- list) {
      result = element match {
        case ts: List[T] =>
          result ++ flatten(ts)
        case _ =>
          result :+ element.asInstanceOf[T]
      }
    }
    result
  }
}
