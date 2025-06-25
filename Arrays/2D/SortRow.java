import java.util.Scanner;
class SortRow
{
    int A[][];
    int m,n;
    SortRow(int M,int N)
    {
        m=M;
        n=N;
        A=new int[m][n];
    }
    void enterMatrix()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the elements as follows:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Row:"+(i+1)+" Column:"+(j+1));
                A[i][j]=in.nextInt();
                System.out.println(" ");
            }
        }
    }
    int[] sort(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int c=a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
        }
        return a;
    }
    void sortRows()
    {
        for(int i=0;i<n;i++)
        {
            A[i]=sort(A[i]);
        }
    }
}