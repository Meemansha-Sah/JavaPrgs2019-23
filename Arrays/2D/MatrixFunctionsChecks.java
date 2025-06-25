class MatrixFunctionsChecks
{
    int[][] transpose(int M[][])
    {
        int N[][]=new int[M.length][M[0].length];
        for(int i=0;i<M.length;i++)
        {
            for(int j=0;j<M[0].length;j++)
            {
                M[i][j]=N[j][i];
            }
        }
        return N;
    }
    boolean isComparable(int A[][],int B[][])
    {
        if(A.length==B.length && A[0].length==B[0].length)
        return true;
        return false;
    }
    boolean isEqual(int A[][],int B[][])
    {
        if(isComparable(A,B)==false) return false;
        
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                if(A[i][j]!=B[i][j]) return false;
            }
        }
        return true;
    }
    int[][] negative(int A[][])
    {
        int N[][]=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                N[i][j]=-A[i][j];
            }
        }
        return N;
    }
    boolean isSymmetric(int A[][])
    {
        int B[][]=transpose(A);
        if(isEqual(A,B)) return true;
        return false;
    }
    boolean isSkewSymmetric(int A[][])
    {
        int B[][]=negative(transpose(A));
        if(isEqual(A,B)) return true;
        return false;
    }
    int[][] multiplyScalar(int k,int A[][])
    {
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[0].length;j++)
            {
                A[i][j]*=k;
            }
        }
        return A;
    }
}