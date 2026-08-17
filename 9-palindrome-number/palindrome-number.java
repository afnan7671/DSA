class Solution {
    public boolean isPalindrome(int x) {
       int rev=0;
       int ori=x;
       if(x<0)
       return false;
       while(x!=0)
       {
        int temp=x%10;
        rev=temp+(rev*10);
        x=x/10;
       }
       if(ori==rev)
       {
        return true;
       }
       else
       {
        return false;
       }
    }
} 