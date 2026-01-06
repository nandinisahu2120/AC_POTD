import java.util.PriorityQueue;

public class richestpile {
    
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int mincost=0;
        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
        }
        while(pq.size()>=2){
            int a=pq.poll();
            int b=pq.poll();
            mincost+=a+b;
            pq.offer(a+b);
            
        }
        return mincost;
    }
}
