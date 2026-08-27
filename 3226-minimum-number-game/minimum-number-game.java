class Solution {
    public int[] numberGame(int[] nums) {
        int[] sum =new int[nums.length];
        int arr=0;
        Arrays.sort(nums);
      for(int right=1;right<nums.length;right+=2)
      {
      sum[arr]=nums[right];
      arr++;
      sum[arr]=nums[right-1];
      arr++;
     }
      return sum; 
    }
}