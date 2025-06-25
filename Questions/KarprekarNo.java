import java.util.Scanner;
class KarprekarNo
{
    static int noDigits(int n)
    {
        int d=0;
        while(n>0)
        {
            n/=10;d++;
        }
        return d;
    }
    static boolean isKaprekar(int n)
    {
        int sqN=n*n; int d=noDigits(sqN); int a=0,b=0; int c=n;
        if(d%2==0) 
        {
            a=sqN%(int)Math.pow(10,(d/2)); b=(int)Math.floor(sqN/Math.pow(10,(d/2)));
        }
        else 
        {
            a=sqN%(int)Math.pow(10,((d+1)/2)); b=(int)Math.floor(sqN/Math.pow(10,((d+1)/2)));
        }
        if(a+b==n) return true;
        return false;
    }
    static void RangeKarprekar(int p, int q)
    {
        System.out.println("The Karprekar Numbers are: ");
        int c=0;
        for(int i=p;i<=q;i++)
        {
            if(isKaprekar(i)) {System.out.print(i+", ");c++;}
        }
        System.out.println("Frequency of Karprekar Numbers is: "+c);
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter:");
        System.out.println("1. To check if a number is a Karprekar Number ");
        System.out.println("2. To get a range of Karprekar numbers between any two numbers ");
        int i=in.nextInt();
        if(i==1) 
        {
            System.out.println("Enter a number to check if it is a Karprekar Number ");
            int n=in.nextInt();
            if(isKaprekar(n)) System.out.println(n+" is a Karprekar Number");
            else System.out.println(n+" is not a Karprekar Number");
        }
        else if(i==2)
        {
            System.out.println("No. 1: ");
            int a=in.nextInt();
            System.out.println("No. 2: ");
            int b=in.nextInt();
            RangeKarprekar(a,b);
        }
        else
        {
            System.out.println("Invalid input:  Enter Again ");
            main();
            return;
        }
    }
}