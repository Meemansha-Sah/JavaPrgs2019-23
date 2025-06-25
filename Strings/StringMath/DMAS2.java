class DMAS2
{
    public static void add(String eq)
    {
        int oP=eq.indexOf('+');

        String a=eq.substring(0,oP);
        String b=eq.substring((oP+1));
        int A=Integer.parseInt(a);
        int B=Integer.parseInt(b);
        System.out.println(eq+"="+(A+B));
    }
    public static void sub(String eq)
    {
        int oP=eq.indexOf('-');

        String a=eq.substring(0,oP);
        String b=eq.substring((oP+1));
        int A=Integer.parseInt(a);
        int B=Integer.parseInt(b);
        System.out.println(eq+"="+(A-B));
    }
    public static void multi(String eq)
    {
        int oP=eq.indexOf('x');

        String a=eq.substring(0,oP);
        String b=eq.substring((oP+1));
        int A=Integer.parseInt(a);
        int B=Integer.parseInt(b);
        System.out.println(eq+"="+(A*B));
    }
    public static void div(String eq)
    {
        int oP=eq.indexOf('/');

        String a=eq.substring(0,oP);
        String b=eq.substring((oP+1));
        int A=Integer.parseInt(a);
        int B=Integer.parseInt(b);
        System.out.println(eq+"="+(A/B));
    }
}