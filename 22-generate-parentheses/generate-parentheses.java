class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list , "", 0,0,n);
        return list;
    }

public void backtrack(List<String> list, String s,int oc,int cc,int n){
        if(s.length() == n *2){
            list.add(s);
            return;
        }
        if(oc < n){
            backtrack(list, s+"(", oc+1,cc ,n);
        }
        if(cc < oc){
            backtrack(list, s + ")" ,oc, cc +1,n);
        }
    }
}