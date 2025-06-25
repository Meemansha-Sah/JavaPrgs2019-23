class Power
{
    static int P=1;
    static int pow(int n,int i)
    {
        if(i==0 )return 1;
        P=n*pow(n,i-1);
        return P;
    }
    public static void main(int n,int p)
    {
        System.out.print(n+"^"+p+"="+pow(n,p));
    }
}