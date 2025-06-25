class Multiple3
{
    public static int getSum(int n)
    {
        if(n==1) return 3;
        return n*3+getSum(n-1);
    }

}
