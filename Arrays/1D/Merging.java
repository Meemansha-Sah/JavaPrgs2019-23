class Merging //prints duplicates too
{
    int R[],A[],B[]; int rL;
    Merging(int A[],int B[])
    {
        this.A=A;
        this.B=B;
        rL=A.length+B.length;
        this.R=new int[rL];
    }
    public void Merge()
    {
        int i=0,j=0,k=0;
        while(i<A.length||j<B.length)
        {
            if(i==A.length && j<B.length)
            {
                R[k]=B[j]; 
                j++;  k++;
            }
            else if(j==B.length && i<A.length)
            {
                R[k]=A[i]; 
                i++;  k++;
            }
            else if(A[i]<B[j]) 
            {
                R[k]=A[i];
                i++;  k++;
            }
            else if(B[j]<A[i]) 
            {
                R[k]=B[j];
                j++;  k++;
            }
            else if(B[j]==A[i]) 
            {
                R[k]=B[j];
                j++;  k++;
                R[k]=A[i];
                i++;  k++;
            }
        }
    }
    void display()
    { 
        for(int i=0;i<rL;i++)
        {
               System.out.println(R[i]);
        }
    }
    public static void main(int x[],int y[])
    {
        Merging X=new Merging(x,y);
        X.Merge();
        X.display();
    }
} 