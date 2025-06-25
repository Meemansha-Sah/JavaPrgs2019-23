class Linear_Search
{
    public static void search(int s,int list[])
    {
        for(int i=0;i<list.length;i++)
        {
            if(s==list[i]) 
            {
                System.out.println(s+" is found at position "+(i+1));
                return;
            }
        }
        System.out.println(s+" not found.");
    }
}