/*
 Maximum sum of i*arr[i] among all rotations of a given array
Given an array arr[] of n integers, find the maximum that maximizes sum of value of i*arr[i] where i varies from 0 to n-1.
 */

import java.io.*;
import java.util.*;

class ArrayRotationSum
{
    public static void main(String ags[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int sum=sc.nextInt();
        int arrsum=0;
        int currsum=0;
        int maxsum=0;
        int ind=0,i=0;
        
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            arrsum+=arr[i];
            currsum+=(i*arr[i]);
        }
        
        maxsum=currsum;
        
        for(int j=1;j<n;j++)
        {
           currsum=currsum+arrsum-n*arr[n-j];
           if(currsum>maxsum)
           {
               ind=j;
               maxsum=currsum;
           }
        }
        
        System.out.println(maxsum);
        for(i=ind;i<n;i++)
        System.out.print(arr[i]+"  ");
        for(i=0;i<ind;i++)
        System.out.print(arr[i]+"  ");
        
    }    
}