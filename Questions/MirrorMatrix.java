class MirrorMatrix extends Matrix
{
    int B[][];
    MirrorMatrix()
    {
        super();
        B=new int[r][c];
    }
    void findMirror()
    {
        int l=c-1;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                B[i][j]=A[i][l-j];
            }
        }
    }
    void display()
    {
        super.display();
        System.out.println("The mirror matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(B[i][j]+"   ");
            }
            System.out.println("   ");
        }
    }
}