class Solution {
    public int[] plusOne(int[] digits) {
        String s="";
        int n=digits.length-1,c=0;
        int d=(digits[n]+1+c)%10;
            c=(digits[n]+1+c)/10;
            s=Integer.toString(d)+s;
        for(int i=n-1;i>=0;i--){
            d=(digits[i]+c)%10;
            c=(digits[i]+c)/10;
            s=Integer.toString(d)+s;
        }
       
        if(c==1){
             int[] arr=new int[digits.length+1];
            arr[0]=c;
            for(int i=0;i<=n;i++){
                char ch=s.charAt(i);
                arr[i+1]=ch-'0';
            }
            return arr;
        }
        else{
            int[] arr=new int[digits.length];
            for(int i=0;i<=n;i++){
                char ch=s.charAt(i);
                arr[i]=ch-'0';}
            return arr;
        }
    }
}