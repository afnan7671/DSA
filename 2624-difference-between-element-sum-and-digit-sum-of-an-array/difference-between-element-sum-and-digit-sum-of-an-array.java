class Solution {
    public int differenceOfSum(int[] nums) {
      int sum=0;
      int numb=0;
      int target=0;
      int num=0;
    
      for(int i=0;i<nums.length;i++) 
      {
        sum+=nums[i];
      }
      for(int i=0;i<nums.length;i++)
      { int dsum=0;
        target=nums[i];
      if(nums[i]>9)
        { 
        while(target>0){
         num=target%10;
         dsum+=num;
         target=target/10;
        }
        numb+=dsum;

      }
     
     else
     {
        numb+=nums[i];
     }
     
      }
      int p=sum-numb;
      if(p>0)
      return p;
      return -(p);
    }
}