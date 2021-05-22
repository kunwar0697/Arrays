import java.util.*;

class MooreVoting
{
    
 public static void main(String args[])throws Exception
 {
     Scanner sc=new Scanner(System.in);
     
     int l=sc.nextInt();
     int[] arr=new int[l];
     
     for(int i=0;i<l;i++)
     arr[i]=sc.nextInt();
     
    int voter=-1;
    int votes=0;
    
    for(int i=0;i<l;i++)
    {
       if(votes==0)
       {
           voter=arr[i];
           votes=1;
           
        }
        else
        {
            if(voter==arr[i])
             votes++;
             
             else
             votes--;
             
          
        }
        
    }
    
    if(votes>=1)
    System.out.println("\nWinner ="+voter+"\n");
    
    // incurs problem when no clear winner having n/2+1 votes
 }
}