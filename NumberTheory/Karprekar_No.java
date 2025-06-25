class Karprekar_No
{
    static int extract(int N, int i)
    {
        int ex=0;
        ex+=N%Math.pow(10,i);
        return ex;
    }
    public static int no_digits(int N)
    {
        int C=N; int c=0;
        while(C>0)
        {
            int d=C%10;
            C/=10;
            c++;
        }
        return c;
    }
    static boolean isKarprekar(int N)
    {
        int n=N;
        int sq=N*N;
        int d=no_digits(N);
        int sum=0;
        sum+=extract( sq, d);
        n/=Math.pow(10,d);
        sum+=n;
        if(N==sum)return true;
        else return false;
    }
    static void rangeKarprekar(int l,int u)
    {
        System.out.println("Following are the Karprekar numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(isKarprekar(i)) System.out.println("\t"+i);
        }
    }
}