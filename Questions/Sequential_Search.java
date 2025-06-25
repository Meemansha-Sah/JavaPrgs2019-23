public class Sequential_Search
{
    public static void main(int list[],int search)
    {
        for(int i=0;i<list.length;i++)
        {
            if(list[i]==search) 
            {
                System.out.println(search+" is found at "+(i+1)+" position");
                return;
            }
        }
        System.out.println(search+" is not found in the list");
    }
}