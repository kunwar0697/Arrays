import java.util.*;

class MaxDifferenece
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        
        int a=arr[0];
        int b=arr[1];
        int maxD=b-a;
        int minE=a;
        
        for(int i=1;i<n-1;i++)
        {
            b=arr[i];
            
            if((b-a)>maxD)
            maxD=b-a;
            
            if(b<a)
            a=b;
            
        }
        
        System.out.println(maxD);
        
    }
}    