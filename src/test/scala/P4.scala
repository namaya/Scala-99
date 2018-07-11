import org.scalatest.FlatSpec

class P4 extends FlatSpec {
  "P4" should "find the number of elements of a list." in {
    val list = List(1, 2, 3, 4)
    assert(S99.P4.length(list) == 4)
  }
}
