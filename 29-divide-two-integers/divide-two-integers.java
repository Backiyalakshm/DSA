class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor)
        {
            return 1;
        }
        boolean sign = true;
        if(dividend >= 0 && divisor < 0)
        {
            sign = false;
        }
        else if(dividend <= 0 && divisor > 0)
        {
         sign = false;
        }
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long quocient = 0;
        while(n >= d)
        {
            int cnt = 0;
            while(n >= (d << (cnt +1)))
            {
                cnt++;
            }
            quocient += 1L << cnt;
            n -= (d << cnt);
        }
        if(quocient == (1L << 31) && sign)
        {
            return Integer.MAX_VALUE;
        }
        else if(quocient == (1L << 31) && !sign)
        {
            return Integer.MIN_VALUE;
        }
      return sign ? (int)quocient: (int)- quocient;

    }
}
