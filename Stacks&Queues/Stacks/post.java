class post
{
    String Pexp;
    int v[];
    post()
    {
        v=new int[(Pexp.length()/2)+1];
    }
    boolean isOperator(char c)
    {
        if(c=='+' ||c=='-' ||c=='*' ||c=='/' ||c=='^')
            return true;
        return false;
    }
}