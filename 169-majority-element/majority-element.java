class Solution {
    public int majorityElement(int[] nums) {
        int can=0;
        int vote=0;
        for(int num:nums)
        {
            if(vote==0)
            {
                can=num;
            }
            if(num==can)
            vote++;
            else
            vote--;
        }
        return can;
    }
}