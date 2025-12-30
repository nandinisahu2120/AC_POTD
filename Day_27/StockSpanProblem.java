import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
        public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<int[]> st=new Stack<>();
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int c=1;
            while(!st.empty() && st.peek()[0]<=arr[i])
            {
                c+=st.peek()[1];
                st.pop();
            }
            st.push(new int[]{arr[i],c});
             li.add(c);
        }
        return li;
        }
}
