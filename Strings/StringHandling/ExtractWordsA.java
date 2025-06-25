public class ExtractWordsA
{
    String S="";
    String W[]=new String[25];
    int nw;
    public ExtractWordsA(String Sentence)
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
            {k++;nw++;}
            else W[k]+=x;
        }
    }
    public static String[] extract_Words(String S)
    {
        int L=S.length();
        String W[]=new String[25];
        int nw=0;
        W[0]="";
        int k=0;
        for(int i=0;i<L;i++)
        {
            char x=S.charAt(i);
            if(x==' ' || x=='.'||x==','|| x=='?'||x=='!'|| x==';'||x==':')
            {k++;nw++;W[k]="";}
            else W[k]+=x;
        }
        return W;
    }
}
//    void display