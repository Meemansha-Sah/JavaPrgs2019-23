class InfixToPostfix
{
    String infix,postfix;
    InfixToPostfix(String exp)
    {
        infix=exp+"}";
        postfix="";
    }
    boolean isOperator(char c)
    {
        if(c=='+' ||c=='-' ||c=='*' ||c=='/' ||c=='^')
            return true;
        return false;
    }
    boolean isBracket(char c)
    {
        if(c=='(')
            return true;
        return false;
    }
    boolean lowPrecedencepop(char x,char y)
    {
        char A[]={x,y};
        for(int i=0;i<=1;i++)
        {
            char c=A[i];
            switch(c)
            {
                case '^':
                    A[i]='3';
                    break;
                
                case '*': case '/':
                    A[i]='2';
                    break;
                    
                case '+': case '-':
                    A[i]='1';
                    break;
                    
            }
        }
        int a=A[0]-'0';
        int b=A[1]-'0';
        if(b<=a) return true;
        return false;
    }
    public void toPostfix()
    {
        StackChar st=new StackChar(infix.length());
        st.push('{');
        for(int i=0;i<infix.length();i++)
        {
            char c=infix.charAt(i);
            if(isBracket(c)) 
            {
                st.push(c);
            }
            else if(isOperator(st.peek()) && isOperator(c))
            {
                while(isOperator(st.peek()) && lowPrecedencepop(st.peek(),c))
                {
                    postfix=postfix+st.pop();
                }
                st.push(c);
            }
            else if(isOperator(c))
            {
                st.push(c);
            }
            else if(c==')'||c=='}') 
            {
                char s=' ';
                while(s!='('&&s!='{' )
                {
                    s=st.pop();
                    if(s=='('|| s=='{') continue;
                    postfix=postfix+s;
                }
            }
            else postfix=postfix+c;
        }
    }
}