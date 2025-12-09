class rotate_array {
    public void reverse(int[] arr,int start,int end)
    {
        while(start<end){
            int t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        // int[] arr=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     arr[(i+k)%nums.length]=nums[i];
        // }
        //  for(int i=0;i<nums.length;i++){
        //     nums[i]=arr[i];
        // }
        int n=nums.length-1;
        k=k%nums.length;
        reverse(nums,0,n);
        reverse(nums,0,k-1);
        reverse(nums,k,n);
        //System.out.print( Arrays.toString(nums));
    }
}