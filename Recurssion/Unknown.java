public class Unknown
{
    int Unknown(int a,int b)
    {
        if(a<=0) return ++a;
        else return Unknown(--a,b++)+b;
    }
    int mystery()
}