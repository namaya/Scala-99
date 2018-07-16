package S99

object P5 {
  def reverse [T] (list : List[T]): List[T] = {
    list.foldLeft(List[T]()) {
      (acc, i) => i :: acc
    }
  }
}
