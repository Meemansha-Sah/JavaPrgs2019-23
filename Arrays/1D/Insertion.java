class Insertion
{
    int A[];int c;
    Insertion(int in[])
    {
        A=new int[(in.length)+1];
        for(int i=0;i<in.length;i++)
        {
            A[i]=in[i];
        }
        c=A.length-1;
        A[c]=0;
    }
    public void Insert(int in,int p)
    {
        for(int i=c;i>p-1;i--)
        {
            A[i]=A[i-1];
        }
        A[p-1]=in;
    }
    void display()
    { 
        for(int i=0;i<=c;i++)
        {
               System.out.println(A[i]);
        }
    }
    public static void main(int x[],int in,int p)
    {
        Insertion X=new Insertion(x);
        X.Insert(in,p);
        X.display();
    }
}