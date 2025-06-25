class MultiplyMatrix2D
{
    static int A[][],B[][],AB[][],m,n,p;
    MultiplyMatrix2D(int A[][],int B[][])
    {
        this.A=A;
        this.B=B;
    }
    boolean isPossible()
    {
        if(A[0].length==B.length)
        {
            m=A.length; n=B.length; p=B[0].length;
            AB=new int[m][p]; return true;
        }
        else return false;
    }
    int multiplyRCVector(int a[],int b[])
    {
        int ab=0;
        for(int i=0;i<m;i++)
        {
            ab+=a[i]*b[i];
        }
        return ab;
    }
    void multiplyMatrix()
    {
        for(int j=0;j<p;j++)
        {   
            int c[]=new int[m];
            for(int k=0;k<p;k++)
            {
                c[k]=B[k][j];
            }
            for(int i=0;i<m;i++)
            {
                AB[i][j]=multiplyRCVector(A[i],c);
            }
        }
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<p;j++)
            {
                System.out.print(AB[i][j]+"  ");
            }
            System.out.println("  ");
        }
    }
    public static void main(int a[][],int b[][])
    {
        MultiplyMatrix2D M=new MultiplyMatrix2D(a,b);
        if(M.isPossible()) M.multiplyMatrix();
        M.display();
    }
}