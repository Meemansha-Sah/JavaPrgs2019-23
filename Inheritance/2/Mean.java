class Mean extends Stat
{
    Mean(int x[],int f[])
    {
        super(x,f);
    }
    int calMean()
    {
        int sFX=0;int Mean;
        for(int i=0;i<l;i++)
        {
            sFX+=X[i]*F[i];
        }
        Mean=sFX/sF;
        return Mean;
    }
}