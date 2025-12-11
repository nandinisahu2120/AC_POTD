import java.util.*;
public class B_Even_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
           // System.out.println("t="+i);
            int n=sc.nextInt();
            int[] arr=new int[n];
            int o=0,e=0,c=0;
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
                if(arr[j]%2==1)
                    o++;
                else e++;

            }
            if(n%2==0){
                if(e!=o)
                    System.out.println(-1);
                else{
                    for(int j=0;j<n;j++){
                        if(j%2==0 && arr[j]%2==1)
                            c++;
                    }
                    System.out.println(c);
                }
            }
            else{
                if(e!=o+1)
                    System.out.println(-1);
                else{
                     for(int j=0;j<n;j++){
                        if(j%2==0 && arr[j]%2==1)
                            c++;
                    }

                    System.out.println(c);
                }
            }
        }
    }
    
}
