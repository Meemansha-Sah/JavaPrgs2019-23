class BouncyIncreaseDecrease
{
    int n;
    static boolean inc;
    static boolean dec;
    static boolean bouncy;
    BouncyIncreaseDecrease(int N)
    {
        n=N;
        inc=true;
        dec=true;
        bouncy=false;
    }

    void isIncreasingOrDecreasing()
    {
        int c=n;
        
        while(c>9)
        {
            int a=c%10;
            c/=10;
            int b=c%10;
            if(a<b) inc=false;
            if(a>b)dec=false;
        }
        if(inc==false && dec==false) bouncy=true;
    }
    public static void main(int I)
    {
        BouncyIncreaseDecrease N=new BouncyIncreaseDecrease(I);
        N.isIncreasingOrDecreasing();
        if(inc) System.out.println("The no. is increasing.");
        else if(dec) System.out.println("The no. is decreasing.");
        else if(bouncy) System.out.println("The no. is bouncy.");
    }
}