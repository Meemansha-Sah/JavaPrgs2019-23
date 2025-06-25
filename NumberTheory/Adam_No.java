class Adam_No
{
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
    public static boolean isAdam_No(int N)
    {
        int rN=reverse(N);
        if((rN*rN)==reverse(N*N)) return true;
        return false;
    }
    static void rangeAdam(int l,int u)
    {
        System.out.println("Following are the Adam numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(isAdam_No(i)) System.out.println("\t"+i);
        }
    }
}
