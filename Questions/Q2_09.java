import java.util.Scanner;
class Q2_09
{
    int M[][],m,n;
    Q2_09(int M,int N)
    {
        m=M;
        n=N;
        this.M=new int[M][N];
    }
    void inputMatrix()
    {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                M[i][j]=in.nextInt();
            }
        }
    }
    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+M[i][j]+" ");
            }
            System.out.println();
        }
    }
    void displayBoundary()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0||i==(m-1)||j==(n-1))System.out.print(" "+M[i][j]+" "); 
                else System.out.print("   "); 
            }
            System.out.println();
        }
    }
    int sumBoundary()
    {
        int S=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0||i==(m-1)||j==(n-1))S+=M[i][j];
            }
            System.out.println();
        }
        return S;
    }
    void rearrangeBoundary()
    {
        Scanner in=new Scanner(System.in);
        int B[]=new int[m*n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0||i==(m-1)||j==(n-1))
                {
                    B[k]=M[i][j]; 
                    k++;
                }
            }
        }
        sort(B);
        int l=k;
        k=0;
        
        
        for(int i=0,j=0;j<m;j++)
        {
            M[i][j]=B[k];
            k++;
        }
        for(int i=1,j=(n-1);i<m;i++)
        {
            M[i][j]=B[k];
            k++;
        }
        for(int i=(m-1),j=(n-1)-1;j>=0;j--)
        {
            M[i][j]=B[k];
            k++;
        }
        for(int i=(m-1)-1,j=0;i>0;i--)
        {
            M[i][j]=B[k];
            k++;
        }
    }
    void sort(int A[])
    {
        for(int i=0;i<A.length-1;i++)
        {
            for(int j=i+1;j<A.length-1;j++)
            {
                if(A[i]>A[j])
                {
                    int c=A[i];
                    A[i]=A[j];
                    A[j]=c;
                }
            }
        }
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("M=");
        int M=in.nextInt();
        System.out.print("N=");
        int N=in.nextInt();
        System.out.println(" ");
        
        Q2_09 mm=new Q2_09(M,N);
        mm.inputMatrix();
        
        System.out.println("ORIGINAL MATRIX ");
        mm.display();
        mm.rearrangeBoundary();
        System.out.println("REARRANGED MATRIX ");
        mm.display();
        System.out.println("BOUNDARY ELEMENTS ");
        mm.displayBoundary();
        
        System.out.println(" ");
        System.out.println("SUM OF OUTER ROW AND COLUMN ELEMENTS = "+mm.sumBoundary());
    }
}