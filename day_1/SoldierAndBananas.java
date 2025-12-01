package potdsCF;
import java.util.*;
public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k,n,w;
        k=sc.nextInt();
        n=sc.nextInt();
        w=sc.nextInt();
        int totalPrice=0;
        for(int i=1;i<=w;i++)
        {
            totalPrice=totalPrice+i*k;
        }
        int req_amount=totalPrice-n;
        if(req_amount<0)
            System.out.println(0);
        else
            System.out.println(req_amount);
    }
}
