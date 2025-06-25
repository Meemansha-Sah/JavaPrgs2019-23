class Factorial
{
    static int F=1;
    private static int fac(int N)
    {
        if(N==1) return 1;
         F=N*fac(N-1);
              return F;
    }
    private static void display()
    {
        System.out.println(F);
    }
    public static void main(int n)
    {
        System.out.print("Factorial of "+n+"= ");
        fac(n);
        display();
    }
}