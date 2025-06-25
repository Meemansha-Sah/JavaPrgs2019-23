class SeriesSpiral
{
    int S,SA[][],r,c;
    SeriesSpiral(int s)
    {
        S=s;
        SA=new int[s][s];
        r=s;c=s;
    }
    public void createSpiral()
    {
        int k=1;
        for(int i=0;i<r-1;i++)
        {
            for(int j=0;j<c-1;j++)
            {
                SA[i][j]=k;
                if(j==(c-1)) {j--;i++;}
            }
        }
    }
}