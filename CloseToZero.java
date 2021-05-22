import java.util.*;

class CloseToZero
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        Arrays.sort(arr);
        
        int l=0;
        int r=n-1;
        int a=arr[l];
        int b=arr[r];
        
        int sum=a+b;
        int csum;
        int minl,minr;
        minr=0;
        minl=0;
        
        
        while(l<r)
        {
            a=arr[l];
            b=arr[r];
            csum=a+b;
            
            if(Math.abs(csum)<Math.abs(sum))
            {
                sum=csum;
                minl=l;
                minr=r;    
            }
            if(csum<0)
            {
                l++;
            }
            else if(csum>0)
            {
                r--;
            }
        }
       // for(int i=0;i<n;i++)
       System.out.println("\n"+minl+"\t"+minr+"\t"+sum+"\n");
        
    }
}