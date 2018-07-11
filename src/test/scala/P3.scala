import org.scalatest.FlatSpec

class P3 extends FlatSpec {

  "P3" should "find the kth element of a list." in {
    val list = List(1, 1, 2, 3, 5, 8)
    assert(S99.P3.nth(2, list) == 2)
  }

  it should "throw NoSuchElementException if index is out of range." in {
    val list = List(1, 1, 2, 3, 5, 8)
    assertThrows[NoSuchElementException] {
      S99.P3.nth(-1, list)
      S99.P3.nth(15, list)
    }
  }
}
