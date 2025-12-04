class GCD_OF_ARRAY{O
    public int findGCD(int[] nums) {
        Arrays.sort(nums); //sorting the array with time complexity O(n log n)
        int max=nums[nums.length-1];//finding the maximum element
        int min=nums[0];//finding the minimum element
        int hcf=1;
        for(int i=2;i<=min;i++) //O(min of array nums)~=O(min(nums))
        {
            if(max%i==0 && min%i==0)
            {
                hcf=i; //finding the hcf of maximum and minimum element
            }

        }
        return hcf;//returning the hcf
        }
}
//the time complexity of this code is O(n log n +min(nums))