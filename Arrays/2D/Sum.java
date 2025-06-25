class Sum
{
    static int A[][];
    static void sumArray()
    {
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                sum+=A[i][j];
            }
        }
        System.out.println(sum);
    }
    static void sumRow()
    {
        for(int i=0;i<A.length;i++)
        {
            int sum=0;
            for(int j=0;j<A[0].length;j++)
            {
                sum+=A[i][j];
            }
            System.out.println(sum);
        }
    }
    static void sumColumn()
    {
        for(int i=0;i<A.length;i++)
        {
            int sum=0;
            for(int j=0;j<A[0].length;j++)
            {
                sum+=A[j][i];
            }
            System.out.print(sum+"  ");
        }
    }
    static void sumDiagonal()
    {
        int s1=0,s2=0;
        for(int i=0;i<A.length;i++)
        {
            s1+=A[i][i];
            s1+=A[i][A.length-1-i];
        }
        System.out.print(s1+" & "+s2);
    }
}