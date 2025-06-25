import java.util.Scanner;
class Enter1Array
{
    public static int[] inputArray()
    {
        Scanner S=new Scanner(System.in);
        System.out.println("How long should the array be");
        int l=S.nextInt();
        int A[]=new int[l];
        System.out.println("Enter the elements");
        System.out.println("    ");
        for(int i=0;i<l;i++)
        {
            System.out.print("1:");
            A[i]=S.nextInt();
        }
        return A;
    }
    public static int[][] input2D_Array()
    {
        Scanner S=new Scanner(System.in);
        System.out.println("How many rows should be there");
        int r=S.nextInt();
        System.out.println("How many columns should be there");
        int c=S.nextInt();
        int A[][]=new int[r][c];
        System.out.println("Enter the elements of:");
        System.out.println("    ");
        for(int i=0;i<r;i++)
        {
            System.out.println("Row "+(i+1)+":");
            for(int j=0;j<c;j++)
            {
                System.out.print("1:");
                A[i][j]=S.nextInt();
            }
        }
        return A;
    }
}