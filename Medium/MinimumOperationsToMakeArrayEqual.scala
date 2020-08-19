// https://leetcode.com/problems/minimum-operations-to-make-array-equal/

object Solution {
  def minOperations(n: Int, acc: Int = 0, x: Int = 1): Int = {
    if (x >= n) acc
    else minOperations(n, acc + (n - x), x + 2)
  }
}
