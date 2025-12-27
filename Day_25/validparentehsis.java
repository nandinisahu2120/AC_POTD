class Solution {
    public void duplicateZeros(int[] arr) {
       
        int c=0,i=0;
        int[] ar=arr.clone();
       // for(int i=0;i<arr.length;i++)
       while(c<arr.length)
        {
            if(ar[i]==0){
                //q.offer(arr[i+1]);
                //arr[i+1]=0;
                arr[c++]=0;
                if(c<arr.length)
                {arr[c++]=0;}
                
            }
            else{
                //q.offer(arr[i+1]);
                //arr[i]=q.poll();
                arr[c++]=ar[i];
            }
            System.out.println("c="+c);
            // arr[i]=ar[i];
             i++;
        }
        // while(i<arr.length){
        //      arr[i]=ar[i];
        //     i++;
        //}
    }
}