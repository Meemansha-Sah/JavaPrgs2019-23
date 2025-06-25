import java.util.Scanner;
class Markov
{
    boolean Mark;
    double M[][];
    int N;
    Markov ()
    {
        Mark=true;
    }
    void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the size for the matrix:");
        N=in.nextInt();
        if(N<3 || N>9)
        {
            System.out.print("Invalid input");
            input();
            return;
        }
        M=new double[N][N];
        System.out.println("");
        System.out.println("Enter Matrix elements:");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                M[i][j]=in.nextDouble();
                if(M[i][j]<0)
                {
                    System.out.print("Invalid input, Enter again");
                    j--;
                }
            }
        }
    }
        
    void checkMarkov()
    {
        for(int i=0;i<N;i++)
        {
            double S1=0;double S2=0;
            for(int j=0;j<N;j++)
            {
                S1+=M[i][j];
                
                S2+=M[j][i];
            }
            if(S1!=1) Mark=false;
            if(S2!=1) Mark=false;
            System.out.println("S1="+S1+", S2="+S2);
        }
    }
    public static void main()
    {
        Markov m=new Markov();
        m.input();
        m.checkMarkov();
        if(m.Mark) System.out.println("Yes, it is a Markov Matrix");
        else System.out.println("No, it is not a Markov Matrix");
    }
}