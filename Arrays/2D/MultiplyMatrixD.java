    class MultiplyMatrixD
{
    static int A[][],B[][],C[][],r1,c1,r2,c2;
    MultiplyMatrixD(int A[][],int B[][])
    {
        this.A=A;r1=A.length;c1=A[0].length;
        this.B=B;r2=B.length;c2=B[0].length;
    }
    static boolean isPossible()
    {
        if(c1==r2)
        {
            C=new int[r1][c2]; return true;
        }
        else return false;
    }
    void multiply()
    {
        if(isPossible()==false) {System.out.println("not possible.");return;}
        else
        {
            for(int i=0;i<r;i++)
            {
                for(int j=0;j<c;j++)
                {
                    C[i][j]=A[i][j]+B[i][j];
                }
            }
        }
    }
    public static void main()
    {
        int R=Array2dCreateMulti.enterRows();
        int C=Array2dCreateMulti.enterColumns();
        int a[][]=Array2dCreateMulti.input2D_Array(R,C);
        int b[][]=Array2dCreateMulti.input2D_Array(R,C);
        MultiplyMatrix2D x=new MultiplyMatrix2D(a,b);
        x.multiply();
        x.display();
    }
    
}