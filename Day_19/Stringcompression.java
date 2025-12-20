class Stringcompression {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        char prev=word.charAt(0);
        int c=1;
       for(int i=1;i<word.length();i++){
           char current=word.charAt(i);
           if(prev==current && c<9)
               c++;
           else{
               System.out.println("c"+c);
            //    String s=Integer.toString(c);
            //    sb.append(s);
            //    sb.append(prev);
            sb.append(c).append(prev);
               prev=current;
               c=1; 
           }
       }
        // String s=Integer.toString(c);
        //        sb.append(s);

               sb.append(c).append(prev);
               return (sb.toString());
               
    }
}