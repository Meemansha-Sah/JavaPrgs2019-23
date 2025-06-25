class Demo3
{
    public void display(int n,int L)
    {
        if(n<=L) 
        {
            System.out.println(n);
            display(n+1,L);
        }
    }
}