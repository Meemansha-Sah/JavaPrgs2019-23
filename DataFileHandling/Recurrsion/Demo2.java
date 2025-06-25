class Demo2
{
    public void display(int n)
    {
        if(n>5) return;
        else
        {
            System.out.println("xyz");
            display(n+1);
        }
    }
}