package S99

/**
  * Find the Kth element of a list.
  */
object P3 {
  def nth [T] (n: Int, list: List[T]): T = {
    try {
      list(n)
    } catch {
      case _: IndexOutOfBoundsException => throw new NoSuchElementException
    }
  }
}
