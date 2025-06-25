class DecBin
{
    int D;
    static String d_b(int n)
    {
        if(n==1) return "1";
        return d_b(n/2)+n%2;
    }
}
    