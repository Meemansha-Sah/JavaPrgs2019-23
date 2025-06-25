class List_odd_even
{
    public static void main(int L[])
    {
        int nO=0;
        int sO=0;
        double aO=0;
        int nE=0;
        int sE=0;
        double aE=0;
        for(int i=0;i<L.length;i++)
        {
            if(L[i]%2==1) 
            {
                sO+=L[i];
                nO++;
            }
            if(L[i]%2==0) 
            {
                sE+=L[i];
                nE++;
            }
        }
        aO=sO/nO;
        aE=sE/nE;
        System.out.println("No of odd numbers= "+nO);
        System.out.println("Sum of odd numbers= "+sO);
        System.out.println("Average of odd numbers= "+aO);
        System.out.println("");
        System.out.println("No of even numbers= "+nE);
        System.out.println("Sum of even numbers= "+sE);
        System.out.println("Average of even numbers= "+aE);
    }
}