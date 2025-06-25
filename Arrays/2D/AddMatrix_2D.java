class AddMatrix_2D
{
    int A[][],B[][],C[][],r,c;
    AddMatrix_2D(int A[][],int B[][])
    {
        this.A=A;
        this.B=B;
        r=A.length;
        c=A[0].length;
        C=new int[r][c];
    }
    void add()
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                C[i][j]=A[i][j]+B[i][j];
            }
        }
    }
    void display()
    {
        System.out.print("Sum:");
        int abc=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(abc==0)  System.out.print(A[i][j]+"  ");
                if(abc==1)  System.out.print(B[i][j]+"  ");
                if(abc==2)  System.out.print(C[i][j]+"  ");
                
                if(i==1)
                { if(j==(c-1)&& abc==0)
                    {j=0;abc++;System.out.print("  +  ");}
                else if(j==(c-1)&& abc==1)
                    {j=0;abc++;System.out.print("  =  ");}
                }
                else if(j==(c-1) && abc<2){j=0;abc++;System.out.print("     ");}
                }
        }
            abc=0;
    }
    public static void main()
    {
        int R=Array2dCreateMulti.enterRows();
        int C=Array2dCreateMulti.enterColumns();
        int a[][]=Array2dCreateMulti.input2D_Array(R,C);
        int b[][]=Array2dCreateMulti.input2D_Array(R,C);
        AddMatrix_2D x=new AddMatrix_2D(a,b);
        x.add();
        x.display();
    }
}