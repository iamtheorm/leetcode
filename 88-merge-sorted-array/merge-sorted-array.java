class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;       // Pointer for the end of actual elements in nums1
        int p2 = n - 1;       // Pointer for the end of nums2
        int p = m + n - 1;    // Pointer for the very end of nums1

        // While there are elements in both arrays to compare
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        
        // If there are leftover elements in nums2, copy them over.
        // (Leftovers in nums1 are already in the correct place)
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}