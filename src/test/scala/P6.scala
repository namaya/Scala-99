import org.scalatest.FlatSpec

class P6 extends FlatSpec {
  "isPalindrome [T] (list: List[T])" should "say that [1, 2, 3, 3, 2, 1] (an even-length list) is a palindrome." in {
    val list = List(1, 2, 3, 3, 2, 1)
    assert(S99.P6.isPalindrome(list))
  }

  it should "say that [R, A, C, E, C, A, R] (an-odd length list) is a palindrome." in {
    val list = List('R', 'A', 'C', 'E', 'C', 'A', 'R')
    assert(S99.P6.isPalindrome(list))
  }

  it should "report that [1, 2, 3, 4] is not a palindrome." in {
    val list = List(1, 2, 3, 4)
    assert(!S99.P6.isPalindrome(list))
  }
}
