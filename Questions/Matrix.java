import java.util.Scanner;
class Matrix
{
    int A[][];
    int r,c;
    Matrix()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the no.of rows in matrix: ");
        r=in.nextInt();
        System.out.print("Enter the no.of columns in matrix: ");
        c=in.nextInt();
        
        A=new int[r][c];
    }
    void input()
    {
        System.out.println("Enter the elements for the "+r+"x"+c+" matrix.");
        Scanner in=new Scanner(System.in);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println((i+1)+""+(j+1)+":");
                A[i][j]=in.nextInt();
            }
        }
    }
    void display()
    {
        System.out.println("The matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(A[i][j]+"   ");
            }
            System.out.println("   ");
        }
    }
}