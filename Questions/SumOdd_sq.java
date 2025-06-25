public class SumOdd_sq
{
    public static void main(int series[])
    {
        int l=series.length;
        int sum=0;
        for(int i=0;i<=l-1;i++)
        {
            if(series[i]%2==1)
            {
                sum+=Math.pow(series[i],2);
            }
        }
        System.out.println(sum);
    }
}