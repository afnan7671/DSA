class Solution {
    public String firstPalindrome(String[] words) {
     for(String m:words)
     { 
        String reverse = new StringBuilder(m).reverse().toString();
        if(m.equals(reverse))
        {
            return m;
        }
     }
     return "";
    }
}