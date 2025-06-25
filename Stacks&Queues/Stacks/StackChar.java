import java.util.Scanner;
class StackChar
{
    char S[];
    int top;
    StackChar(int n)
    {
        S=new char[n];
        top=-1;
    }
    void push(char c)
    {
        if(isOverflow())
        { 
            System.out.println("Stack is full");
            return;
        }
        top++;
        S[top]=c; //S[++top]=s
    }
    char pop()
    {
        if(isUnderflow())
        { 
            System.out.println("Stack is Empty");
            Scanner in=new Scanner(System.in);
            System.out.println("Enter Data to Stack");
            String s=in.next();
            push(s.charAt(0));
        }
        char c=S[top];
        S[top]=0;
        top--;
        return c;
    }
    char peek()
    {
        if(isUnderflow())
        { 
            System.out.println("Stack is Empty");
            return ' ';
        }
        return S[top];
    }
    void traverse()
    {
        for(int i=top;i>=0;i--)
        {
            pop();
        }
    }
    boolean isOverflow()
    {
        if(top>=S.length-1) return true;
        else return false;
    }
    boolean isUnderflow()
    {
        if(top<0) return true;
        else return false;
    }
}