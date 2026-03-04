class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set1 = new HashSet<>();
        return recursion(n,set1);
        
    }
    public boolean recursion(int n, HashSet<Integer> set){
        HashSet<Integer> set1 = set;
        if(set1.contains(n)){
            return false;
        } 
        if(n == 1){
            return true;
        }
        set1.add(n);
        int temp = 0;
        while( n > 0){
         int digit = n % 10;
         temp += digit * digit;
         n = n / 10;
        }
        return recursion(temp, set1);
    }
}