import org.scalatest.FlatSpec

class P8 extends FlatSpec {
  "compress(list)" should "eliminate a pair of consecutive duplicates " in {
    assertResult(List(1, 2, 3, 4, 5, 6)) {
      S99.P8.compress(List(1, 2, 3, 3, 4, 5, 6))
    }
  }

  it should "eliminate n consecutive elements of duplicates " in {
    assertResult(List("A", "B", "C", "D")) {
      S99.P8.compress(List("A", "B", "C", "D", "D", "D", "D", "D", "D"))
    }
  }

  it should "eliminate two copies of a stream of consecutive duplicates" in {
    assertResult(List(1, 2, 1, 3, 4)) {
      S99.P8.compress(List(1, 1, 2, 2, 1, 1, 1, 3, 4))
    }
  }

  it should "eliminate n copies of a stream of consecutive duplicates" in {
    assertResult(List(1, 0, 1, 0, 1, 0, 1)) {
      S99.P8.compress(List(1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1))
    }
  }
}
