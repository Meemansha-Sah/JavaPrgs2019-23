import java.util.Scanner;
class QueueProto
{
    int Q[];
    int front,rear;
    QueueProto(int s)
    {
        Q=new int[s];
        front=0;
        rear=-1;
    }
    void add(int n)
    {
        if(isOverflow())
        { 
            System.out.println("Stack is full");
            return;
        }
        rear++;
        Q[rear]=n; //S[++top]=n
    }
    void remove()
    {
        Scanner in=new Scanner(System.in);
        if(isUnderflow())
        { 
            System.out.println("Stack is empty");
            System.out.println("Please enter a no. to add to the Stack");
            int n=in.nextInt();
            add(n);
            return;
        }
        Q[front]=0;
        front++;
    }
    private boolean isOverflow()
    {
        if(rear==Q.length-1) return true;
        else return false;
    }
    private boolean isUnderflow()
    {
        if(rear<front) return true;
        else return false;
    }
}