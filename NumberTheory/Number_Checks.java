public class Number_Checks
{
    public static boolean isPalindrome(int N)
    {
        if(N==Number_Functions.reverse(N)) return true;
        return false;
    } 
    public static boolean isPerfect(int N)
    {
        int sum=0;
        for(int i=1;i<N;i++)
        {
            if(N%i==0) sum+=i;
        }
        if(sum==N) return true;
        else return false;
    } 
    public static boolean isAdam_No(int N)
    {
        int rN=Number_Functions.reverse(N);
        if((rN*rN)==Number_Functions.reverse(N*N)) return true;
        return false;
    }
    public static boolean isSmith_No(int N)
    {
        int sumD=Number_Functions.sumDigits(N);
        int f[]=Number_Functions.allPrimeFactors(N);
        for(int i=0;i<f.length;i++)
        {
            if(f[i]>9) f[i]=Number_Functions.sumDigits(f[i]);
        }
        int sumF=0;
        for(int i=0;i<f.length;i++)
        {
            sumF+=f[i];
        }
        if(sumD==sumF) return true;
        return false;
    }
    public static boolean isArmstrong(int N)
    {
        int C=N;
        int sum=0;
        while(C>0)
        {
            int d=C%10;
            sum+= d*d*d;
            C/=10;
        }
        if(sum==N) return true;
        else return false;
    }
    public static boolean isNarcissistic(int N)
    {
        int C=N;
        int sum=0;
        int nd=Number_Functions.no_digits(N);
        while(C>0)
        {
            int d=C%10;
            sum+=Math.pow(d,nd);
            C/=10;
        }
        if(sum==N) return true;
        else return false;
    }
    public static boolean isDudeney(int N)
    {
        int C=N;
        int sum=0;
        while(C>0)
        {
            sum+=C%10;
            C/=10;
        }
       int cu=sum*sum*sum;
       if(cu==N)return true; else return false;
    }
    public static boolean isMagic(int N)
    {
        int C=N;
        int nd=Number_Functions.no_digits(N);
        while(nd>1)
        {
            C=Number_Functions.sumDigits(C);
            nd=Number_Functions.no_digits(N);
        }
        if (C==1) return true;
        return false;
    }
    public static boolean isAbundant(int N)
    {
        int C=N;
        int facSum=0;
        for(int i=1;i<=C/2;i++)
        {
            if(C%i==0) facSum+=i;
        }
        if(facSum>N) return true;
        return false;
    }
    public static boolean isAutomorphic(int N)
    {
        int sqN=N*N;
        if(sqN%10==N) return true;
        return false;
    }
    public static boolean isNivenNo(int N)
    {
        int sum=Number_Functions.sumDigits(N);
        if(N%sum==0) return true;
        return false; 
    }
    /*public static boolean isCyclic(int N)
    {
        for(int i=2;i<=Number_Functions.no_digits(N);i++)
        {
            int n=N*i;
        }
    }*/
    public static boolean isAmicable(int a)
    {
        int fSum1=0;
        int fSum2=0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0) fSum1+=i;
        }
        int b=fSum1;
        for(int i=1;i<=b/2;i++)
        {
            if(b%i==0) fSum2+=i;
        }
        if(fSum1==b && fSum2==a) return true;
        return false;
    }
    public static boolean isAmicable_pair(int a,int b)
    {
        int fSum1=0;
        int fSum2=0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0) fSum1+=i;
        }
        for(int i=1;i<=b/2;i++)
        {
            if(b%i==0) fSum2+=i;
        }
        if(fSum1==b && fSum2==a) return true;
        return false;
    }
}