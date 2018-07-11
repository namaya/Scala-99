import org.scalatest.FlatSpec

class P1 extends FlatSpec {

  "last(list: List[T])" should "find the last element of a list" in {
    val list = List("Hello", " ", ",", " ", "world", "!")
    assert(S99.P1.last(list) == "!")
  }

  it should "throw NoSuchElementException if the given list is empty." in {
    val list = List()
    assertThrows[NoSuchElementException] {
      S99.P1.last(list)
    }
  }

}
