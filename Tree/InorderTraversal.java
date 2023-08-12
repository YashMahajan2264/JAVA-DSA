package Tree;

class Node
{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

public class InorderTraversal {
    Node root;

    public InorderTraversal()
    {
        root=null;
    }
    public void inorderTraversal(Node p)
    {
        if(p==null)
        {
            return;
        }
        inorderTraversal(p.left);
        System.out.print(p.data+" ");
        inorderTraversal(p.right);
    }
    public void preorderTraversal(Node p)
    {
        if(p==null)
        {
            return;
        }
        System.out.print(p.data+" ");
        preorderTraversal(p.left);
        preorderTraversal(p.right);
    }
    public void postorderTraversal(Node p)
    {
        if(p==null)
        {
            return;
        }
        postorderTraversal(p.left);
        postorderTraversal(p.right);
        System.out.print(p.data+" ");
    }
    public static void main(String[] args) {
        InorderTraversal obj = new InorderTraversal();
        obj.root=new Node(5);
        obj.root.left=new Node(8);
        obj.root.left.left=new Node(9);
        obj.root.right=new Node(2);
        obj.root.right.left=new Node(3);
        obj.root.right.right=new Node(4);

        obj.inorderTraversal(obj.root);
        System.out.println();
        obj.preorderTraversal(obj.root);
        System.out.println();
        obj.postorderTraversal(obj.root);
    }
}
