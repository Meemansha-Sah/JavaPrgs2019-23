class WeightWords
{
    String W[],S;
    int V[],nw;
    WeightWords(String s)
    {
        S=s.trim();
        S=S.toUpperCase();
        W=new String[10];
        V=new int[10];
        for(int i=0;i<10;i++)
          W[i]="";
    }
    int weigh(String w)
    {
        if(w.length()==1) return (int)w.charAt(0)-64;
        return (int)w.charAt(0)-64+weigh(w.substring(1));
    }
    void extract_weigh()
    {
        int x=0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==' ') 
            {
                x++;nw++; continue;
            }
            W[x]+=S.charAt(i); V[x]+=weigh(S.substring(i,i+1));
        }
        nw++;
    }
    void arrange()
    {
        for(int i=0;i<nw;i++)
        {
            for(int j=i+1;j<nw;j++)
            {
                if(V[i]>V[j])
                {
                    int v=V[i];  String w=W[i];
                    V[i]=V[j];   W[i]=W[j];
                    V[j]=v;      W[j]=w;
                }
            }
        }
    }
    void display()
    {
        for(int i=0;i<nw;i++)
        {
            System.out.print(W[i]+" ");
        }
        System.out.println("  ");
        for(int i=0;i<nw;i++)
        {
            System.out.print(" "+V[i]+" ");
        }
    }
    public static void main(String args[])
    {
        WeightWords WW=new WeightWords(args[0]);
        WW.extract_weigh();
        System.out.println("Original Sentence: ");
        WW.display();
        WW.arrange();
        System.out.println("  ");
        System.out.println("Arranged Sentence: ");
        WW.display();
    }
}