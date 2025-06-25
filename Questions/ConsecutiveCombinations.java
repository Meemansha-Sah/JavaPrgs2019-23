class ConsecutiveCombinations
{
    public static int[] possible_a(int N)
    {
        int A[]=new int[10];
        int j=0;
        for(int a=1;a<=(N/2);a++)
        {
            int S=0, i=a;
            while(S<N)
            {
                S+=i;
                i++;
            }
            if(S==N) { A[j]=a; j++;}
        }
        return A;
    }
    public static void main(int N)
    {
        int A[]=possible_a(N);
        for(int i=0;i<A.length;i++)
        {
            int x=A[i];
            if(x==0) break;
            int R=N;/*R=remaining*/
            while(R>0)
            {
                System.out.print(x);
                R-=x;
                x++;
                if(R==0) continue;
                System.out.print(" + ");
            }
            System.out.println(" ");
        }
    }
}