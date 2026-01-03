import java.util.Stack;

public class minstack {
    Stack<int[]> st;
int min;
    public minstack() {
        st=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.isEmpty())
            min=val;
        else{min=st.peek()[1];
            if(val<min)
                min=val;
        }
        st.push(new int[]{val,min});
    }
    
    public void pop() {
       // System.out.println("vpop="+st.peek()[0]+"min="+st.peek()[1]);
        st.pop();
    }
    
    public int top() {
        return st.peek()[0];
    }
    
    public int getMin() {
        //System.out.println("val="+st.peek()[0]+"min="+st.peek()[1]);
        return st.peek()[1];
   }
}
