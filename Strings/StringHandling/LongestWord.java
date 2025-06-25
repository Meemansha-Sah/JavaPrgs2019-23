import java.util.*;
class LongestWord
{
    String S="";
    String W[]=new String[25];
    int nw;
    public LongestWord(String Sentence)
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
    void longest()
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
        LongestWord L=new LongestWord(Sentence);
        L.extractWords();
        L.longest();
    }
}