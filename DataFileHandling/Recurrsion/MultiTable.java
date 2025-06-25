class MultiTable
{
    int N;
    MultiTable(int n)
    {
        N=n;
    }
    void printTable(int i)
    {
        if(i>10) return;
        else
        {
            System.out.println(N+" X "+i+" = "+(N*i));  i++; printTable(i);
        }
    }
    public static void main(int n)
    {
        MultiTable m=new MultiTable(n);
        System.out.println("Multiplication Table of "+n+":");
        m.printTable(1);
    }
}