class Stat
{
    int X[],F[],CF[],sF,l;
    Stat(int x[],int f[])
    {
        X=x;
        F=f;
        l=F.length;
        CF=new int[l];
        CF[0]=F[0];
        for(int i=0;i<l;i++)
        {
            sF+=F[i];
            if(i==0)continue;
            CF[i]=CF[i-1]+F[i];
        }
    }
    void display()
    {
        System.out.println("  x    f    cF  ");
        System.out.println("          ");
        for(int i=0;i<l;i++)
        {
            System.out.println("  "+X[i]+"    "+F[i]+"    "+CF[i]+"  ");
        }
    }
}