import java.util.*;
public class A_Next_Round {
    public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int c=0;
    int[] score=new int [n]; //array to store the scores of contestants
    for(int i=0;i<n;i++)
    {
        score[i]=sc.nextInt();

    }
    for(int i=0;i<n;i++)
    {
        if(score[i]>0) //if each score is positive
        {
            if(score[i]>=score[k-1]) //if the score of current contestant is greater than or equal to the score of contestant at the kth place
                c++;
        }
    }
    System.out.println(c);  //printint the number of advancer
   }
    
}
//time complexity of this code is O(n)
