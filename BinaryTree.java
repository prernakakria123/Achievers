import java.util.*;
class Node
{
	int data;
	Node left=null;
	Node right=null;
	  public Node(int item) 
	    { 
	        data = item; 
	        left = right = null; 
	    } 
}
public class BinaryTree 
{
	Node root;
	Node prev; 
	  
    boolean check()  { 
        prev = null; 
        return check(root); 
    } 

    boolean check(Node node) 
    { 
        if (node != null) 
        { 
            if (!check(node.left)) 
                return false; 
 
            if (prev != null && node.data <= prev.data ) 
                return false; 
            prev = node; 
            return check(node.right); 
        } 
        return true; 
    }
	public static void main(String args[])
	{

		 BinaryTree tree = new BinaryTree(); 
	     tree.root = new Node(4); 
	     tree.root.left = new Node(2); 
	     tree.root.right = new Node(5); 
	     tree.root.left.left = new Node(1); 
	     tree.root.left.right = new Node(3); 
	     if(tree.check())
	     {
	    	 System.out.print("Given tree is BST");
	     }
	     else
	     {
	    	 System.out.print("Given tree is not BST");
	    	 
	     }
		
	}	
	
}


