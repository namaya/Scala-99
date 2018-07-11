import org.scalatest.FlatSpec

class P5 extends FlatSpec {
  "reverse(list: List[T])" should "reverse an odd-length list." in {
    val list = List(1, 2, 3)
    val expected = List(3, 2, 1)
    assert(S99.P5.reverse(list) == expected)
  }

  it should "reverse an even-length list." in {
    val list = List(1, 2, 3, 4)
    val expected = List(4, 3, 2, 1)
    assert(S99.P5.reverse(list) == expected)
  }

  it should "reverse an empty list" in {
    val list = List()
    val expected = List()
    assert(S99.P5.reverse(list) == expected)
  }
}
