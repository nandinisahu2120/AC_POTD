class nextpermutation {
    public void nextPermutation(int[] nums) {
        int pos=nums.length-1,f=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1])
            {pos=i-1;
            System.out.println("pos="+pos);
           f++;
            break;
            }
        }
       
        for(int i=pos+1;i<nums.length-1;i++){
             
            for(int j=pos+1;j<nums.length-(i-(pos+1))-1;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                     
                }
            }
        }
        
           
        for(int i=pos+1;i<nums.length;i++){
            if(nums[i]>nums[pos])
            {
                int temp=nums[i];
                nums[i]=nums[pos];
                nums[pos]=temp;
                break;
            }
        }
        int s=0,l=nums.length-1;
        if(f==0){
            while(s<l){
                int t=nums[s];
                nums[s]=nums[l];
                nums[l]=t;
                s++;
                l--;
            }
        }
        //return nums;
    }
}