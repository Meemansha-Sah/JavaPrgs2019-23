import java.util.Scanner;
class Q2
{
    int A[][],B[][]; int r,c;
    void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("What should be the size of the odd sq. matrix");
        r=Array2dCreateMulti.enterRows();
        c=Array2dCreateMulti.enterColumns();
        
        A=new int[r][c];B=new int[r][c];
        for(int i=0;i<r;i++)
        {
            System.out.println("Row "+(i+1));
            for(int j=0;j<c;j++)
            { 
                System.out.print("  Column "+(j+1));
                A[i][j]=in.nextInt();
            }
            System.out.println(" ");
        }
    }
    void printMirror()
    {
         System.out.println("The Matrix is as follows : ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            { 
                System.out.print(A[i][c-1-j]+"  "); B[i][j]=A[i][c-1-j];
            }
            System.out.println(" ");
        }
    }
}