// https://leetcode.com/problems/container-with-most-water/Container With Most Water

object Solution {
  def min(a: Int, b: Int): Int =
    if (a > b) b else a
  
  def maxArea(height: Array[Int], count1: Int = 0, count2: Int = 1, res: Int = 0): Int = {
    if (count1 == height.length) res
    else if (count2 == height.length) maxArea(height, count1 + 1, count1 + 2, res)
    else maxArea(height, count1, count2 + 1, if ((count2 - count1) * min(height(count1), height(count2)) > res) (count2 - count1) * min(height(count1), height(count2)) else res)
  }
}
