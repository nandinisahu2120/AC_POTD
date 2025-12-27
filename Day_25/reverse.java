class Solution {
    public String reverse(String S) {
        // code here
     Stack<Character> st1=new Stack<>();
    // Stack<Character> st2=new Stack<>();
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<S.length();i++){
         st1.push(S.charAt(i));
     }
     for(int i=0;i<S.length();i++){
         sb.append(st1.pop());
     }
     return sb.toString();
    }
}