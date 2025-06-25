import java.util.Scanner;
class UppercaseSentencePunctuation
{
    String S;int l;
    UppercaseSentencePunctuation(String s)
    {
        S=s.trim();
        l=S.length();
    }
    boolean isValid()
    {
        l=S.length();
        char end=S.charAt(l-1);
        if(end!='.'&& end!='?'&& end!='!') return false;
        if(S.equals(S.toUpperCase())) return true;
        return false;
    }
    void spacing()
    {
        StringBuffer s=new StringBuffer(S);
        for(int i=0;i<l;i++)
        {
            char x=s.charAt(i); char y=s.charAt(i+1);
            if(x==y && y==' ') s.delete(x,y);
        }
        S=s.toString(); l=S.length();
    }
    String[] toStringWords()
    {
        String words[]=new String[20];
        for(int i=0;i<20;i++)
        {
            words[i]="";
        }
        int w=0;
        for(int i=0;i<l;i++)
        {
            char k=S.charAt(i); 
            if(k==',' || k==' ') w++;
            words[w]+=k;
        }
        return words;
    }
    void deleteWord()
    {
        String s=new String();
        Scanner in=new Scanner(System.in);
        System.out.println(S);
        System.out.println(" ");
        System.out.print("WORD TO BE DELETED: ");
        String del=in.next();
        System.out.println(" ");
        System.out.println("WORD POSITION IN SENTENCE: ");
        int p=in.nextInt();
        String W[]=toStringWords();
        for(int i=0;i<20;i++)
        {
            if(i==(p-1)) continue;
            s+=W[i]+" ";
        }
        System.out.println(s);
    }
}