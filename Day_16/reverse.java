class reverse {
    public String reverseWords(String s) {
      String str=s.trim();
      String[] words=str.split(" ");
        StringBuilder sb=new StringBuilder ();
        for(int i=words.length-1;i>=0;i--){
        String word=words[i].trim();
            if(word=="")
                continue;
            sb.append(word);
            System.out.println(":"+word+":");
            sb.append(" ");
            
        }
        String result=sb.toString().trim();
        return result;
    }
}