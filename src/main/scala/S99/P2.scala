package S99

import java.util.NoSuchElementException

/**
  * Find the last but one element of a list.
  */
object P2 {
  def penultimate [T] (list: List[T]): T = {
    try {
      list(list.length-2)
    } catch {
      case _: IndexOutOfBoundsException => throw new NoSuchElementException
    }
  }
}
