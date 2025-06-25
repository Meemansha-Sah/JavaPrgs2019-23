class PrimeCheckB
{
    public static void main(int N)
    {
        int fc=0;
        for(int i=2;i<=N/2;i++)
        {
            if(N%i==0) fc++;
        }
        if(fc==0) System.out.println(N+" is a prime Number");
        else System.out.println("It is not a prime Number");
    }
}