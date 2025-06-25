import java.util.Scanner;
class Tech_No
{
    public static void main(int N)
    {
        Scanner in=new Scanner(System.in);
        int n=Number_Functions.no_digits(N);
        if(n%2==1)  
        {
            System.out.println("Invalid Input");
            System.out.println("Please input again");
            int a=in.nextInt();
            main(a);
            return;
        }
        double a=N%Math.pow(10,(n/2));
        double b=N/Math.pow(10,(n/2));
        if((a*a+b*b)==N)System.out.println("It is a tech no.");
        else System.out.println("It is not a tech no.");
    }
}