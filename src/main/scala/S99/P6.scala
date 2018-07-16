package S99

/**
  * Find out whether a list is a palindrome.
  *
  * TODO: Implementation is O(n**2). Figure out how to reduce this.
  */
object P6 {
 def isPalindrome [T] (list: List[T]): Boolean = {
   if (list.isEmpty) true
   else if (list.head == list.last) isPalindrome(list.slice(1, list.length-1))
   else false
 }
}
