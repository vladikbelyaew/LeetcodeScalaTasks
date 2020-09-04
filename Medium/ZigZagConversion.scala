// https://leetcode.com/problems/zigzag-conversion/

object Solution {
  def convert(s: String, numRows: Int): String = {
    if (numRows == 1) s
    else {
      val d: Int = 2 * numRows - 2
      def assistFunc(rowCount: Int = 0, elemCount: Int = 0, res: String = ""): String = {
        if (rowCount == numRows) res
        else if (elemCount >= s.length) assistFunc(rowCount + 1, rowCount + 1, res)
        else {
          if (rowCount == 0 || rowCount == numRows - 1) assistFunc(rowCount, elemCount + d, res + s(elemCount))
          else {
            if (elemCount % d == rowCount) assistFunc(rowCount, elemCount + d - rowCount * 2, res + s(elemCount))
            else assistFunc(rowCount, elemCount + rowCount * 2, res + s(elemCount))
          }
        }
      }
      assistFunc()
    }
  }
}
