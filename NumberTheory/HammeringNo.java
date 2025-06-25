class HammeringNo
{
    boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    boolean isHammering(int n)
    {
        int p=2;
        int c=n;
        while(c>1)
        {
            if(!isPrime(p) || c%p!=0) 
            {
                p++;
                continue;
            }
            c/=p;
            if(p>5) return false;
        }
        return true;
    }
}