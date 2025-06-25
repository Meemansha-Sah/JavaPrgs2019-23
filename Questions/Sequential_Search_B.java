public class Sequential_Search_B
{
    public static void main(int list[],int search)
    {
        int f=0;
        for(int i=0;i<list.length;i++)
        {
            if(list[i]==search) 
            {
                System.out.println(search+" is found at "+(i+1)+" position");
                f++;
            }
        }
        if(f==0)
        System.out.println(search+" is not found in the list");
        else System.out.println(search + " is found "+ f + " times ");
    }
}