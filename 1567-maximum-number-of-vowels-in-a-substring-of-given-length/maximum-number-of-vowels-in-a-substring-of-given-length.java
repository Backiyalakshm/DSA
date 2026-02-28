class Solution{
    static boolean isVowel (char c){
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u'){
        return true;
    }
    return false;
    }
    public int maxVowels(String s, int k) {
       //s = s.toLowerCase();
    //    char[] arr = s.toCharArray();
    //    int cnt = 0; 
    //     for(int i = 0; i <=  arr.length - k; i++){
    //         int Wcnt = 0;
    //       for(int j = i; j <= (i + k)-1; j++){
            
    //         if(arr[j] == 'a' || arr[j] == 'e' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'u'){
    //             Wcnt++;
    //         }
         
    //       }    
    //       cnt = Math.max(cnt,Wcnt);
    //     }
    //     return cnt;
    
 int n = s.length();
 int vowl = 0;
 int maxCount = 0;
 for(int i= 0; i< k; i++){
    if(isVowel(s.charAt(i))){
        vowl++;
        maxCount = vowl;
    }
 }
 for(int  i = k; i <n; i++){
    if(isVowel(s.charAt(i))){
        vowl++;
    }
      if(isVowel(s.charAt(i-k))){
        vowl--;
    }
    maxCount = Math.max(vowl, maxCount);

 }
return maxCount;
    }
}