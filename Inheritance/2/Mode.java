class Mode extends Stat
{
    Mode(int x[],int f[])
    {
        super(x,f);
    }
    int findMode()
    {
        int Mode=0, Mv=0;
        for(int i=0;i<l;i++)
        {
            if(Mode<F[i]){Mode=F[i];Mv=X[i];}
        }
        return Mv;
    }
}