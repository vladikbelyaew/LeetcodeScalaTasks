// https://leetcode.com/problems/number-of-good-pairs/

object Solution {
  def numIdenticalPairs(nums: Array[Int], i: Int = 0, j: Int = 1, count: Int = 0): Int = {
    val lim = nums.length
    if (i > lim - 2) count
    else {
      if (j > lim - 1) numIdenticalPairs(nums, i + 1, i + 2, count)
      else {
        if (nums(i) == nums(j)) numIdenticalPairs(nums, i, j + 1, count + 1)
        else numIdenticalPairs(nums, i, j + 1, count)
      }
    }
  }
}
