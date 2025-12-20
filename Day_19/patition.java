class partition {
    public int minPartitions(String n) {char max=n.charAt(0);
        for(int i=1;i<n.length();i++){
            char d1=n.charAt(i);
            if((d1-'0')>(max-'0'))
                max=d1;
        }
    return(max-'0');
    }
}