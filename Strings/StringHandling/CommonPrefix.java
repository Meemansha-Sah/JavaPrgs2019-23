//array of string type 
//select word with longest prefix
class CommonPrefix
{
    String A[];
    CommonPrefix(String a[])
    {
        A=a;
    }
    int wordSmallest()
    {
        int s=A[1].length();
        for(int i=1;i<A.length;i++)
        {
            if(A[i].length()<s) s=A[i].length();
        }
        return s;
    }
    public static void main(String A[])
    {
        for(int i=1;i<A.length;i++)
        {
            String prefix=A[i].substring(0,i);
            
        }