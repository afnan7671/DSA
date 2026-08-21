import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {

       HashMap<Integer,Integer> set=new HashMap<>();
       int max=0;
       int sum=0;
       set.put(0,-1);
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0)
        sum++;
        else
        sum--;
       if(set.containsKey(sum))
        max=Math.max(max,i-set.get(sum));
       else
       set.put(sum,i);
       }
       return max;

    }
}