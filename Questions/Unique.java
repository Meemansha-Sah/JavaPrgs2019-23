//A unique-digit integer is a positive integer with no duplicate digits
import java.util.Scanner;
class Unique
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter:");
        System.out.println("1. To check if a number is unique ");
        System.out.println("2. To get a range of Unique numbers between any two numbers ");
        int i=in.nextInt();
        if(i==1) 
        {
            System.out.println("Enter a number to check if it is unique ");
            int n=in.nextInt();
            if(isUnique(n)) System.out.println(n+" is Unique");
            else System.out.println(n+" is not Unique");
        }
        else if(i==2)
        {
            System.out.println("No. 1: ");
            int a=in.nextInt();
            System.out.println("No. 2: ");
            int b=in.nextInt();
            uniqueRange(a,b);
        }
        else
        {
            System.out.println("Invalid input:  Enter Again ");
            main();
            return;
        }
    }
    static int no_digits(int i)
    {
        int n=0;
        while(i>0)
        {
            i/=10; n++;
        }
        return n;
    }
    static int[] extractDigits(int n, int l)
    {
        int A[]=new int[l];int i=(l-1); 
        while(n>0)
        {
            A[i]=n%10;
            n/=10; i--;
        }
        return A;
    }
    static boolean isUnique(int n)
    {
        int l=no_digits(n); 
        int D[]=new int[l];
        D=extractDigits(n,l);
        boolean unique=true;
        for(int i=0;i<=l-1;i++)
        {
            for(int j=0;j<=l-1;j++)
            {
                if(i==j) continue;
                if(D[i]==D[j]) unique=false;
            }
        }
        return unique;
    }
    static void uniqueRange(int m,int n)
    {
        System.out.println("The Unique-Digit Integers Are:") ;
        int c=0;
        for(int i=m;i<=n;i++)
        {
            if(isUnique(i)) 
            {
                System.out.print(i+", ");
                c++;
            }
        }
        if(c==0) System.out.print("Nil ");
        System.out.println(" ");System.out.println(" ");
        System.out.println("Frequency of Unique-Digit Integers Is: "+c);
    }
}