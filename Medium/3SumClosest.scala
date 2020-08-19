// https://leetcode.com/problems/3sum-closest/

import scala.math.abs

object Solution {
  def threeSumClosest(nums: Array[Int], target: Int): Int = {
    val lim = nums.length - 1
    def assistFunc(c1: Int = 0, c2: Int = 1, c3: Int = 2, acc: Int = 13001): Int = {
      if (c1 > lim - 2) acc
      else {
        if (c2 > lim - 1) assistFunc(c1 + 1, c1 + 2, c1 + 3, acc)
        else {
          if (c3 > lim) assistFunc(c1, c2 + 1, c2 + 2, acc)
          else assistFunc(c1, c2, c3 + 1, if (abs(nums(c1) + nums(c2) + nums(c3) - target) < abs(acc - target)) nums(c1) + nums(c2) + nums(c3) else acc)
        }
      }
    }
    assistFunc()
  }
}
