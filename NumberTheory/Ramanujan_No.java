class Ramanujan_No
{
    public static void main(int N)
    {
        int C=N; int count=0;
        for(int i=1;i<=N;i++)
        {
            double b=C-i*i*i;
            double B=Math.cbrt(b);
            double d=B-(int)B;
            if(d==0) 
            {
                count++;
            }
        }
        if(count>=3) System.out.println(N+" is a Ramanujan Number.");
        else System.out.println(N+" is not a Ramanujan Number.");
    }
}