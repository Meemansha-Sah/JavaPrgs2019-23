class BubbleSort
{
    int A[];
    BubbleSort(int a[])
    {
        A=a;
    }  
    void sort()
    {
        for(int i=0;i<A.length-1;i++)
        {
            for(int j=0;j<A.length-1-i;j++)
            {
                if(A[j]>A[j+1])
                {
                    int c=A[j];
                    A[j]=A[j+1];
                    A[j+1]=c;
                }
            }
        }
    }
    void display()
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]+", ");
        }
    }
}