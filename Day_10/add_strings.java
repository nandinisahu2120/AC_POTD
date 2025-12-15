class add_strings {
    public String addStrings(String num1, String num2) {
        int l1=num1.length();
        int l2=num2.length();
        int c=0;
        String s3="";
        if(l1<l2){
            for(int i=l2-1;i>=0;i--){
                if(i-(l2-l1)>=0){
                    char s1=num1.charAt(i-(l2-l1));
                    char s2=num2.charAt(i);
                    int a=s1-'0';
                    int b=s2-'0';
                    int d=(a+b+c)%10;;
                    c=(a+b+c)/10;
                    s3=Integer.toString(d)+s3;
                   // num1=num1-Character.toString(s1);
                   // num2=num2-Character.toString(s2);

                }
                else{
                    String s1=Character.toString(num2.charAt(i));
                    int a=Integer.parseInt(s1);
                    int d=(a+c)%10;
                    c=(a+c)/10;
                    s3=Integer.toString(d)+s3;
                    //num2=num2-s1;
                }

            }
            if(c!=0)
            s3=Integer.toString(c)+s3;
        }
        else
        {
            for(int i=l1-1;i>=0;i--){
                if(i-(l1-l2)>=0){
                    char s2=num2.charAt(i-(l1-l2));
                    char s1=num1.charAt(i);
                    int a=s1-'0';
                    int b=s2-'0';
                    int d=(a+b+c)%10;;
                    c=(a+b+c)/10;
                    s3=Integer.toString(d)+s3;
                    //num1=num1-Character.toString(s1);
                    //num2=num2-Character.toString(s2);

                }
                else{
                    String s1=Character.toString(num1.charAt(i));
                    int a=Integer.parseInt(s1);
                    int d=(a+c)%10;
                    c=(a+c)/10;
                    s3=Integer.toString(d)+s3;
                    //num1=num1-s1;
                }

            }
            if(c!=0)
            s3=Integer.toString(c)+s3;
        }                       
        return s3;

    }
}