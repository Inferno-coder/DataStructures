//program to learn about the tree data structures
import java.util.*;
class Main{
    TreeNode root;
    public static class TreeNode{
    TreeNode left,right;
    int data;
    TreeNode(int item){
    left=right=null;
    data=item;
    }
    }

    public static TreeNode createTree(){
    System.out.println("enter the data: ");
    Scanner sc=new Scanner(System.in);
    int val=sc.nextInt();
    TreeNode  n=new TreeNode(val);
    if(val==-1)return null;
    else{
    System.out.print("to the left of the node "+val+ " ,");
    n.left=createTree();
    System.out.print("to the right of the node "+val+ " ,");
    n.right=createTree();
    }
    return n;
    }

    public static void display(TreeNode root){
    System.out.println("This is the inorder traversal:");
    inOrder(root);
    System.out.println();
    
     System.out.println("This is the preorder traversal:");
    preOrder(root);
    System.out.println();
    
     System.out.println("This is the postorder traversal:");
    postOrder(root);
    System.out.println();
    }
    
    
    public static void inOrder(TreeNode root){
      if(root==null)return ;
      inOrder(root.left);
      System.out.print(root.data+" ");
      inOrder(root.right);
    }

    public static void preOrder(TreeNode root){
      if(root==null)return ;
      System.out.print(root.data+" ");
      preOrder(root.left);
      preOrder(root.right);
    }
    
    public static void postOrder(TreeNode root){
      if(root==null)return ;
      postOrder(root.left);
      postOrder(root.right);
     System.out.print(root.data+" ");
    }
    
    public static class Pair{
    TreeNode n;
    int num;
    Pair(TreeNode root,int number){
    n=root;
    num=number;
    }
    }
    
    public static void displayUsingStack(TreeNode root){
    ArrayList preOrder=new ArrayList();
    ArrayList inOrder=new ArrayList();
    ArrayList postOrder=new ArrayList();
    Stack<Pair>s=new Stack<>();
    s.push(new Pair(root,1));
    while(!s.isEmpty()){
     Pair temp=s.pop();
     //if num=1
     if(temp.num==1){
     preOrder.add(temp.n.data);
     s.push(new Pair(temp.n,temp.num+1));
     if(temp.n.left!=null)s.push(new Pair(temp.n.left,1));
     }
     
     //if num is 2
     else if(temp.num==2){
     inOrder.add(temp.n.data);
     s.push(new Pair(temp.n,temp.num+1));
     if(temp.n.right!=null)s.push(new Pair(temp.n.right,1));
     }
     
     //if num is 3
     else if(temp.num==3)postOrder.add(temp.n.data);
     
    }
    System.out.println("This is the inorder traversal:");
    System.out.println(inOrder);
    System.out.println("This is the preorder traversal:");
    System.out.println(preOrder);
    System.out.println("This is the postorder traversal:");
    System.out.println(postOrder);
    }


    public static void main(String []args){
        TreeNode root=createTree();
        displayUsingStack(root);
    }
}
