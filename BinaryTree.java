//program to implement the tree data structure
import java.util.*;
class Main{
    Node root;
//an inner class of Node
static class Node{
	
	int data;
	Node left;
	Node right;
	//constructor
	Node(int item){
    data=item;
    left=right=null;	
	}
}
//method create the tree
static Node createTree(){
System.out.println(" enter the data: ");
Scanner sc=new Scanner(System.in);
int val=sc.nextInt();
Node n=new Node(val);
if(val==-1)return null;
else{
System.out.print("In the left node of "+val);
n.left=createTree();
System.out.print("In the right node of "+val);
n.right=createTree();
}return n;
}

//method to traverse the tree in the inOrder traversal
void inOrder(Node root){
if(root!=null){
inOrder(root.left);
System.out.print(root.data+" ");
inOrder(root.right);
}
}

//method to traverse the tree in the preOrder traversal
void preOrder(Node root){
if(root!=null){
System.out.print(root.data+" ");
preOrder(root.left);
preOrder(root.right);
}
}

//method to traverse the tree in the inOrder traversal
void postOrder(Node root){
if(root!=null){
postOrder(root.left);
postOrder(root.right);
System.out.print(root.data+" ");
}
}


public static void main(String []args){
Main obj=new Main();
obj.root=createTree();
System.out.println();
System.out.println("Displaying the tree in inOrder traversal");
obj.inOrder(obj.root);
System.out.println();
System.out.println("Displaying the tree in preOrder traversal");
obj.preOrder(obj.root);
System.out.println();
System.out.println("Displaying the tree in postOrder traversal");
obj.postOrder(obj.root);
}
}
