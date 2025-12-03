import java.util.*;
public class A_Theatre_Square{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        long  c1,c2,c3;  //to avoid overflow
        if(m%a==0)  //if m is completly divisible by a then store m/a in c1 to cover tiles
                 c1=m/a;
            else   //if m is not completly divisible by a then store m/a+1 in c1 to cover tiles
                 c1=m/a+1;
        if(n%a==0)  //similarly checking for n
                 c2=n/a;
            else
                 c2=n/a+1;
        c3=c1*c2;  //calculating number of tiles
        
        System.out.println(c3);  //printing number of tiles
    }
}
//time complexity=O(1)
