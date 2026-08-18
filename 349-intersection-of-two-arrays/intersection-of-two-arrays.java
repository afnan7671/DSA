class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }

        Integer[] temp = result.toArray(new Integer[0]);

        int[] ans = new int[temp.length];

        for (int i = 0; i < temp.length; i++) {
            ans[i] = temp[i];
        }

        return ans;
    }
}