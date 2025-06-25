class BinarySearch
{
    public static void main(int s,int list[])
    {
        int first=0;
        int last=list.length-1;
        
        while(first<last)
        {
            int mid=(first+last)/2;
            if(list[mid]==s)
            {
                System.out.println(s+" is found at "+(mid+1));
                return;
            }
            else if(list[mid]>s)
              last=mid-1;
            else
              first=mid+1;
        }
        System.out.println(s+" not found.");
    }
}