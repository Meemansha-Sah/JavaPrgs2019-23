import java.io.*;
import java.util.*;
class Country
{
    static Scanner s=new Scanner(System.in);
    String CountryName, Capital,Continent,Language;
    long Population;
    /*Country(String nm,String cap,String cont,String lang,long p)
    {
        CountryName=nm;
        Capital=cap;
        Continent=cont;
        Language=lang;
        Population=p;
    }*/
    void addData()throws IOException
    {
        FileWriter f=new FileWriter("Country_Data.txt",true);
        BufferedWriter b=new BufferedWriter(f);
        PrintWriter p=new PrintWriter(b);
        System.out.print("Name of Country:");
        String nm=s.next();   p.print(nm+"  ");
        System.out.print("Capital:");
        String cap=s.next();p.print(cap+"  ");
        System.out.print("Continent:");
        String cont=s.next();p.print(cont+"  ");
        System.out.print("Language:");
        String lang=s.next();p.print(lang+"  ");
        System.out.print("population:");
        long pop=s.nextLong();p.print(pop);
        p.println("  ");
        p.close();
    }
    void readData()throws IOException
    {
        FileReader f=new FileReader("Country_Data.txt");
        BufferedReader b=new BufferedReader(f);
        while(true)
        {
            
            String a=b.readLine();
            if(a==null) break;
            StringTokenizer st=new StringTokenizer(a,"  ");
           System.out.println((char)12);
           System.out.println("Country: "+ st.nextToken());
           System.out.println("Capital: "+ st.nextToken());
           System.out.println("Continent: "+ st.nextToken());
           System.out.println("Language: "+ st.nextToken());
           System.out.println("Population: "+ Long.parseLong(st.nextToken()));
           System.out.println("Press enter to continue ");
           String c=s.nextLine();
        }
       b.close(); 
    }
    
    void findData()throws IOException
    {
        FileReader f=new FileReader("Country_Data.txt");
        BufferedReader b=new BufferedReader(f);
        while(true)
        {
           
            String a=b.readLine();
            StringTokenizer st=new StringTokenizer(a,"  ");
            CountryName=st.nextToken();
            System.out.println("Enter the Starting words of the country");
            String C=s.next();
            if(a==null) break;
            if(CountryName.startsWith(C))
           {System.out.println("");
           System.out.println("Country "+ CountryName);
           System.out.println("Capital "+ st.nextToken());
           System.out.println("Continent "+ st.nextToken());
           System.out.println("Language "+ st.nextToken());
           System.out.println("Population "+ Long.parseLong(st.nextToken()));
           System.out.println("Press enter to continue ");
           s.nextLine();}
        }
       b.close(); 
    }
    public static void main()throws IOException
    {  Country c=new Country();
        while(true)
        {
            System.out.println((char)12);
            System.out.println("1. Add data,     2. Read data, \n   3. Find data,     0.Exit");
  
            int i=Integer.parseInt(s.nextLine());
            
        
            switch(i)
            {
                case 1:
                    c.addData();
                    break;
                case 2:
                    c.readData();
                    break;
                case 3:
                    c.findData();
                    break;
                case 0:
                    System.out.println("Thank You");
                    return;
                    
                default:
                    System.out.println("Incorrect Input");
                    break;
            }
        }
    }
}