class DisplayOrganised
{
    static int A[][],ng;
    public static void greatest()
    {
        int G=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                if(A[i][j]>G)G=A[i][j];
            }
        }
        ng=noDigits(G);
    }
    static int noDigits(int n)
    {
        int nd=0;
        while(n>0)
        {
            n/=10;
            nd++;
        }
        return nd;
    }
    static void diplay(int a[][])
    {
        A=a;
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                System.out.print(A[i][j]+"  ");
                int n=noDigits(A[i][j]);
                while(n<=ng)
                {
                    System.out.print("\t ");n++;
                }
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
}