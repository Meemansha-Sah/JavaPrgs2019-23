class TrimArray
{
    public static int[] trimAr(int A[], int l)
    {
        int N[]=new int[l];
        for(int i=0;i<l;i++)
        {
            N[i]=A[i];
        }
        return N;
    }
    public static double[] trimAr(double A[], int l)
    {
        double N[]=new double[l];
        for(int i=0;i<l;i++)
        {
            N[i]=A[i];
        }
        return N;
    }
    public static String[] trimAr(String A[], int l)
    {
        String N[]=new String[l];
        for(int i=0;i<l;i++)
        {
            N[i]=A[i];
        }
        return N;
    }
}