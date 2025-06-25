import java.util.*;
class LinkedList
{
    Node start;
    void List()
    {
        Node a=new Node(1,"A");
        Node b=new Node(2,"B");
        Node c=new Node(3,"C");
        Node d=new Node(4,"D");
        start=a;
        a.nxt=b;
        b.nxt=c;
        c.nxt=d;
        d.nxt=null;
    }
    
    void createA()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the no. of nodes to be created: ");
        int n=in.nextInt();
        System.out.print("Enter Roll no. ");
        int r=in.nextInt();
        System.out.print("Enter Name ");
        String nn=in.next();
        start=new Node(r,nn);
        Node last=start;
        
        for(int i=2;i<=n;i++)
        {
            System.out.print("Enter Roll no. ");
             r=in.nextInt();
            System.out.print("Enter Name ");
             nn=in.next();
            Node cr=new Node(r,nn);
            last.nxt=cr;
            last=cr;
            
        }
    }
    
    void createB()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the no. of nodes to be created: ");
        int n=in.nextInt();
        System.out.print("Enter Roll no. ");
        int r=in.nextInt();
        System.out.print("Enter Name ");
        String nn=in.next();
        start=new Node(r,nn);
        Node cr=start;
        
        for(int i=2;i<=n;i++)
        {
            System.out.print("Enter Roll no. ");
             r=in.nextInt();
            System.out.print("Enter Name ");
             nn=in.next();
            cr.nxt=new Node(r,nn);
            cr=cr.nxt;
        }
    }
    
    void addNode(int r,String n)
    {
        Node cr=start;
        while(true)
        {
            if(cr.nxt==null) 
            {
                cr.nxt=new Node(r,n);
                return;
            }
            cr=cr.nxt;
        }
    }
    void displayL()
    {
        Node cr=start;
        while(cr!=null)
        {
            System.out.println("Name: "+cr.name);
            System.out.println("Roll.No: "+cr.rn);
            cr=cr.nxt;
        }
    }
    
    private void displayR(Node i)
    {
       if(i!=null)
       {
        System.out.println("Name: "+i.name);
        System.out.println("Roll.No: "+i.rn);
        displayR(i.nxt);
       }
    }
    void displayR()
    {
        displayR(start);
    }
    void searchN(int rs)
    {
        Node cr=start;
        while(cr!=null)
        {
            if(cr.rn==rs)
            {
                System.out.println("Roll No.: "+cr.rn);
                System.out.println("Name : "+cr.name);
                return;
            }
            cr=cr.nxt;
        }
        System.out.println("Roll No. not found");
    }
}