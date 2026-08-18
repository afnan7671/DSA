class Solution {
    public int[] getConcatenation(int[] nums) {
    int n=nums.length;
    int k=2*n;
    int[] arr=new int[k];
    for(int i=0;i<n;i++)
    {
        arr[i]=nums[i];
    }
    int m=0;
    for(int i=n;i<k;i++)
    {
        arr[i]=nums[m];
        m++;
    }
    return arr;
    }
}