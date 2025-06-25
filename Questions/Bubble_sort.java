public class Bubble_sort//ascending
{
    public static void main(int l[])
    {
        for(int i=0;i<l.length-1;i++)
        {
            for(int j=0;j<l.length-1-i;j++)
            {
                if(l[j]>l[j+1])
                {
                    int c=l[j];
                    l[j]=l[j+1];
                    l[j+1]=c;
                }
            }
        }
        for(int i=0;i<=l.length-1;i++)
        {
            System.out.print(l[i]+"   ");
        }
    }
}