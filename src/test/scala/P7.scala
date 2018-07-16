import org.scalatest.FlatSpec

class P7 extends FlatSpec {
  "flatten(list)" should "flatten a nested list structure." in {
    val list = List(List(1, 1), 2, List(3, List(5, 8)))
    val expected = List(1, 1, 2, 3, 5, 8)
    assert(expected == S99.P7.flatten(list))
  }

  it should "flatten a 1D list structure to itself." in {
    val list = List(4, 5, 8, 7)
    val expected = List(4, 5, 8, 7)
    assert(expected == S99.P7.flatten(list))
  }

  it should "flatten a 2D list structure to itself." in {
    val list = List(List(1, 2), 3, List(4), List(5, 6, 7))
    val expected = List(1, 2, 3, 4, 5, 6, 7)
    assert(expected == S99.P7.flatten(list))
  }

  it should "return an empty list if given an empty list" in {
    val list = List()
    val expected = List()
    assert(expected == S99.P7.flatten(list))
  }
}
