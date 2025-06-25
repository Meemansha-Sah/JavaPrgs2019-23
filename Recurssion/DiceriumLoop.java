class DiceriumLoop
{
    int num;
    DiceriumLoop(int nn)
    {
        num=nn;
    }
    int no_digits()
    {
        int c=0,copy=num;
        while(copy>0)
        {
            copy/=10;
            c++;
        }
        return c;
    }
    int powersN()
    {
        int nD=no_digits();
        int N=0,c=num;;
        while(c>0)
        {
            N+=Math.pow(c%10,nD);
            c/=10;nD--;
        }
        return N;
    }
    boolean isDicerium()
    {
        if(num==powersN()) return true;
        return false;
    }
}