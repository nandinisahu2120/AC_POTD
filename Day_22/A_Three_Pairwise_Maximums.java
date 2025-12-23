import java.util.*;
public class A_Three_Pairwise_Maximums{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(x!=y && y!=z && z!=x)
                System.out.println("NO");
            else if(x==y && y==z && z==x){
                System.out.println("YES");
                System.out.println(x+" "+y+" "+z);}
            else if(x==y){
                if(z>x)
                    System.out.println("NO");
                else{
                    System.out.println("YES");
                    System.out.println(1+" "+x+" "+z);
                }
            }
             else if(z==y){
                if(x>z)
                    System.out.println("NO");
                else{
                    System.out.println("YES");
                    System.out.println(x+" "+1+" "+y);
                }
            }
            else if(z==x){
                if(y>z)
                    System.out.println("NO");
                else{
                    System.out.println("YES");
                    System.out.println(z+" "+y+" "+1);
                }
            }

        }
    }
}
