import java.io.*;
class Read_File
{
    public static void main()throws IOException
    {
        FileReader fr=new FileReader("xyz");
        BufferedReader br=new BufferedReader(fr);
        String a=br.readLine();
        System.out.println(a);
        a=br.readLine();
        System.out.println(a);
    }
}