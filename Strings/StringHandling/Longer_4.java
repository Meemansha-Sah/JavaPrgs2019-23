import java.util.Scanner;
class Longer_4
{
    String S="";
    String W[]=new String[25];
    int nw;
    public Longer_4(String Sentence)
    {
        S=Sentence;
        for(int i=0;i<W.length;i++)
        {
            W[i]="";
        }
    }
    void extractWords()
    {
        int L=S.length();
        int k=0;
        for(int i=0;i<L;i++)
        {
            char x=S.charAt(i);
            if(x==' ' || x=='.'||x==','|| x=='?'||x=='!'|| x==';'||x==':')
            {
                k++;
                nw++;
            }
            else W[k]+=x;
        }
    }
    void longer4()
    {
        String longest=W[0];
        int longL=W[0].length();
        for(int i=1;i<nw;i++)
        {
            int l=W[i].length();
            if(longL<l)
            {
                longL=l;
                longest=W[i];
            }
        }
        System.out.println(longest);
    }
    public static void main()
    {
        System.out.println("Enter a Sentence");
        Scanner in=new Scanner(System.in);
        String Sentence=in.nextLine();
        Longer_4 L=new Longer_4(Sentence);
        L.extractWords();
        L.longer4();
    }
}