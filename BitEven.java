// generates next bit eve no

import java.util.*;
class BitEven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no less than 1024 \n");
        int n=sc.nextInt();
        System.out.println(nextBitEven(n));
    }
    
    public static int nextBitEven(int n)
    {
        int arr[]=new int[12];
        int i=0;
        while(n!=0)
        {
            int r=n%2;
            arr[i]=r;
            i++;
            n/=2;
        }
        arr[i]=0;
        int sum=0;
        int t=0;
        while(t<i)
        {
            if(arr[t]==1)
            {
                sum+=(int)(Math.pow(2,t));
                arr[t]=0;
             }
            t+=2;
        }
        
        int index=0;
        
        if(sum!=1)
        index=(int)(Math.ceil((Math.log(sum)/Math.log(2))));
        else index=1;
        
        if(index<i)
        {
            arr[index]=1;
        }
        else
        {
            arr[index]=1;
            index--;
            while(index>=0)
            {
                arr[index]=0;
                index--;
            }
        }
        
        
        int x=0;
        while(i>=0)
        {
            if(arr[i]==1)
            x+=(int)(Math.pow(2,i));
            i--;
        }
        return x;
    }
}