class Xylem_No
{
    public static boolean main(int n)
    {
        int c=n;
        int S1=n%10+n/(int)(Math.pow(10,Number_Functions.no_digits(n)-1));
        c/=10;
        int S2=0;
        while(c>10)
        {
            S2+=c%10;
            c/=10;
        }
        if(S1==S2) return true;
        else return false;
    }
}