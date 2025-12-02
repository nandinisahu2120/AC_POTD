import java.util.*;
public class A_Shizuku_Hoshikawa_and_Farm_Legs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        List<Integer> li=new ArrayList<>();
        for(int i=1;i<=t;i++)
        {
            li.add(sc.nextInt());
        }
        for(int i=0;i<li.size();i++)
        {
            int n=li.get(i);
            if(n%2==1 || n==0)
                System.out.println(0);
         /*   else if(n%4==0){
                c=n/4+1;
                System.out.println(c);
           }
           */
           else
           {
               int c=(int)n/4+1;
                System.out.println(c);
           }
        }
        
    }
}