import java.util.Stack;

public class largestrect {
    public int largestRectangleArea(int[] heights) {
        // int[] rect=new int[heights.length];
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<heights.length;i++)
        // { 
        //     int area=heights[i];
        //     for(int j=i+1;j<heights.length;j++){
        //         if(heights[j]>=heights[i])
        //         area+=heights[i];
        //         else
        //         break;
        //     }
        //     for(int j=i-1;j>=0;j--){
        //         if(heights[j]<=heights[i])
        //         area+=heights[i];
        //         else
        //         break;
        //     }
        //     if(max<area)
        //     max=area;
        // }
        // return max;
        if(heights.length==1)
        return heights[0];
        Stack<int[]> leftgreater=new Stack<>();
        Stack<int[]> rightgreater=new Stack<>();
        leftgreater.push(new int[]{heights[0],1});
        rightgreater.push(new int[]{heights[heights.length-1],0});
        int[] lf=new int[heights.length];
        int[] ri=new int[heights.length];
        lf[0]=1;ri[0]=1;
        for(int i=1;i<heights.length;i++){
            //System.out.println("left");
            if(!leftgreater.empty() && heights[i]>leftgreater.peek()[0])
                leftgreater.push(new int[]{heights[i],1});
            else
            {
                int t=1;
                while(!leftgreater.empty() && heights[i]<=leftgreater.peek()[0])
                {
                     t=t+leftgreater.peek()[1];
                    leftgreater.pop();
                }
            leftgreater.push(new int[]{heights[i],t});}
            lf[i]=leftgreater.peek()[1];
        }
        for(int i=heights.length-2;i>=0;i--){
            //System.out.println("right");
            if(!rightgreater.empty()&&heights[i]>rightgreater.peek()[0])
                rightgreater.push(new int[]{heights[i],0});
            else
            {
                int t=0;
                while(!rightgreater.empty() && heights[i]<=rightgreater.peek()[0])
                {
                     t+=1+rightgreater.peek()[1];
                    rightgreater.pop();
                }
            rightgreater.push(new int[]{heights[i],t});}
            ri[i]=rightgreater.peek()[1];
        }
        //   for(int i=0;i<heights.length;i++){
        //     System.out.print(" "+lf[i]+" ");}
        //     System.out.println();
        //   for(int i=0;i<heights.length;i++){
        //     System.out.print(" "+ri[i]+" ");}
        //     System.out.println();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            int temp=(lf[i]+ri[i])*heights[i];
            if(max<temp)
                max=temp;
        }
        return max;
    }
}
