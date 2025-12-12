import java.util.*;
public class B_Balanced_Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            if(n%4!=0)
                System.out.println("NO");
            else
            {
                System.out.println("YES");
                int[] arr=new int[n];
                int esum=0;
                for(int j=0,c=2;j<n/2;j++,c=c+2){
                    arr[j]=c;
                    esum=esum+arr[j];
                }
                int osum=0;
                for(int j=n/2,c=1;j<n-1;j++,c=c+2){
                    arr[j]=c;
                    osum=osum+arr[j];
                }
                arr[n-1]=esum-osum;
                for(int j=0;j<n;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}
