import java.util.*;

class EquilibriumPoint
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        int[] lsum=new int[n];
        int[] rsum=new int[n];
        int i=0;
        int j=n-1;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        lsum[0]=arr[0];
        rsum[n-1]=arr[n-1];
        
        for(i=1,j=n-2;(i<n)&&(j>=0);i++,j--)
        {
            lsum[i]=lsum[i-1]+arr[i];
            rsum[j]=rsum[j+1]+arr[j];
        }
        
        for(i=0;i<n-1;i++)
        {
            if(lsum[i]==rsum[i+1])
            {
                System.out.println("\neq pt  "+i);
                break;
            }
        }
    }
}