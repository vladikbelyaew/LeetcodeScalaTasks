// https://leetcode.com/problems/n-th-tribonacci-number/

object Solution {
  def tribonacci(n: Int, count: Int = 2, acc1: Int = 0, acc2: Int = 1, acc3: Int = 1): Int = {
    if (n == 0) 0
    else if (n == 1 || n == 2) 1
    else {
      if (count == n) acc3
      else tribonacci(n, count + 1, acc2, acc3, acc1 + acc2 + acc3)
    }
  }
}
