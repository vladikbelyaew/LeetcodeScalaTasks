// https://leetcode.com/problems/median-of-two-sorted-arrays/

object Solution {
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    def assistFunc(arr: Array[Int]): Double = {
      if (arr.length % 2 == 1) arr((arr.length - 1) / 2)
      else (arr((arr.length - 1) / 2) + arr((arr.length - 1) / 2 + 1)) / 2.0
    }

    if (nums1.length == 0) assistFunc(nums2)
    else if (nums2.length == 0) assistFunc(nums1)
    else assistFunc(nums1.concat(nums2).sorted)
  }
}
