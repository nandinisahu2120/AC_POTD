import java.util.Stack;

public class infixtopostfix {
     public static int priority(char ch){
        switch(ch){
            case '^':return 3;
            case '*':return 2;
            case '/':return 2;
            case '+':return 1;
            case '-':return 1;
            default:return 0;
            
        }
    }
    public static String infixToPostfix(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch))
            sb.append(ch);
            else if(ch=='(')
            st.push(ch);
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='(')
                    sb.append(st.pop());
                if(!st.isEmpty())
                st.pop();
                //   {System.out.println("fhf"+st.pop());}
            }
            else{
                if(ch=='^'){
                    st.push(ch);
                }
                else
                {while(!st.isEmpty() && priority(ch)<=priority(st.peek()) && st.peek()!='('){
                    sb.append(st.pop());
                }
                    
                st.push(ch);
                }14
            }
        }
        while(!st.isEmpty())
             sb.append(st.pop());
        return sb.toString();
        
    }
}
