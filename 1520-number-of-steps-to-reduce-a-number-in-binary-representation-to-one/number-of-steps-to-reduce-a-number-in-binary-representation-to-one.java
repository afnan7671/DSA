import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {

        BigInteger sum = BigInteger.ZERO;
        int count = 0;

        char[] arr = s.toCharArray();

        for(int i = 0; i < s.length(); i++) {
            int num = arr[i] - '0';

            if(num == 1) {
                sum = sum.add(
                    BigInteger.ONE.shiftLeft(s.length() - 1 - i)
                );
            }
        }

        while(sum.compareTo(BigInteger.ONE) > 0) {

            if(sum.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                sum = sum.divide(BigInteger.TWO);
                count++;
            }
            else {
                sum = sum.add(BigInteger.ONE);
                count++;
            }
        }

        return count;
    }
}