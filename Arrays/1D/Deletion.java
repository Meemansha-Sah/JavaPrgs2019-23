class Deletion
{
    int A[]; int c;
    Deletion(int A[])
    {
        this.A=A;
        c=A.length;
    }
    public void Delete(int p)
    {
        for(int i=p-1;i<A.length-1;i++)
        {
            A[i]=A[i+1];
        }
        A[A.length-1]=0;c--;
    }
    void display()
    { 
        for(int i=0;i<c;i++)
        {
               System.out.println(A[i]);
        }
    }
    public static void main(int x[],int p)
    {
        Deletion X=new Deletion(x);
        X.Delete(p);
        X.display();
    }
}
        
        