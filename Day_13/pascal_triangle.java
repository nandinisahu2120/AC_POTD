import java.math.BigInteger;
class pascal_triangle {
    public int ncr(int n,int r){
       // long num=1,d=1;
        BigInteger num=BigInteger.ONE;
        BigInteger d=BigInteger.ONE;
        for(int i=n,c=r;c>=1;i--,c--){
            num=num.multiply(i);
            d=d.multiply(c);
        }
        return (int)(num/d);                

    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<>();
        System.out.println(ncr(13,11));
        System.out.println(ncr(13,12));
        System.out.println(ncr(13,13));
        for(int i=0;i<numRows;i++){
            List<Integer> sl=new ArrayList<>();
        
            for(int j=0;j<=i;j++){
                int nCr=ncr(i,j);
                sl.add(nCr);
            }
            li.add(sl);
        }
        return li;
    }
}