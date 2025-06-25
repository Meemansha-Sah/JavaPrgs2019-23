public class Telephone_Book
{
    String Name_List[]=new String[50];
    int Tel_no[]=new int[50];
    Telephone_Book()
    {
        for(int i=0;i<50;i++)
        {
            Name_List[i]=Name_Generator.generate();
            Tel_no[i]=Name_Generator.tel_noGenerate();
        }
    }
    void find(String s)
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("\t Name\t  Tel.no");
            if(Name_List[i].startsWith(s))
            { 
                System.out.println(Name_List[i]+"\t  "+Tel_no[i]);
            }
        }
    }
    public static void main(String search)
    {
        Telephone_Book tel=new Telephone_Book();
        tel.find(search);
    }
}