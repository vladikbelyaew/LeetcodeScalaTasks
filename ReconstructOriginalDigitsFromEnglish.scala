// https://leetcode.com/problems/reconstruct-original-digits-from-english/

object Solution {
  def originalDigits(s: String): String = {
    val letters = s.toIterable
    val counts = Array.ofDim[Int](10)
    
    def assistFunc(acc: String = "", n: Int = 0): String = {
      if (n > 9) acc
      else assistFunc(acc + n.toString * counts(n), n + 1)
    }
    
    counts(0) = s.count(x => {x == 'z'})
    counts(2) = s.count(x => {x == 'w'})
    counts(8) = s.count(x => {x == 'g'})
    counts(6) = s.count(x => {x == 'x'})
    counts(7) = s.count(x => {x == 's'}) - counts(6)
    counts(3) = s.count(x => {x == 'h'}) - counts(8)
    counts(4) = s.count(x => {x == 'r'}) - counts(3) - counts(0)
    counts(5) = s.count(x => {x == 'f'}) - counts(4)
    counts(1) = s.count(x => {x == 'o'}) - counts(0) - counts(2) - counts(4)
    counts(9) = (s.count(x => {x == 'n'}) - counts(1) - counts(7)) / 2
    
    assistFunc()
  }
}
