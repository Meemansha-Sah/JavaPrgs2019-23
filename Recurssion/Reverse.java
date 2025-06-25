class Reverse
{
    static String reverseL(String nm)
    {
        if(nm.length()==1) return nm;
        return reverseL(nm.substring(1))+nm.charAt(0);
    }
    
    static String reverseR(String nm)
    {
        if(nm.length()==1) return nm;
        return nm.charAt(nm.length()-1)+reverseR(nm.substring(0,nm.length()));
    }
}