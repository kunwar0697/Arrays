import java.io.*;
import java.util.*;

class ArrayRotation
{
    static int gcd(int x,int k)
    {
        if(k==0)
        return x;
        else return gcd(k,x%k);
    }

    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int[] arr=new int[n];
        
        
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
        int p=gcd(n,d);
        int k=0;
        int temp;
        for(int j=0;j<p;j++)
        {
            int x=arr[j];
            k=j;
            
            do{
                k=(k+d)%n;
                temp=arr[k];
                arr[k]=x;
                x=temp;
                
            }while(k!=j);
            
        }
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
    }
    
}