import java.util.Stack;

public class postfixeval {
    public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        int a=0,b=0,ans=0;
        //System.out.println("arr="+arr[0]);
        for(int i=0;i<arr.length;i++){
            // if(arr[0]=="-"){
            //     System.out.println("a0"+(-1*Integer.parseInt(arr[1])));
            //     st.push(-1*Integer.parseInt(arr[1]));
            //     i++;
            // }
             if(arr[i].equals("+")||arr[i].equals("-")||arr[i].equals("*")||arr[i].equals("^")||arr[i].equals("/")){
                switch(arr[i]){
                    case "+":{
                        if(!st.empty())
                         b=st.pop();
                        if(!st.empty())
                         a=st.pop();
                         //System.out.println("a="+a+" b="+b+" a+b="+(a+b));
                        st.push(a+b);
                        break;
                    }
                    case "-":{
                        if(!st.empty())
                         b=st.pop();
                        if(!st.empty())
                         a=st.pop();
                         //System.out.println("a="+a+" b="+b+" a-b="+(a-b));
                        st.push(a-b);
                        break;
                    }
                    case "*":{
                        if(!st.empty())
                         b=st.pop();
                        if(!st.empty())
                         a=st.pop();
                         //System.out.println("a="+a+" b="+b+" a*b="+(a*b));
                        st.push(a*b);
                        break;
                    }
                    case "/":{
                        if(!st.empty())
                         b=st.pop();
                        if(!st.empty())
                         a=st.pop();
                         //System.out.println("a="+a+" b="+b+" a/b="+(int)Math.floor((double)a/b));
                        st.push((int)Math.floor((double)a/b));
                        break;
                    }
                    case "^":{
                        if(!st.empty())
                         b=st.pop();
                        if(!st.empty())
                         a=st.pop();
                         //System.out.println("a="+a+" b="+b+" a/b="+(int)Math.floor((double)a/b));
                        st.push((int)Math.pow(a,b));
                        break;
                    }
                }
            }
            //else if(Character.isDigit(arr[i].charAt(0)))
            else
                st.push(Integer.parseInt(arr[i]));
        }
        if(!st.empty())
         ans= st.pop();
        return ans;
    }
}
