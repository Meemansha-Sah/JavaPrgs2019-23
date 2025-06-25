import java.io.*;
import java.util.*;
public class StudentDataFile
{
   static String nm;
   static double per;
   public static void main()throws IOException
    {
        FileReader fr=new FileReader("StudentData.txt");
        BufferedReader br=new BufferedReader(fr);
        while(true)
         {
        String S=br.readLine();
        if(S==null)break;
        StringTokenizer st=new StringTokenizer(S,",");
        int rn=Integer.parseInt(st.nextToken());
         nm=st.nextToken();
        int eng=Integer.parseInt(st.nextToken());
        int phy=Integer.parseInt(st.nextToken());
        int che=Integer.parseInt(st.nextToken());
        int tot=eng+phy+che;
         per=tot/3.0;
        display();
       }
    }
    
   public static void display()
    {
        System.out.println("Name " +nm);
        System.out.println("Percentage "+per);
        
    }
     
}   