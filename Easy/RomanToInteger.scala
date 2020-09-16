// https://leetcode.com/problems/roman-to-integer/

object Solution {
  def toNum(x: Char): Int = {
    x match {
      case 'I' => 1
      case 'V' => 5
      case 'X' => 10
      case 'L' => 50
      case 'C' => 100
      case 'D' => 500
      case 'M' => 1000
    }
  }

  def romanToInt(s: String, count: Int = 0, res: Int = 0): Int = {
    if (count == s.length) res
    else if (count == s.length - 1) res + toNum(s(count))
    else if (!Array(1,10,100).contains(toNum(s(count)))) romanToInt(s, count + 1, res + toNum(s(count)))
    else {
      if (toNum(s(count)) < toNum(s(count + 1))) romanToInt(s, count + 2, res + toNum(s(count + 1)) - toNum(s(count)))
      else romanToInt(s, count + 1, res + toNum(s(count)))
    }
  }
}
