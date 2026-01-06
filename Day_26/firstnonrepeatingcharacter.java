import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class firstnonrepeatingcharacter {
    
    public String firstNonRepeating(String s) {
        // code here
        Queue<Character> q=new LinkedList<>();
        Map<Character,Integer> mp=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        //int f=0
        for(int i=0;i<s.length();i++){
            q.offer(s.charAt(i));
        //    mp.put(s.charAt(i),mp.getOrDefault(s.CharAt(i),0)+1);
              mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            while(!q.isEmpty() &&(mp.getOrDefault(q.peek(),0))>1){
                q.poll();
                // System.out.println(mp);
                // System.out.println(q);
            }
            if(q.isEmpty())
                sb.append("#");
            else sb.append(q.peek());
        }
        return sb.toString();
    }
}
