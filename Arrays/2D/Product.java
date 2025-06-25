class Product
{
    static int A[][];
    static void proRow()
    {
        for(int i=0;i<A.length;i++)
        {
            long pro=1l;
            for(int j=0;j<A[0].length;j++)
            {
                pro*=A[i][j];
            }
            System.out.println(pro);
        }
    }
    static void proColumn()
    {
        for(int i=0;i<A.length;i++)
        {
            long pro=1l;
            for(int j=0;j<A[0].length;j++)
            {
                pro*=A[j][i];
            }
            System.out.print(pro+"  ");
        }
    }
    static void proDiagonal()
    {
        int p1=1,p2=1;
        for(int i=0;i<A.length;i++)
        {
            p1*=A[i][i];
            p1*=A[i][A.length-1-i];
        }
        System.out.print(p1+" & "+p2);
    }
}