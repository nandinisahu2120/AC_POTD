import java.util.*;
public class B_Permutation_Swap {
    public static int GCD(int a,int b) {
        while(a>0 && b>0){
            if(a>b)
                a=a%b;
            else
                b=b%a;
        }
        if(a==0) return b;
        else return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=1;i<=t;i++)
        {
            int g=0;
            int n=sc.nextInt();
            int[] p=new int[n];
            for(int j=0;j<n;j++){
                p[j]=sc.nextInt();}
            for(int j=1;j<=n;j++)
                {
                    int a=Math.abs(p[j-1]-j);
                    if(a!=0)
                   { if(g==0)
                        g=a;
                      //  System.out.println("a="+a);}
                    else
                    {
                         g=GCD(g,a);
                    }
                    }
                }
            System.out.println(g);

        }
        
}
    
}
