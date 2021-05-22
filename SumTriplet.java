import java.util.*;

class SumTriplet
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
         for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
        
        System.out.println("\nX\n");
        int x=sc.nextInt();
        
        Arrays.sort(arr);
        int l,r,i;
        l=r=0;
        int sum=0;
        boolean flag=false;
        outer:for(i=0;i<n-2;i++)
        {
            l=i+1;
            r=n-1;
            
            inner:while(l<r)
            {
                sum=x-arr[i];
                if(sum==arr[l]+arr[r])
                {
                    flag=true;
                    break outer;
                    
                }
                else if(sum<arr[l]+arr[r])
                {
                    r--;
                }
                else l++;
            }
        }
        
        if(flag)
        System.out.println("\n"+arr[i]+"\n"+arr[l]+"\n"+arr[r]);
        else System.out.println("0");
    }
}