class Solution {
    public int maxSubArray(int[] nums) {
        ArrayList<Integer> ar=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<nums.length;i++){
            sum+=nums[i];  
            if (sum<0)
               { if(max<sum)
                    max=sum;
                 sum=0;}
            else
            {
                if(max<sum)
                    max=sum;
            }
        }
        
        return max;
            }
}