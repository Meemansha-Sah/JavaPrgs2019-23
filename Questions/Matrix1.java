import java.util.Scanner;
class Matrix1
{    int M; int MM[][];
    Matrix1(int m)
    {
        M=m;
        int mm[][]=new int[M][M];
        MM=mm;
    }
    boolean isValidInput(int m)
    {
        if(m>2 && m<10) return true;
        return false;
    }
    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers repectively:");
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                System.out.println("R: "+(i+1)+" C: "+(j+1));
                MM[i][j]=in.nextInt();
            }
        }
    }
    void displayMatrix1()
    {
        for(int i=0;i<M;i++)
        {
            System.out.println(" ");
            for(int j=0;j<M;j++)
            {
                System.out.print(MM[i][j]+"  ");
            }
        }
    }
    boolean isSymmetric()
    {
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(MM[i][j]!=MM[j][i]) return false;
            }
        }
        return true;
    }
    void sumDiagonal()
    {
        int S1=0,S2=0;
        for(int i=0;i<M;i++)
        {
            S1+=MM[i][i];
            int j=M-1-i;
            S2+=MM[i][j];
        }
        System.out.println("Sum of Left Diagonal= "+S1);
        System.out.println("Sum of Right Diagonal= "+S2);
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter:");
        System.out.println("The Size of the Square Matrix1");
        int m=in.nextInt();
        Matrix1 A=new Matrix1(m);
        if(A.isValidInput(m)==false) {main(); return;}
        A.input();
        System.out.print((char)12);
        A.displayMatrix1();
        System.out.println(" ");
        if(A.isSymmetric()) System.out.println("It is Symmetric");
        else System.out.println("It is not Symmetric");
        A.sumDiagonal();
    }
}