import java.util.Scanner;
class Sort2D
{
    int A[][],B[],C[][],r,c;
    void input()
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter no.of rows ");
        r=S.nextInt();
        System.out.println("Enter no.of columns ");
        c=S.nextInt();
        A=new int[r][c];C=new int[r][c];
        System.out.println("Enter the elements of Matrix ");
        for(int i=0;i<r;i++)
        {
            System.out.println("Row "+(i+1));
            for(int j=0;j<c;j++)
            {
                System.out.println((j+1)+" :");
                A[i][j]=S.nextInt();
            }
            System.out.println(" ");
        }
    }
    void convertAtoB()
    {
        B=new int[r*c];int k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                B[k]=A[i][j]; k++;
            }
        }
    }
    void sort()
    {
        for(int i=0;i<B.length-1;i++)
        {
            for(int j=0;j<B.length-1-i;j++)
            {
                if(B[j]>B[j+1])
                {
                    int b=B[j];
                    B[j]=B[j+1];
                    B[j+1]=b;
                }
            }
        }
    }
    void convertBtoC()
    {
        int k=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                C[i][j]=B[k]; k++;
            }
        }
    }
    void display_sorted()
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(C[i][j]+"  ");
            }
            System.out.println("  ");
        }
    }
    public static void main()
    {
        Sort2D A=new Sort2D();
        A.input();
        A.convertAtoB();
        A.sort();
        A.convertBtoC();
        A.display_sorted();
    }
}