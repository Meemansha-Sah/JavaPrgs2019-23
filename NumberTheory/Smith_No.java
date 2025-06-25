class Smith_No
{
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
    public static boolean isSmith_No(int N)
    {
        int sumD=sumDigits(N);
        int f[]=allPrimeFactors(N);
        for(int i=0;i<f.length;i++)
        {
            if(f[i]>9) f[i]=sumDigits(f[i]);
        }
        int sumF=0;
        for(int i=0;i<f.length;i++)
        {
            sumF+=f[i];
        }
        if(sumD==sumF) return true;
        return false;
    }
    static void rangeSmith(int l,int u)
    {
        System.out.println("Following are the Smith numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(isSmith_No(i)) System.out.println("\t"+i);
        }
    }
}
