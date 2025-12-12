public class longest_common_prefix {

    public String longestCommonPrefix(String[] strs) {
        String str=strs[0];
        StringBuilder sb=new StringBuilder();
        int l=strs.length;
        for(int i=1;i<l;i++){
            sb.setLength(0);
            for(int j=0;j<Math.min(str.length(),strs[i].length());j++){
                if(str.charAt(j)!=strs[i].charAt(j))
                break;
                else
                {
                     char ch=str.charAt(j);
                   // System.out.println("ch= "+ch);
                   
                sb.append(ch);}
            }
            str=sb.toString();
            
        }
        return str;
    }

    
}
