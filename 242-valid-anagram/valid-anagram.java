class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        // int[] count = new int[26];
        // for(int i= 0;i <s.length(); i++)
        // {
        //     count[s.charAt(i) - 'a']++;
        //     count[t.charAt(i) - 'a']--;
        // }
        // for(int i =0;i<26;i++)
        // {
        //     if(count[i] != 0)
        //     {
        //         return false;
        //     }

        // }
        // return true;

        Map<Character ,Integer> map1 = new HashMap<>();
        Map<Character ,Integer> map2 = new HashMap<>();

     for(int i = 0; i < s.length(); i++){
        if(map1.containsKey(s.charAt(i))){
            map1.put(s.charAt(i) , map1.get(s.charAt(i)) + 1);
        }
        else{
            map1.put(s.charAt(i) , 1);
        }

     }
      for(int i =0; i < t.length(); i++){
        if(map2.containsKey(t.charAt(i))){
            map2.put(t.charAt(i) , map2.get(t.charAt(i)) + 1);
        }
        else{
            map2.put(t.charAt(i) , 1);
        }
        
     }
    if(!map1.equals(map2)){
    return false;
}
return true;
}}