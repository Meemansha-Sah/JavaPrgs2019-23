class DMAS_singleDigit
{
    public static void add_sub(String equation)
    {
        equation.trim();
        char op=equation.charAt(1);
        String a=equation.substring(0,1);
        String b=equation.substring(2);
        int A=Integer.parseInt(a);
        int B=Integer.parseInt(b);
        if(op=='+') System.out.println(equation+"="+(A+B));
        if(op=='-') System.out.println(equation+"="+(A-B));
    }
    public static void multisub_div(String equation)
    {
        equation.trim();
        char op=equation.charAt(1);
        String a=equation.substring(0,1);
        String b=equation.substring(2);
        int A=Integer.parseInt(a);
        int B=Integer.parseInt(b);
        if(op=='x') System.out.println(equation+"="+(A*B));
        if(op=='/') System.out.println(equation+"="+(A/B));
    }
}