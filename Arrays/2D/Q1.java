import java.util.Scanner;
class Q1
{
    int A[][]; int s;
    void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("What should be the size of the odd sq. matrix");
        s=in.nextInt();
        if(s%2==0) {System.out.println("Even no. Found enter again");input();}
        else{
        A=new int[s][s];
        for(int i=0;i<s;i++)
        {
            System.out.println("Row "+(i+1));
            for(int j=0;j<s;j++)
            { 
                System.out.print("  Column "+(j+1));
                A[i][j]=in.nextInt();
            }
            System.out.println(" ");
        }
      } 
    }
    
    
    void printAll()
    {
         System.out.println("The Matrix is as follows : ");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            { 
                System.out.print(A[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }
    
    
    void printBorder()
    {
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            { 
                if(i==0||j==0||i==(s-1)||j==(s-1))
                System.out.print(A[i][j]+"  ");
                else System.out.print("    ");
            }
            System.out.println(" ");
        }
    }
    
    void sumPlus()
    {
        int sum=0; int mid=(s-1)/2;
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            { 
                if(i==mid||j==mid) sum+=A[i][j];
            }
        }
        System.out.println("Sum of + in matrix= "+sum);
    }
    public static void main()
    {
        Q1 matrix=new Q1();
        matrix.input();
        matrix.printAll();
        matrix.printBorder();
        matrix.sumPlus();
    }
}