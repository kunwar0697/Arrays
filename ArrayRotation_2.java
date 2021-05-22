import java.util.*;
import java.io.*;

class ArrayRotation_2
{
    static void reverse(int arr[],int l,int u)
    {
        int temp;
        
        while(l<u)
        {
            temp=arr[l];
            arr[l]=arr[u];
            arr[u]=temp;
            l++;
            u--;
            
        }
    }
    public static void main()
    {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int d=sc.nextInt();
        
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
            
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
        for(int i=0;i<n;i++)
       System.out.print("\t"+arr[i]);
        
    }
}