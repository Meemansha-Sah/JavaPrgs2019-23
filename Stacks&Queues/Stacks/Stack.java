import java.util.Scanner;
class Stack
{
    int S[];
    int top;
    Stack(int s)
    {
        S=new int[s];
        top=-1;
    }
    void push(int n)
    {
        if(isOverflow())
        { 
            System.out.println("Stack is full");
            return;
        }
        top++;
        S[top]=n; //S[++top]=n
    }
    int pop()
    {
        if(isUnderflow())
        { 
            System.out.println("Stack is Empty");
        }
        int t=S[top];
        S[top--]=0;
        return t;
    }
    void peek()
    {
        if(isUnderflow())
        { 
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(S[top]);
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
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        Stack Book=new Stack(5);
        while(true)
        {
            System.out.println((char)12);
            System.out.println("1. Push  ");
            System.out.println("2. Pop  ");
            System.out.println("3. Peek  ");
            System.out.println("4. Go through the stack  ");
            System.out.println("0. Exit  ");
            
            System.out.println("Enter a choice  ");
            int x=in.nextInt();
            
            switch(x)
            {
                case 0:
                 return;
                 
                case 1:
                 System.out.println("Enter a no. to add to the stack ");
                 int i=in.nextInt();
                 Book.push(i);
                 break;
                 
                case 2:
                 Book.pop();
                 break;
                 
                case 3:
                 Book.peek();
                 break;
                 
                case 4:
                 Book.traverse();
                 break;
                }
                for(long i=-1000000000l;i<2000000000l;i++)
                {}
            }
        }
    }