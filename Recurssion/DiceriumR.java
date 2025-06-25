class DiceriumR
{
    int num,nD;
    DiceriumR(int nn)
    {
        num=nn;
    }
    int no_digits(int n)
    {
        int c=0,copy=n;
        while(copy>0)
        {
            copy/=10;
            c++;
        }
        nD=c;
        return c;
    }
    int powersN(int n,int p)
    {
        if(n<10) return n;
        return (int)Math.pow(n%10,p)+powersN(n/10,p-1);
    }
    int powersN(int n)
    {
        if(n<10) return n;
        int o=n%10;
        return (int)Math.pow(o,no_digits(n))+powersN((int)(n-o)/10);
    }
    boolean isDicerium()
    {
        if(num==powersN(num)) return true;
        return false;
    }
    public static void main(int n)
    {
        DiceriumR D=new DiceriumR(n);
        if(D.isDicerium()) System.out.println(n+" is a Dicerium no.");
        else System.out.println(n+" is not a Dicerium no.");
    }
}
