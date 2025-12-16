import java.util.*;
public class A_Chewbacca_and_Number{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();;
    long num=0;
    long i=1;
   while(n>0 && n!=9){
    long d=n%10;
    if((9-d)<d ){
        num=num+(9-d)*i;
    }
    else{
        num=num+d*i;
    }
    i*=10;
    n/=10;
   }
   if(n==9)
    num=num+n*i;
///num=420032203402L;
   System.out.println(num);
}
}