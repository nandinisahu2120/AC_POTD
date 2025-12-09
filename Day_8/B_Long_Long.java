import java.util.*;
public class B_Long_Long{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];
            
            int p=0,neg=0,c=0;
            for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
            if(arr[j]>0) p++;
            else if(arr[j]<0) neg++;
           
            }
            if (neg==0 && p==0) { 
                System.out.println(0+" "+0);
            }
            else
            {
             int[] narr=new int[p+neg];
             for(int j=0;j<n;j++){
                 if(arr[j]!=0)
                narr[c++]=arr[j];
             }
             int l=0;
             int s= narr[0];
             if(s<0){
                for(int j=0;j<narr.length;j++){
                    if(narr[j]>0 && narr[j-1]<0)
                        l++;

                }
                if(narr[narr.length-1]<0)
                    l++;
             }
             else{
                 for(int j=1;j<narr.length;j++){
                    if(narr[j]<0 && narr[j-1]>0)
                        l++;
                 }
             }            
            long sum=0;
             for(int j=0;j<n;j++)
                sum+=Math.abs(arr[j]);
            System.out.println(sum+" "+l);}
        }
    }
}