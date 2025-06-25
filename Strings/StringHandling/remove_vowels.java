class remove_vowels
{
    String S;
    String newS;
    void input(String in)
    {
        S=in;
        newS="";
    }
    void remove()
    {
        for(int i=0;i<S.length();i++)
        {
            char c=S.charAt(i);
            if(c=='a' || c=='e' ||c=='i' || c=='o' ||c=='u' ||c=='A' || c=='E' ||c=='I' || c=='O' ||c=='U')
            continue;
            newS+=c;
        }
    }
    void display()
    {
        System.out.println(newS);
    }
    public static void main(String in)
    {
        remove_vowels n1=new remove_vowels();
        n1.input(in);
        n1.remove();
        n1.display();
    }
}