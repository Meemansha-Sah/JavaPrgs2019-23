class PrimeCheckA
{
    public static void main(int N)
    {
        int fc=0;
        for(int i=1;i<=N;i++)
        {
            if(N%i==0) fc++;
        }
        if(fc==2) System.out.println(N+" is a prime Number");
        else System.out.println("It is not a prime Number");
    }
}