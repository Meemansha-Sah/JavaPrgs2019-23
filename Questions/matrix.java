class matrix
{
    int M[][],N[][];
    matrix(int m[][])
    {
        M=m;
        N=new int[M[1].length][M.length];
    }
    void rotate()
    {
        int A[]=new int[M.length*M[1].length];
        int k=0;
        for(int i=0;i<M.length;i++)
        {
            for(int j=0;j<M[1].length;j++)
            {
                A[k]=M[i][j];
                k++;
            }
        }
        int l=0;
        
        for(int j=N[1].length-1;j>=0;j--)
        {
            for(int i=N.length-1;i>=0;i--)
            {
                N[i][j]=A[l];
                System.out.print(A[l]+"  ");
                l++;
            }
            System.out.println(" ");
        }
        int 
    }
    void display(int A[][])
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
}