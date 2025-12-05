import java.util.*;
public class A_Bit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//input for number of statements in the program
        int x=0; //initializing x=0
        for(int i=1;i<=n;i++)
        {
            String s=sc.next();//input for the statement to be operated
            if(s.charAt(0)=='X') //checking for post or pre operation
            {
                if(s.charAt(1)=='+')  x++; //checking for post increment           
                else x--;//checking for post decrement   
            }
            else{
                if(s.charAt(0)=='+')  ++x;  //checking for pre increment                 
                else --x;//checking for pre decrement
            }
        }
        System.out.println(x);//printing the result
    }
}
//time complexity=O(n)