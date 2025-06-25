class traverse
{
    int A[];int l;
    traverse(int a[])
    {
        A=a;
        l=a.length;
    }
    void print(int i)
    {
        if(i>=l) return;
        else { System.out.println(A[i]+"  "); i++;print(i);}
    }
    public static void main(int a[])
    {
        traverse T=new traverse(a);
        T.print(0);
    }
}