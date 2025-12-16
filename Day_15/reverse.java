class reverse {
    public String reverseVowels(String s) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                li.add(i);
        }
        char[] ch=s.toCharArray();
        int start,end;
        //System.out.println("size "+li.size() );
        for(int i=0;i<(li.size())/2;i++){
            start=li.get(i);
            end=li.get(li.size()-1-i);
            char c=ch[start];
            ch[start]=ch[end];
            ch[end]=c;
            //System.out.println("i" +i);
        }
        s=new String(ch);
        return s;
    }
}