public class Words_vowelStartEnd
{
    String S;
    String W[]=new String[30];
    int wc=0;
    
   Words_vowelStartEnd(String S)
    {
        this.S=S;
        for(int i=0;i<30;i++)
        {
            W[i]="";
        }
    }
    
    void extract()
    {
        int k=0;int l=S.length();
        for(int i=0;i<l;i++)
        {
            char x=S.charAt(i);
            if(x==' '||x=='.')k++;
            else W[k]+=x;
        }
        wc=k;
    }
    void vowel2()
    {
        for(int i=0;i<=wc;i++)
        {
            boolean vowelF_L=false;
            int c=0;int l=W[i].length();
            char x=W[i].charAt(0);char y=W[i].charAt(l-1);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u') vowelF_L=true;
            if(y=='a'||y=='e'||y=='i'||y=='o'||y=='u') vowelF_L=true;
            if(vowelF_L) System.out.println(W[i]);
        }
    }
    public static void main(String args[])
    {
        Words_vowelStartEnd ev=new Words_vowelStartEnd(args[0]);
        ev.extract();
        ev.vowel2();
    }
}