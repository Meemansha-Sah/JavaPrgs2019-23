import java.util.Scanner;
class BinaryTree
{
    NodeBT root;
    void Tree()
    {
        NodeBT A=new NodeBT(1);
        NodeBT C=new NodeBT(2);
        NodeBT D=new NodeBT(7);
        NodeBT E=new NodeBT(8);
        NodeBT F=new NodeBT(3);
        NodeBT B=new NodeBT(4);
        NodeBT G=new NodeBT(5);
        NodeBT H=new NodeBT(6);
        
        root=A;
        A.L=C;
        A.R=B;
        B.L=D;
        B.R=E;
        C.L=F;
        C.R=G;
        D.L=H;
    }
    void addNode(int v)
    {
        if(root==null) {root=new NodeBT(v); return;}
        NodeBT cr=root;
        while(true)
        {
            if(cr.value>v) 
            {
                 if(cr.L==null){cr.L=new NodeBT(v);
                                return;}
                 else cr=cr.L;
            }
            if(cr.value<=v) 
            {
                if(cr.R==null){cr.R=new NodeBT(v);
                               return;}
                 else cr=cr.R;
            }
        }
    }
    void create()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the no. of values to be entered: ");
        int n=in.nextInt();
        NodeBT cr=root;
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter value: ");
            int v=in.nextInt();
            addNode(v);
        }
    }
    void display() //L+R
    {
        
    }
}