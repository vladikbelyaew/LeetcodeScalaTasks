// https://leetcode.com/problems/palindrome-number/

object Solution {
  def isPalindrome(x: Int): Boolean = {
    if (x < 0) false
    else {
      if (x / 10 == 0) true
      else {
        val s: String = x.toString
        def assistFunc(count: Int = 0): Boolean = {
          if (count == s.length / 2) true
          else if (s(count) != s(s.length - 1 - count)) false
          else assistFunc(count + 1)
        }
        assistFunc()
      }
    }
  }
}
