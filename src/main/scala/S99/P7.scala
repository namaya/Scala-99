package S99

/**
  * Flatten a nested list structure.
  * TODO: Implementation is O(n**2) due to the append operation. Refactor to be a prepend which is a constant operation.
  */
object P7 {
  def flatten [T] (list: List[T]): List[T] = {
    list.foldLeft(List[T]()) {
      (acc, element) => {
        element match {
          case ls: List[Any] => acc ++ flatten(ls.asInstanceOf[List[T]]) // ++ : append a list to a list
          case _ => acc :+ element // :+ : append an element to a list
        }
      }
    }
  }
}
