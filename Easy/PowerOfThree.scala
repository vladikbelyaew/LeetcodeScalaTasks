// https://leetcode.com/problems/power-of-three/

object Solution {
  val arr = Array(3, 9, 7, 1)
  def isPowerOfThree(n: Int): Boolean = {
    def assistFunc(acc: Int = n): Boolean = {
      if (acc ==  1) true
      else {
        if (acc % 3 != 0) false
        else assistFunc(acc / 3)
      }
    }

    if (arr.contains(n % 10)) assistFunc()
    else false 
  }
}
