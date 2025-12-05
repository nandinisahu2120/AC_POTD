
class count_symmetric_integers {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++)
            {
                int d=(int)(Math.log10(i))+1;//finding the number of digits
                
                if(d%2==1) //not checking for digits with odd numbers
                    continue;
                else{
                    
                    //System.out.println(d);
                    int t=(int)Math.pow(10,d/2); 
                    int d1=i%t;//extracting the second half of the digit
                    int d2=i/t;//extracting the first half of the digit
                    if(digitsum(d1)==digitsum(d2)) //checking if sum of first half digit is equal to second half or not
                        c++;//if it is then increace c by 1
                }
            }
        return c; //returning the count of symmetric integers
    }
    public int digitsum(int n){ //function to find the sum of digits
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
}
//time complexity=O(N) where N=high-low+1