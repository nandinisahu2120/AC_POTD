import java.util.*;    //IMPORTING THE UTIL PACKAGE HERE
public class A_Shizuku_Hoshikawa_and_Farm_Legs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();   //NUMBER OF INPUTS THAT ARE TO BE PASSED ARE STORED IN 't'
        
        List<Integer> li=new ArrayList<>(); //CREATINNG THE LIST TO STORE THE NUMBER OF LEGS
        for(int i=1;i<=t;i++)
        {
            li.add(sc.nextInt());   //INPUTTING THE NUMBER ODF LEGS IN LIST
        }
        for(int i=0;i<li.size();i++)
        {
            int n=li.get(i);  //EXTRACTING THE LIST ELEMENT
            if(n%2==1 || n==0)   //IF NUMBER OF LEGS ARE ODD THEN THERE IS NO CONFIGURATION
                System.out.println(0);
         /*   else if(n%4==0){
                c=n/4+1;
                System.out.println(c);
           }
           */
           else  //IF NUMBER OF LEGS ARE EVEN
           {
               int c=(int)n/4+1; //CALCULATING THE NUMMBER OF POSSIBLE CONFIGURATIION ON BASIS NUMBER OF COWS (TOTAL CONFIG=NUMBER OF COWS(N/4) + 1(CASE WHEN NO COW))
                System.out.println(c);   //PRINTING THE NUMMBER OF POSSIBLE CONFIGURATIION
           }
        }
        
    }
}
//TIME COMPLEXITY OF THIS CODE =O(n)
//SPACE COMPLEXITY OF THIS CODE =O(n)
