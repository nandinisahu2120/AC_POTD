import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
     //public int[] nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st=new Stack<>();
        Integer[] nge=new Integer[arr.length];
        for(int i=arr.length-1;i>=0;i--){
         while(!st.empty() && st.peek()<=arr[i] )
         st.pop();
         if(st.empty()){
             nge[i]=-1;
            
         }
         else
         nge[i]=st.peek();
         st.push(arr[i]);
         //li.add()
        }
        ArrayList<Integer> li=new ArrayList<>(Arrays.asList(nge));
        return li;
    }
}
