package S99

/**
  * Find the number of elements of a list
  */
object P4 {
  def length [T] (list: List[T]): Int = list.foldLeft(0) { (acc, _) => acc+1 }
}
