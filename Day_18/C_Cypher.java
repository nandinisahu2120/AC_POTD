import  java.util.*;
public class C_Cypher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            String[][] cyp=new String[n][2];
            for(int j=0;j<n;j++){
                cyp[j][0]=sc.next();
                cyp[j][1]=sc.next();
            }
            int[] ans=new int[n];
            for(int j=0;j<n;j++){
                int c=arr[j];
                for(int k=0;k<Integer.parseInt(cyp[j][0]);k++){
                    if(cyp[j][1].charAt(k)=='D')
                        c++;
                    else
                        c--;
                    if(c==10)
                        c=0;
                    else if (c==-1)
                        c=9;
                }
                ans[j]=c;
            }
            for(int j=0;j<n;j++)
                System.out.print(ans[j]+" ");
            System.out.println();
        }
    }
    
}
