class BinaryR
{
    int A[];
    int v,p;
    BinaryR(int a[])
    {
        A=a;
    }
    void findValue(int V)
    {
        v=V;
        
    }
    int[] subArray(int a[],int i, int f)
    {
        int b[]=new int[f-i+1];
        for(int j=i,k=0;j<=f;j++,k++)
        {
            b[k]=a[j];
        }
        return b;
    }
    
    int binSearch(int a[])
    {
        int min=0,max=a.length-1;
        int mid=(max+min)/2;
        
        if(v==a[mid]) 
            p=mid+1;
        if(v<a[mid])  
        {
            p=mid+1+binSearch(subArray(a,0,mid-1));
            
        }
        if(v>a[mid])  
        {
            p=a.length-binSearch(subArray(a,mid+1,a.length-1));
        }
        return p;
    }
}