import java.util.Scanner;
class Array2dCreateMulti
{
    static int r,c;
    static int enterRows()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows in the array");
        r=in.nextInt();
        return r;
    }
    static int enterColumns()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of columns in the array");
        c=in.nextInt();
        return c;
    }
    public static int[][] input2D_Array(int r,int c)
    {
        Scanner S=new Scanner(System.in);
        int A[][]=new int[r][c];
        System.out.println("Enter the elements of:");
        System.out.println("    ");
        for(int i=0;i<r;i++)
        {
            System.out.println("Row "+(i+1)+":");
            for(int j=0;j<c;j++)
            {
                System.out.print((j+1)+" :");
                A[i][j]=S.nextInt();
            }
        }
        return A;
    }
}