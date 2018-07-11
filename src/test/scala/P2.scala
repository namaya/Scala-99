import org.scalatest.FlatSpec

class P2 extends FlatSpec {

  "P2" should "find the last but one element of a list." in {
    val list = List(1, 2, 3, 4, 5, 6)
    assert(S99.P2.penultimate(list) == 5)
  }

  it should "throw a NoSuchElementException if the list is empty" in {
    val emptyList = List()
    assertThrows[NoSuchElementException] {
      S99.P2.penultimate(emptyList)
    }
  }

  it should "throw a NoSuchElementException if the list is of length 1" in {
    val oneElementList = List("Hello")
    assertThrows[NoSuchElementException] {
      S99.P2.penultimate(oneElementList)
    }
  }

}
