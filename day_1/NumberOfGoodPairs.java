package potdsCF;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int num=nums.length;
        for(int i=0;i<num-1;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                if(nums[i]==nums[j])
                    count++;
            }
        }
        return count;
    }
}
