import java.util.Collections;
import java.util.PriorityQueue;

public class minropecost {
    
    public long pickGifts(int[] gifts, int k) {
        int l= gifts.length;
        //k=l-k;
        long g=0;
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
      for(int i=0;i<l;i++)  
          {
              pq.offer(gifts[i]);
              //if(pq.size()>k)
            //  {    System.out.println("peek"+pq.peek());
                 // g+=pq.poll();}
              //System.out.println("sum"+g);
          }
     //  System.out.println("pol"); 
        while(k>0)
            {//System.out.println("peek="+pq.peek());
         int t=  (int)Math.floor(Math.sqrt(pq.poll()));   //pq.offer((int)Math.floor(Math.sqrt(pq.poll())));
                  pq.offer(t);
        k--;
                //System.out.println("t="+t);
     //System.out.println(pq);            //System.out.println(pq.peek());
               // g+=(int)Math.floor(Math.sqrt(pq.poll()));
          // System.out.println(g);
            }
       System.out.println(pq); 
        while(!pq.isEmpty())
            {
              g+=pq.poll();
            }
        return g;
    }
}
