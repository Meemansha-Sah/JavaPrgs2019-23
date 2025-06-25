class Correlation
{
    double Rho,Tau,Rx[],Ry[];
    int x[],y[],N;
    Correlation(int x[],int y[])
    {
        this.x=x;this.y=y;
        N=x.length;
        double rx[]=new double[N];
        double ry[]=new double[N];
        for(int i=0;i<N;i++)
        {
            rx[i]=1;
            ry[i]=1;
        }
        Rx=rx;
        Ry=ry;
    }
    void assignRank()
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i==j) continue;
                if(x[i]<x[j]) Rx[i]++;
                if(x[i]==x[j]) Rx[i]+=0.5;
                if(y[i]<y[j]) Ry[i]++;
                if(y[i]==y[j]) Rx[i]+=0.5;
            }
        }
    }
    void CalRho()
    {
        double sumD_2=0;
        for(int i=0;i<N;i++)
        {
            double d=Rx[i]-Ry[i];
            sumD_2+=d*d;
        }
        Rho=1-((6*sumD_2)/(N*(N*N-1)));
    }
    void CalTau()
    {
        double sumS_ij=0;
        for(int i=0;i<=N-2;i++)
        {
            for(int j=i+1;j<=N-1;j++)
            {
                if((x[i]>x[j] && y[i]>y[j]) || (x[i]<x[j] && y[i]<y[j]))
                   sumS_ij+=2;
                else
                   sumS_ij-=2;
            }
        }
        Tau=sumS_ij/(N*(N-1));
    }
    void correlationIs()
    {
        if(Rho>0 && Tau>0)System.out.println("there exists a +ve correlation between Mathematics & Computer Science");
        else System.out.println("there exists a -ve correlation between Mathematics & Computer Science");
    }
    public static void main(int x[],int y[])
    {
        Correlation C=new Correlation(x,y);
        C.assignRank();
        C.CalRho();
        C.CalTau();
        C.correlationIs();
    }
}