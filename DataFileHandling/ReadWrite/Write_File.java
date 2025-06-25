import java.io.*;
class Write_File
{
    public static void main()throws IOException
    {
        FileWriter fw=new FileWriter("wxyz");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        pw.println("Writing in another file");
        pw.println("from BlueJ");
        pw.close();
    }
}