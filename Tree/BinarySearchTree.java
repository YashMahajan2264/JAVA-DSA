package Tree;

import java.util.*;

public class BinarySearchTree {

    // create a class named "node"
    class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    // Constructors
    BinarySearchTree(){
        root = null;
    }

    BinarySearchTree(int data){
        root = new Node(data);
    }

    // function to insert the element in the Binary Search Tree
    void insert(int data){
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data){
        // the bst is empty
        if(root == null){
            root = new Node(data);
            return root;
        }

        else if(data < root.data){
            // recursion to traverse and add the data towards left side
            root.left = insertRec(root.left, data);
        }
        else{
            root.right = insertRec(root.right, data);
        }

        return root;

    }

    // function to search an element in the BST
    Node search(Node root, int data){
        if(root == null || root.data == data){
            return root;
        }

        if(root.data < data){
            // searching recursively towards right subtree
            return search(root.right, data);
        }

        return search(root.left, data);
    }

    // function to delete an element in a BST
    void delete(int data){
        root = deleteNode(root, data);
    }

    Node deleteNode(Node root, int data){
        if(root == null){
            return root;
        }

        if(root.data > data){
            root.left = deleteNode(root.left, data);
        }

        else if(root.data < data){
            root.right = deleteNode(root.right, data);
        }

        else{
            //1. Case 1: Node with no child or only one child
            if(root.left == null){
                return root.right;
            }

            else if(root.right == null){
                return root.left;
            }
            

            // Case 2: Node with two children
            // minValNode(root.right); - 50
            // deletion using the concept of inorderSuccessor replacement
            // task : deletion using the concept of inorderPredeccesor replacement
            Node inorderSucc = minValNode(root.right);
            root.data = inorderSucc.data;
            root.right = deleteNode(root.right, inorderSucc.data);
        }

        return root;
    }

    // function to delete an element in a BST
    void deletePre(int data){
        root = deleteNodePre(root, data);
    }

    Node deleteNodePre(Node root, int data){
        if(root == null){
            return root;
        }

        if(root.data > data){
            root.left = deleteNodePre(root.left, data);
        }

        else if(root.data < data){
            root.right = deleteNodePre(root.right, data);
        }

        else{
            //1. Case 1: Node with no child or only one child
            if(root.left == null){
                return root.right;
            }

            else if(root.right == null){
                return root.left;
            }
            

            // Case 2: Node with two children
            // minValNode(root.right); - 50
            // deletion using the concept of inorderSuccessor replacement
            // task : deletion using the concept of inorderPredeccesor replacement
            Node predecessor = maxValNode(root.left);
            root.data = predecessor.data;
            root.left = deleteNodePre(root.left, predecessor.data);
        }

        return root;
    }

    Node maxValNode(Node node){
        Node curr = node;
        while(curr.right != null){
            curr = curr.right;
        }
        return curr;
    }


    Node minValNode(Node node){
        Node curr = node;
        while(curr.left != null){
            curr = curr.left;
        }

        return curr;
    }

    // function to display the insertion result in an inorder traversal
    void inorder(){
        inorderRec(root);
    }

    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Driver code
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(45);
        tree.insert(15);
        tree.insert(79);
        tree.insert(90);
        tree.insert(10);
        tree.insert(55);
        tree.insert(12);
        tree.insert(20);
        tree.insert(50);

        tree.inorder();
        System.out.println(" ");

        int data = 53;
        if(tree.search(tree.root, data) == null){
            System.out.println(data+" is not found");
        }
        else{
            System.out.println(data+" is found");
        }

        // Deletion via successor
        tree.delete(45);
        tree.delete(20);
        tree.inorder();

        System.out.println(" ");

        // Deletion via predecessor
        tree.deletePre(50);
        tree.inorder();
        System.out.println(" ");

    }
    
}
