class Solution {
    public int fib(int n) {
        int m=0;
        int l=1;
        if(n==0)
        {
            return m;
        }
        if(n==1)
        {
            return l;
        }
    for(int i=0;i<n;i++)
    {
       int temp=m+l;
       m=l;
       l=temp;
    }
      return m;
    }
}