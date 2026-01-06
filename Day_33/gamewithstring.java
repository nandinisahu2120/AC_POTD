import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class gamewithstring {
   
    public int minValue(String s, int k) {
        // code here
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Character,Integer> hp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hp.put(s.charAt(i),hp.getOrDefault(s.charAt(i),0)+1);
        }
        // for(int i=0;i<hp.size();i++){
        //     pq.offer(hp.get(s.charAt(i)));
        // }System.out.println(pq);
        for(Character ch:hp.keySet())
        pq.offer(hp.get(ch));
        while(k>0){
            pq.offer(pq.poll()-1);
            k--;
            //System.out.println(pq);
        }
        int val=0;
       // System.out.println(hp);
        //System.out.println(pq);
        while(!pq.isEmpty())
        val+=pq.peek()*pq.poll();
        return val;
    } 
}
