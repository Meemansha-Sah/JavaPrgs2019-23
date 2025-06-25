import java.util.Scanner;
class Matrix2
{    int M; int MM[][];
    Matrix2(int m)
    {
        M=m;
        int mm[][]=new int[M][M];
        MM=mm;
    }
    boolean isValidInput(int m)
    {
        if(m>3 && m<10) return true;
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
    void displayMatrix2()
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
    int[] SequentialSort(int n[])
    {
        for(int i=0;i<=n.length-1;i++)
        {
            for(int j=0;j<=n.length-1;j++)
            {
                if(n[j]>n[i])
                {
                    int c=n[i];
                    n[i]=n[j];
                    n[j]=c;
                }
            }
        }
        return n;
    }
    void Rearrange()
    {
        int n=(M-2)*(M-2); 
        int N[]=new int[n]; 
        int k=0;
        for(int i=1;i<M-1;i++)
        {
            for(int j=1;j<M-1;j++)
            {
                N[k]=MM[i][j];
                k++;
            }
        }
        N=SequentialSort(N);
        k=0;
        for(int i=1;i<M-1;i++)
        {
            for(int j=1;j<M-1;j++)
            {
                MM[i][j]=N[k];
                k++;
            }
        }
    }
    void sumDisplayDiagonals()
    {
        System.out.println("  ");
        System.out.println("Diagonal Elements ");
        int S=0;
        for(int i=0;i<M;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(i==j) {System.out.print(MM[i][j]+"  "); S+=MM[i][j];}
                else if((i+j)==(M-1)) {System.out.print(MM[i][(M-1-i)]+"  ");S+=MM[i][(M-1-i)];}
                else System.out.print("  ");
            }
            System.out.println(" ");
        }
        System.out.println("Sum of the Diagonals= "+S);
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter:");
        System.out.println("The Size of the Square Matrix2");
        int m=in.nextInt();
        Matrix2 A=new Matrix2(m);
        if(A.isValidInput(m)==false) {main(); return;}
        A.input();
        System.out.print((char)12);
        System.out.println("Original Matrix ");
        A.displayMatrix2();
        System.out.print(" ");
        System.out.println("Rearranged Matrix ");
        A.Rearrange();
        A.displayMatrix2();
        A.sumDisplayDiagonals();
    }
}