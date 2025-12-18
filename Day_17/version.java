//import java.math.BigInteger;
class version {
    public int compareVersion(String version1, String version2) {
        String[] s1=version1.split("\\.");
        String[] s2=version2.split("\\.");
        int l1=s1.length;
        int l2=s2.length;
         System.out.println("s1="+version1+" s2="+version2);
        System.out.println("l1="+l1+" l2="+l2);
        if(l1>l2){
            System.out.println("chh1=");
            for(int i=0;i<l2;i++){
                String str1=s1[i];
                String str2=s2[i];
                // BigInteger n1=new BigInteger(str1);
                // BigInteger n2=new BigInteger(str2);
                // int comp=n1.compareTo(n2);
                int n1=Integer.parseInt(str1);
                int n2=Integer.parseInt(str2);
                int comp=Integer.compare(n1,n2);
                if(comp>0)
                return 1;
                else if (comp<0)
                return -1;
                else
                continue;
            }
            for(int i=l2;i<l1;i++){
                String str1=s1[i];
                String str2="0";
                // BigInteger n1=new BigInteger(str1);
                // BigInteger n2=new BigInteger(str2);
                // int comp=n1.compareTo(n2);
                int n1=Integer.parseInt(str1);
                int n2=Integer.parseInt(str2);
                int comp=Integer.compare(n1,n2);
                if(comp>0)
                {
                
                    return 1;}
                else if (comp<0)
                return -1;
                else
                continue;
            }
        }
        else
        {
            System.out.println("chh22=");
            for(int i=0;i<l1;i++){
                String str1=s1[i];
                String str2=s2[i];
                // BigInteger n1=new BigInteger(str1);
                // BigInteger n2=new BigInteger(str2);
                // int comp=n1.compareTo(n2);
                int n1=Integer.parseInt(str1);
                int n2=Integer.parseInt(str2);
                int comp=Integer.compare(n1,n2);
                if(comp>0)
                return 1;
                else if (comp<0)
                return -1;
                else
                continue;
            }
            for(int i=l1;i<l2;i++){
                String str2=s2[i];
                String str1="0";
                // BigInteger n1=new BigInteger(str1);
                // BigInteger n2=new BigInteger(str2);
                // int comp=n1.compareTo(n2);
                int n1=Integer.parseInt(str1);
                int n2=Integer.parseInt(str2);
                int comp=Integer.compare(n1,n2);
                System.out.println("s111="+n1+"s2=="+n2);
                System.out.println("comp="+comp);
                if(comp>0)
                {return 1;}
                else if (comp<0)
                return -1;
                else
                continue;
            }
        }
        return 0;
    }
}