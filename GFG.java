/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;


class GFG{
    
public static void display(int[] ar)
{
    int i;
    for(i=0;i<ar.length-1;i++)
    System.out.print(ar[i]+" ");
    System.out.print(ar[i]);
    System.out.println();
}

    
	public static void main (String[] args)throws Exception{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		while(t>0)
		{
		    int n=Integer.parseInt(br.readLine());
		    String str=br.readLine();
		    
		     String p[]=(str.trim()).split(" ");
		     int arr[]=new int[p.length];
		     for(int x=0;x<p.length;x++)
		        arr[x]=Integer.parseInt(p[x]);
		        
		     int hi=p.length-1;
		     int lo=0;
		     
		     while(hi>lo)
		     {
		            while(arr[lo]==0 && hi>lo)
		            lo++;
		            while(arr[hi]==1 && hi>lo)
		            hi--;
		            
		            if(arr[hi]<arr[lo])
		            {
		                int temp=arr[lo];
		                arr[lo]=arr[hi];
		                arr[hi]=temp;
		                
		            }
		            hi--;
		            lo++;
		            
		     }
		     display(arr);
		     t--;
		    
		}
	}
}