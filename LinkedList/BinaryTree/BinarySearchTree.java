import java.util.Scanner;
class BinarySearchTree
{
    NodeBT root;
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
    private void preorder(NodeBT r)
    {
        System.out.print(r.value+" , ");
        if(r.L!=null)preorder(r.L);
        if(r.R!=null)preorder(r.R);
    }
    void preorder()
    {
        preorder(root);
    }
    private void inorder(NodeBT r)
    {
        if(r.L!=null)inorder(r.L);
        System.out.print(r.value+" , ");
        if(r.R!=null)inorder(r.R);
    }
    void inorder()
    {
        inorder(root);
    }
    private void postorder(NodeBT r)
    {
        if(r.L!=null)postorder(r.L);
        if(r.R!=null)postorder(r.R);
        System.out.print(r.value+" , ");
    }
    void postorder()
    {
        postorder(root);
    }
    void display() //L+R
    {
        NodeBT cr=root;
        NodeBT last=null;
        while(true)
        {
            if(cr.L==null) 
            {
                System.out.println(cr.value+" , ");
                
            }
        }
    }
}