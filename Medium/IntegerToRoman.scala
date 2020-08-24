// https://leetcode.com/problems/integer-to-roman/

object Solution {
  
  val ints: Array[Int] = Array(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
  val romans: Array[String] = Array("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
  
  def intToRoman(num: Int, count: Int = 0, res: String = ""): String = {
    if (num == 0) res
    else if (num < ints(count)) intToRoman(num, count + 1, res)
    else intToRoman(num - ints(count), count, res + romans(count))
  }
  
}
