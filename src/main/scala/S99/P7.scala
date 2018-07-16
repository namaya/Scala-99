package S99

/**
  * Flatten a nested list structure.
  */
object P7 {
  def flatten [T] (list: List[T]): List[T] = {
    list.foldLeft(List[T]()) {
      (acc, element) => {
        element match {
          case ls: List[T] => acc ++ flatten(ls)
          case _ => acc :+ element
        }
      }
    }
  }
}
