import java.util.*;

class ArraySumPair
{
  public static void main(String args[])throws Exception
  {
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[10];
      
      for(int i=0;i<10;i++)
      arr[i]=sc.nextInt();
      
      System.out.println("\nSUM\n");
      int sum=sc.nextInt();
      
      calcPair(arr,sum);
      
  }
  
  static void calcPair(int[] arr,int sum)
  {
      int hash[]=new int[20];
      int i=0;
      for(i=0;i<sum;i++)
      hash[i]=0;
      
      for(i=0;i<arr.length;i++)
      {
        int a=arr[i];
        int b=sum-a;
        
        if(hash[b]==1)
        System.out.println(a+"  "+b+"\n");
        
        hash[a]=1;
        
      }
      
      
    }
}
