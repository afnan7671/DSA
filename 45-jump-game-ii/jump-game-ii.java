class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int end=0;
        int jump=0;
        int far=0;
        if (n == 1)
        return 0;
        if (nums[0] == 0)
            return -1;
        for(int i=0;i<n-1;i++)
        {
            far=Math.max(far,i+nums[i]);
            if(i==end)
            {
                jump++;
                end=far;
            }
            if(end>=n-1)
            return jump;
            if(end==i)
            return -1;
        }
        return -1;
        
    }
}