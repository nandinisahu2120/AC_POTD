class countprime {
    public int countPrimes(int n) {
        //List<Integer> li=new ArrayList<>();
        if(n<2)
        return 0;
        boolean[] arr=new boolean[n];
        arr[0]=false;
        arr[1]=false;
        for(int i=2;i<n;i++)
        arr[i]=true;
        for(int i=2;i*i<n;i++){
           if(arr[i]==true)
           {
            for(int j=i*i;j<n;j+=i)
            arr[j]=false;
           }
        }
            // li.add(i);
            // int c=0;
        // while(c!=li.size()){
        //     for(int j=c+1;j<li.size();j++){
        //         if(li.get(j)%li.get(c)==0)
        //             li.remove(j);
        //     }
        int c=0;
        for(int i=0;i<n;i++)
       { if(arr[i]==true)
            c++;}
 return c;
        }
       
    }
