// https://leetcode.com/problems/three-consecutive-odds/

object Solution {
  def threeConsecutiveOdds(arr: Array[Int], count: Int = 0): Boolean = {
    val lim = arr.length - 1
    if (count > lim - 2) false
    else if (arr(count) % 2 == 1) {
      if (arr(count + 1) % 2 == 1) {
        if (arr(count + 2) % 2 == 1) true
        else threeConsecutiveOdds(arr, count + 1)
      }
      else threeConsecutiveOdds(arr, count + 1) 
    }
    else threeConsecutiveOdds(arr, count + 1)
  }
}
