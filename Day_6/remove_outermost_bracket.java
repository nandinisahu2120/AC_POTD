public class remove_outermost_bracket {
public String removeOuterParentheses(String s) {
        //List<String> ls=new ArrayList<>();
        int c=0;
        String str="",finall="";
        for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='(')
                    {
                        str+=ch;
                        c++;
                    }
                else if(ch==')')
                {
                    str+=ch;
                    c--;
                }
                if(c==0) //condition to extact the primitive valid parenthesis string
                {
                    // for(int j=1;j<str.length()-1;j++)
                    //     {
                    //         finall=finall+str.charAt(j);
                            
                    //     }
                     finall=finall+str.substring(1,str.length()-1);//subtring without the external brackets
                    str=""; //refreshing the value of str
                }
                
            }
        return finall;
    }

}//time complexity=O(n*m), n=number of inputs ,m=max length of string-2
