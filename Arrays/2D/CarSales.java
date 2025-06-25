class CarSales
{
    int N[][]=new int[6][5];
    int D[]=new int[6];
    int M[]=new int[5];
    String  day[]={"Mon","Tues","Wed","Thus","Fri","Sat"};
    String  model[]={"Alto","Swift","Desire","Wagon-R","Baleno"};
    CarSales(int n[][])
    {
        N=n;
    }
    public void sortSale()
    {
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<5;j++)
            {
                D[i]+=N[i][j];
            }
        }
        for(int j=0;j<5;j++)
        {
            for(int i=0;i<6;i++)
            {
                M[j]+=N[i][j];
            }
        }
    }
    public void saleDay()
    {
        for(int i=0;i<6;i++)
        {   
            System.out.println(D[i]+" ");
        }
    }
    public void saleModelWeekly()
    {
        for(int i=0;i<5;i++)
        {   
            System.out.println(M[i]+" ");
        }
    }
}