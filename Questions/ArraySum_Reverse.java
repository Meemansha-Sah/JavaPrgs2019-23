import java.util.Scanner;
public class ArraySum_Reverse
{
    int A[];
    ArraySum_Reverse(int a[])
    {
        this.A=a;
    }
    int sumE()
    {
        int sumE=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0)   sumE+=A[i];
        }
        return sumE;
    }
    int sumO()
    {
        int sumO=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==1)   sumO+=A[i];
        }
        return sumO;
    }
    int sumSq()
    {
        int sum_sq=0;
        for(int i=0;i<A.length;i++)
        {
            sum_sq+= (A[i]*A[i]);
        }
        return sum_sq;
    }
    void reverse()
    {
        for(int i=A.length-1;i>=0;i--)
        {
            System.out.print("\t"+A[i]);
        }
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Array Length?");
        int l= in.nextInt();
        int B[]= new int[l];
        System.out.println("Enter the elements");
        for(int i=0;i<l;i++)
        {
            B[i]=in.nextInt();
        }
        ArraySum_Reverse a= new ArraySum_Reverse(B);
        int sumE=a.sumE();
        int sumO=a.sumO();
        int sumSq=a.sumSq();
        System.out.println("Sum of even= "+sumE);
        System.out.println("Sum of odd= "+sumO);
        System.out.println("Sum of squares of numbers= "+sumSq);
        System.out.println(" ");
        a.reverse();
    }
}