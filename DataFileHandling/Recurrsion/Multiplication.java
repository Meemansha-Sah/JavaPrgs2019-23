class Multiplication
{
    int A,B,Pro=0;
    Multiplication(int a, int b)
    {
        A=a;B=b;
    }
    void findSmaller()
    {
        if(B>A){ int c=A;A=B;B=c;}
    }
    void multiplyByAdd(int i)
    {
        if(i>B) return;
        else  { Pro+=A; i++;multiplyByAdd(i); }
    }
    void display()
    {
        System.out.println(A+" X "+B+" = "+Pro);
    }
    public static void main(int a, int b)
    {
        Multiplication m=new Multiplication(a,b);
        m.findSmaller();
        m.multiplyByAdd(1);
        m.display();
    }
}