class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
       
        HashMap<Integer,Integer> hp1=new HashMap<>();  //first HashMap to store unique elements of nums1 array
        for(int i:nums1)
        hp1.put(i,hp1.getOrDefault(i,0)+1);
        HashMap<Integer,Integer> hp2=new HashMap<>();//second HashMap to store unique elements of nums2 array
        for(int i:nums2)
        hp2.put(i,hp2.getOrDefault(i,0)+1);
        HashMap<Integer,Integer> hp3=new HashMap<>();//third HashMap to store unique elements of nums3 array
        for(int i:nums3)
        hp3.put(i,hp3.getOrDefault(i,0)+1);
        HashMap<Integer,Integer> unique=new HashMap<>(); //fouth HashMap to store store those elements which appears atleat in two arrays
        for(int key:hp1.keySet())  //iterating over keyset of hashmap 1
        {
           if (hp2.containsKey(key)||hp3.containsKey(key)) 
           unique.put(key,unique.getOrDefault(key,0)+1);
        }
        for(int key:hp2.keySet())
        {
           if (hp3.containsKey(key))
           unique.put(key,unique.getOrDefault(key,0)+1);
        }

        ArrayList<Integer> al=new ArrayList<>();
        for(int key:unique.keySet())//storing the elements which appears atleat in two arrays in an array list
        {
            al.add(key);
        }
        return al;
    }
}
//time complexity=O(M+N+P)