package LinkedList;


public class LinkedList_1 {
    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    //insert the node at very end 
    //Time Complexity=O(n)
    public void insertAtEnd(int newData)
    {
        Node newNode=new Node(newData);

        //Linkedlist is empty or not
        if(head==null)
        {
            head=newNode;
            return;
        }
        //traverse at the end of linkedlist
        newNode.next=null;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        return;

    }

    //insert at the very beginning
    //Time Complexity=O(1)
    public void insertAtBeginning(int newData)
    {
        Node newNode=new Node(newData);
        newNode.next=head;
        head=newNode;
        return;
    }

    //inset after any particular node
    public void inserAfter(Node prevNode,int newData)
    {
        if(prevNode==null)
        {
            System.out.println("The previous node cannot contain the null value");
            return;
        }
        Node newNode=new Node(newData);
        newNode.next= prevNode.next;
        prevNode.next=newNode;     
    }
    //implemntation of deletion of node
    //Time complexity=O(n)
    public void deleteNode(int position)
    {
        //if linkedlist is empty
        if(head==null)
        {
            return;
        }
        Node temp=head;
        //deletion from begining
        if(position==0)
        {
            head=temp.next;
            return;
        }

        //deletion from other postion apart form begining
        for(int i=0;i<position-1 && temp!=null ;i++)
        {
            temp=temp.next;
        }
        if(temp==null && temp.next==null)
        {
            return;
        }
        temp.next=temp.next.next;
    }

    //Finding middle of element of linkedlist
    //Time complexity=O(n/2)
    //two pointer approach
    public void middleNode()
    {
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println();
        System.out.println("The middle data of given linkedlist-->"+slow.data);
    }

    //implementation of finding out the cycle in a linkdlist
    //floyd's cycle detection algorithm - interview based question
    //very frequently asked
    public void detectLoop()
    {
        Node fast=head;
        Node slow=head;
        int falg=0;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)
            {
                falg=1;
                break;
            }

        }
        if(falg==0)
        {
            System.out.println("NO loop detected");
        }
        else
        {
            System.out.println("Loop is detetced");
        }
    }
    //Display all the node after insertion
    //Time Complexity=O(n)
    public void printNode()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    //implementation of reversal of linkedlist using an iterative approach
    //Time Complexity=O(n)
    //Space Complexity=O(1)
    public void reversal()
    {
        Node curr=head;
        Node prev=null;
        Node nextPtr=null;

        while(curr!=null)
        {
            nextPtr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextPtr;   
        }
        head=prev;
    }

    public boolean isPresent(int rdata)
    {
        Node temp=head;
        if(temp==null)
        {
            return false;
        }
        else
        {
            while(temp!=null)
            {
                if(temp.data==rdata)
                {
                    return true;
                }
                else
                {
                    temp=temp.next;
                }
            }
        }
        return false;
    }
    //implemntation of reversal of linkedlist using a recursive code
    //Time complexity=O(n)
    public void reversalRecusive(Node curr,Node prev)
    {
        //last node of linkedlist
        if(curr.next==null)
        {
            head=curr;
            curr.next=prev;
            return;
        }
        Node nextPtr=curr.next;
        curr.next=prev;
        //recursive call
        reversalRecusive(nextPtr, curr);
    }

    // //insert the node after the given node
    // public void insertAfterNode(int after , int rdata)
    // {
    //     if(head==null)
    //     {
    //         return ;
    //     }
    //     Node  temp=head;
    //     while(temp.data!=after)
    //     {
    //         temp=temp.next;
    //     }
        
    //     Node curr= new Node(rdata);
    //     temp.next=curr;
    //     curr.next=temp.next.next;

    // }

    // //remove duplicates from sorted linkeldist
    // public void removeDuplicate(Node curr)
    // {
    //     Node temp=curr;
    //     Node prev=curr;
    //     while(temp!=null && temp.next!=null)
    //     {
    //         if(temp==head)
    //         {
    //             continue;
    //         }
    //         if(temp.data==prev.data)
    //         {
    //             prev.next=temp.next;
    //         }
    //         prev=temp;
    //         temp=temp.next;
    //     }
    // }
    public static void main(String[] args) {
        LinkedList_1 obj = new LinkedList_1();
        obj.insertAtEnd(2);
        obj.insertAtEnd(4);
        obj.insertAtEnd(4);
        obj.insertAtEnd(6);
        obj.insertAtEnd(10);
        obj.insertAtEnd(10);

        obj.insertAtBeginning(0);
        

    
        System.out.println("Linkedlist after successful insertion of all the nodes ");
        System.out.println();

        obj.inserAfter(obj.head.next.next.next, 5);
        obj.printNode();
        System.out.println();
        System.out.println("Linkedlist after deletion of node");

        obj.deleteNode(2);
        obj.printNode();
        System.out.println();

        obj.reversal();
        System.out.println("reversal of linked list using iteartive approach");
        obj.printNode();
        System.out.println();
        System.out.println("reversal of linkedlist using recursive approach");
        obj.reversalRecusive(obj.head, null);
        obj.printNode();
        obj.middleNode();

        // Node temp=obj.head;
        // while(temp.next!=null)
        // {
        //     temp=temp.next;
        // }
        // temp.next=obj.head;

        System.out.println();
        obj.detectLoop();
        obj.printNode();
    }
}
