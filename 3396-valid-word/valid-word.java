class Solution {
    public boolean isValid(String word) {
        String wordUpper = word.toUpperCase();
        if(word.length() < 3){
            return false;
        }
        if(atleastVowel(wordUpper) && atleastCons(wordUpper)){
            return true;
        }
        return false;
    }
    public boolean atleastVowel(String word){
        boolean flag = false;
        for(int i =0; i < word.length(); i++){
            if( Character.isLetterOrDigit(word.charAt(i)) && Character.isLetter(word.charAt(i))  && word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U'  )
            {
                flag = true;
            }
            if(!Character.isLetterOrDigit(word.charAt(i))){
            return false;
        }

        }

        return flag;

    }
    public boolean atleastCons(String word){
        boolean flag = false;
        for(int  i =0; i< word.length(); i++){
        if( Character.isLetterOrDigit(word.charAt(i)) &&  Character.isLetter(word.charAt(i))  &&  word.charAt(i) != 'A' && word.charAt(i) != 'E' && word.charAt(i) != 'I' && word.charAt(i) != 'O' && word.charAt(i) != 'U'  )
            {
                flag = true;
            }
             if(!Character.isLetterOrDigit(word.charAt(i))){
            return false;
        }
        }
       
        return flag;
    }
}