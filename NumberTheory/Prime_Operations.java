class Prime_Operations
{
    public static boolean isPrime(int N)
    {
        int fc=0;
        for(int i=2;i<N;i++)
        {
            if(N%i==0) fc++;
        }
        if(fc==0) return true;
        else return false;
    } 
    public static boolean isComposite(int N)
    {
        int fc=0;
        for(int i=2;i<N/2;i++)
        {
            if(N%i==0) fc++;
        }
        if(fc==0) return false;
        else return true;
    } 
    public static boolean isSemiPrime(int N)
    {
        for(int i=2;i<=N/2;i++)
        {
            if(N%i==0 && isPrime(i) ) 
            {  int fac2=N/i;
               if(isPrime(fac2)) return true;
            }
        }
        return false;
    }
    public static boolean isInterPrime(int N)
    {
        if(isPrime(N-1) && isPrime(N+1)) return true;
        return false;
    }
    public static boolean isCircularPrime(int N)
    {
        int l=Number_Functions.no_digits(N);
        boolean R=true;
        for(int i=0;i<=l;i++)
        {
            N=Number_Functions.rotate_by1(N);
            if(isPrime(N)) R=true; else return false;
        }
        return R;
    }
    public static boolean isEmirpPrime(int N)
    {
        if(isPrime(N)&&isPrime(Number_Functions.reverse(N)))return true;
        return false;
    }
    public static boolean isPalindromicPrime(int N)
    {
        if(isPrime(N)&&Number_Checks.isPalindrome(N))return true;
        return false;
    }
    public static boolean isTwinPrime(int i)
    {
        if(isPrime(i)&&isPrime(i+2))
             return true;
        else return false;
    }
    public static boolean isCousinPrime(int i)
    {
        if(isPrime(i)&&isPrime(i+4))
             return true;
        else return false;
    }
    public static boolean isChenPrime(int i)
    {
        if(isPrime(i)&&(isPrime(i+2)||isSemiPrime(i+2)))
             return true;
        else return false;
    }
    public static boolean isSophieGermanPrime(int i)
    {
        if(isPrime(i)&&isPrime((2*i)+1))
             return true;
        else return false;
    }
    public static boolean isSafePrime(int i)
    {
        if(isPrime(i)&&isPrime((i-1)/2))
             return true;
        else return false;
    }
}