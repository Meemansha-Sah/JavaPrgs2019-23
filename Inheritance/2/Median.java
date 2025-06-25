class Median extends Stat
{
    Median(int x[],int f[])
    {
        super(x,f);
        int C[]=new int[F.length];
    }
    double calMedian()
    {
        double Median=0;
        if(CF[CF.length-1]%2==1)
        {
            int p=(CF[CF.length-1]+1)/2;
            for(int i=0;i<CF.length;i++)
            {
                if(CF[i]>p)
                {
                    Median=X[i-1];
                    break;
                }
            }
        }
        else
        {
            int p1=CF[CF.length-1]/2,p2=(CF[CF.length-1]/2)+1;
            for(int i=0;i<CF.length;i++)
            { 
                int a=0,b=0;
                if(i==0)continue;
                if(CF[i-1]<p1 && CF[i+1]>p1) a=X[i];
                if(CF[i-1]<p2 && CF[i+1]>p2) b=X[i];
                Median=(a+b)/2;
            }
        }
        return Median;
    }
}
