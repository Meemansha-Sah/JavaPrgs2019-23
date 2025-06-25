// Meemansha Sah
// Q.2.
//prg to find nth prime no. in a range
class PrimeAtPosition
{
    static boolean isPrime(int n) // to check if a prime
    {
        for(int i=2;i<(n/2+1);i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }
    static void find_atPosition(int l,int u,int n)
    {
        int cp=0;
        for(int i=l;i<=u;i++)
        {
            if(isPrime(i)) cp++;
            if(cp==n)
            {
                System.out.println(n+"th prime no. found between "+l+" and "+u+" is "+i);
                break;
            }
        }
        if(cp<n)
        System.out.println("There is no"+n+"th prime no. between "+l+" and "+u);
    }
    public static void main(int L,int U,int n)
    {
        find_atPosition(L,U,n);
    }
}