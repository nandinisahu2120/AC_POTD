import java.util.*;
public class A_New_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<Character> st=new HashSet<>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            String s=sc.next();
            for(int j=0;j<s.length()/2;j++){
                st.add(s.charAt(j));//storing the first half characters of the string
            }
            if(st.size()>=2) //if there are more than one characters in the current hashset then the another pallindromic string can be formed
                System.out.println("YES");
            else
                System.out.println("NO");
            st.clear(); //clearing the current hashset
        }
    }   
}
//time complexity=O(n*m), where n=number of test cases and m=maximum length of string....
