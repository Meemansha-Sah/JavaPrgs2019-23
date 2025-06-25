public class BufferXYZ
{
    public static void main()
    {
        String a="juhaegiu";
        StringBuffer b=new StringBuffer(a);
        System.out.println(b);
        b.replace(1,3,"dfewh");
        System.out.println(b);
        b.reverse();
        System.out.println(b);
        b.append("gj"); 
        System.out.println(b);
        b.insert(5,"uykf"); 
        System.out.println(b);
    }
}