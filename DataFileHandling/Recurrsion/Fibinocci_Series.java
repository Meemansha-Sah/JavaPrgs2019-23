public class Fibinocci_Series
{
    int a, b,L,i;
    Fibinocci_Series(int l)
    {
        a=0;
        b=1;
        L=l;
        i=2;
    }
    void seriesSum(int i)
    {
        if(i>L+1) return;
        else
        {
            int c=a;a=b;b=c+a; display(c);i++;seriesSum(i);
        }
    }
    void display(int x)
    {
        System.out.println(x);
    }
    public static void main(int l)
    {
        Fibinocci_Series f=new Fibinocci_Series(l);
        f.seriesSum(2);
    }
}