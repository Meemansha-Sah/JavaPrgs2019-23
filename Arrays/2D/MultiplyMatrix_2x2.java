class MultiplyMatrix_2x2
{
    int A[][],B[][],C[][],s=2;
    MultiplyMatrix_2x2(int A[][],int B[][])
    {
        this.A=A;
        this.B=B;
        C=new int[2][2];
    }
    void multiply()
    {
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                    C[i][j]=(A[i][0]*B[0][j])+(A[i][1]*B[1][j]);
            }
        }
    }
    void display()
    {
         System.out.println("The Matrix is as follows : ");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            { 
                System.out.print(C[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
    public static void main()
    {
        int a[][]=new int[2][2];a=Array2dCreateMulti.input2D_Array(2,2);
        int b[][]=new int[2][2];b=Array2dCreateMulti.input2D_Array(2,2);
        MultiplyMatrix_2x2 x=new MultiplyMatrix_2x2(a,b);
        x.multiply();
        x.display();
    }
}