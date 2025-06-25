public class Number_Functions
{
    
    public static void extract_digits(int N)
    {
        int C=N;
        while(C>0)
        {
            System.out.print(C%10+"     ");
            C/=10;
        }
    }
    public static int reverse(int N)
    {
        int C=N;
        int R=0;
        while(C>0)
        {
            R*=10;
            R+=C%10;
            C/=10;
        }
        return R;
    }
    public static int no_digits(int N)
    {
        int C=N; int c=0;
        while(C>0)
        {
            C/=10;
            c++;
        }
        return c;
    }
    public static int rotate_by1(int N)
    {
        int n=(int)Math.pow(10,(no_digits(N)-1));
        int R=N%n;
        R*=10;
        R+=N/n;
        return R;
    }
    public static int sumAllPrimeFactors(int N)
    {
        int C=N;int sum=0;int i=2;
        while(C>1)
        {
            if(C%i==0 & PrimeCheckC.isPrime(i)){ C/=i;sum+=i;}
            else i++;
        }
        return sum;
    }
    public static int sumDigits(int N)
    {
        int C=N;
        int sum=0;
        while(C>0)
        {
            sum+=C%10;
            C/=10;
        }
        return sum;
    }
    public static int sumSqDigits(int N)
    {
        int C=N;
        int sum=0;
        while(C>0)
        {
            int d=C%10;
            sum+=d*d;
            C/=10;
        }
        return sum;
    }
    public static int ProductDigits(int N)
    {
        int C=N;
        int pro=1;
        while(C>0)
        {
            pro*=C%10;
            C/=10;
        }
        return pro;
    }
    public static int sumOfFactors(int N)
    {
        int facSum=0;
        for(int i=1;i<=N/2;i++)
        {
            if(N%i==0) facSum+=i;
        }
        return facSum;
    }
    
    public static int[] allPrimeFactors(int N)
    {
        int C=N;int i=2;
        int f[]=new int[100];
        int j=0;
        while(C>1)
        {
            if(C%i==0 & PrimeCheckC.isPrime(i)){ C/=i;f[j]=i;j++;}
            else i++;
        }
        int F[]=TrimArray.trimAr(f,j);
        return F;
    }  
}