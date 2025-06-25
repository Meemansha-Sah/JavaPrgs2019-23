class DecOct
{
    int D;
    static String d_o(int n)
    {
        if(n==0) return "";
        return d_o(n/8)+n%8;
    }
}