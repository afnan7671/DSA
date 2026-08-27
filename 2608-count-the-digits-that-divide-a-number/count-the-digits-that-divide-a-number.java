class Solution {
    public int countDigits(int num) {
   
    String s=String.valueOf(num);
    int[] arr=new int[s.length()];
    for(int i=0;i<s.length();i++)
    {
        arr[i]=s.charAt(i)-'0';
    }
    int count=0;
    for(int i=0;i<arr.length;i++)
    {
        if(num%arr[i]==0)
        {
            count++;
        }
    }
    return count;
    }
}