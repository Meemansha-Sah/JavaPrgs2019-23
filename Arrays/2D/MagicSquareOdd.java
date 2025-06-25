class MagicSquareOdd
{
   static boolean isMultiple(int n,int m)
    {
        if(n%m==0)return true;
        return false;
    }
    public static void main(int rc)
    {
        int A[][]=new int[rc][rc];
        int i=0,j=0;
        for(int n=1;n<=rc*rc;n++)
        {
            if(n==1)j=(rc-1)/2;
            else if(isMultiple(n-1,rc))i++;
            else{--i;++j;}
            //System.out.print("");
            if(i<0)i=rc-1;

            if(j==rc)j=0;
            A[i][j]=n;
        }
        System.out.println("");
        for(i=0;i<rc;i++)
        {
            for(j=0;j<rc;j++)
            {
                System.out.print(A[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("");
        DisplayOrganised.diplay(A);
    }
}