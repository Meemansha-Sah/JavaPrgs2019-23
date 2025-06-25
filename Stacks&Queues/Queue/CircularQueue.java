import java.util.Scanner;
class CircularQueue
{
    int Q[];
    int front,rear,space;
    CircularQueue(int s)
    {
        Q=new int[s];
        front=0;
        rear=-1;
        space=s;
    }
    void add(int n)
    {
        if(isOverflow())
        { 
            System.out.println("Stack is full");
            return;
        }
        if(rear==Q.length-1) rear=0;
        else rear++;
        space--;
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
        if(front==Q.length-1) 
        {
            Q[front]=0;front=0;
        }
        else Q[front++]=0;
        space++;
    }
    private boolean isOverflow()
    {
        if(space==0) return true;
        else return false;
    }
    private boolean isUnderflow()
    {
        if(space==Q.length) return true;
        else return false;
    }
}