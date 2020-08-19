// https://leetcode.com/problems/reverse-string/

object Solution {
  def reverseString(s: Array[Char]): Unit = {
    val l: Int = s.length
    val n: Int = l / 2
    var buf: Char = 0
    def swap(count: Int = 0): Unit = {
      if (count < n) {
        buf = s(count)
        s(count) = s(l - 1 - count)
        s(l - 1 - count) = buf
        swap(count + 1)
      }
    }
    swap()
  }
}
