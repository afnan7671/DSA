class Solution {
    public int maxArea(int[] height)
    {
        int left=0;
        int right=height.length-1;
        int marea=0;
        while(left<=right)
        {
            int width=right-left;
            int min=Math.min(height[left],height[right]);
            int area=min*width;
            marea=Math.max(area,marea);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return marea;
    }
}