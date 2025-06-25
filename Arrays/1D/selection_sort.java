public class selection_sort//ascending
{
    public static void main(int l[])
    {
        for(int i=0;i<=l.length-1;i++)
        {
            for(int j=i+1;j<=l.length-1;j++)
            {
                if(l[i]>l[j])
                {
                    int c=l[i];
                    l[i]=l[j];
                    l[j]=c;
                }
            }
        }
        for(int i=0;i<=l.length-1;i++)
        {
            System.out.println(l[i]+"");
        }
    }
}