import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        List<Integer> li=new ArrayList<>();//creating a list here to store the integers present in the string array
        
        for(String s: operations) //for loop for traversing each string element in string array
        {
            char ch=s.charAt(0);//storing the string element in character variable as here each string element cosists of single character
            int i=li.size()-1;//storing the index of last element of list in variable 'i'
           
            switch(ch) //using switch case as it it is faster than if else
            {
                
                case '+':
                {
                 int prev=li.get(i); //storing the previous element of list in variabe 'prev'
                 int preprev=li.get(i-1); //storing the pre previous element of list in variabe 'preprev'
                  int sum=prev+preprev;
                  li.add(sum);//adding new element to the list
                  break;
                }
                case 'D':
                {
                    int prev=li.get(i); //storing the previous element of list in variabe 'prev'

                    li.add(2*prev);
                    break;
                }
                case 'C':
                {
                    li.remove(i);//removing the last element of list
                    break;
                }
                default: //default implements number in form of string
                {
                    li.add(Integer.parseInt(s));//storing the string number to the list by first converting it to integer by using Integer.prseInt() function
                }
            }

          
        }  
        int sum=0;
        for(int i=0;i<li.size();i++)
        {
            sum+=li.get(i); //calculating the sum of all list element
        }    
        return sum; //returning the sum
    }
    //TIME COMPLEXITY OF THIS CODE=O(N)
   /* public boolean isInteger(String s)
    {
        try
        {
           Integer.parseInt(s);
            return true;
        }
        catch(NumberFomatException e){
            return false;
        }
    }
    */
}