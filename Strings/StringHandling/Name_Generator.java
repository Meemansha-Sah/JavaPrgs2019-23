public class Name_Generator
{
    public static String generate()
    {
        int n=(int)Math.random()*10;
        String name=letterGenerate();
        name=name.toUpperCase();
        for(int i=0;i<n;i++)
        {
            name+=letterGenerate();
        }
        return name;
    }
    public static String letterGenerate()
    {
        int n=(int)Math.random()*26;
        n+=96;
        char c=(char)n;
        String C="";
        C+=c;
        return C;
    }
    public static int tel_noGenerate()
    {
        int tel_no=(int)Math.random();
        for(int i=1;i<=6;i++)
        {
            tel_no*=10;
            int n=(int)Math.random()*10;
            tel_no+=n;
        }
        return tel_no;
    }
}