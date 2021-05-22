class OddOccurances{
    void countOccurances(int []arr)
    {
        int res=0;
        
        for(int i:arr)
        res=res^i;
        
        System.out.println(res);
    }

    public static void main(String args[])
    {
        int a[]={121,2,2,2,2,121,3,3,3,3,121};
        OddOccurances oc=new OddOccurances();
        oc.countOccurances(a);
    }
}
