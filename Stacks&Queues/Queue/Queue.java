import java.util.Scanner;
class Queue
{
    int Q[];
    int front,rear;
    Queue(int s)
    {
        Q=new int[s];
        front=0;
        rear=-1;
    }
    void add(int n)
    {
        /*if(isOverflow())
        { 
            System.out.println("Stack is full");
            return;
        }*/
        rear++;
        Q[rear]=n; //S[++top]=n
    }
    void remove()
    {
        for(int i=0;i<rear;i++)
        {
            Q[i]=Q[i+1];
        }
        Q[rear]=0;
        rear--;
    }
    public int removeR()
    {
        int n=Q[front];
        for(int i=front;i<rear;i++)
        {
            Q[i]=Q[i+1];
        }
        Q[rear]=0;
        rear--;
        return n;
    }
    
}