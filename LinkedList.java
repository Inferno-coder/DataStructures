//program to implement the Linked List data structure
import java.util.*;
class Main{	
	Node head,tail;
//creating the inner class Node 
class Node{
    int data;
	Node next;
	Node(int item){
	data=item;
	next=null;
	}
}

//method to create the list
void createList(){
System.out.println("Enter the number of nodes to create:");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=0;i<num;i++){
System.out.println("Enter the data of node "+(i+1)+" : ");
int val=sc.nextInt();
Node n=new Node(val);

//if both the pointer are pointing the null
if(head==null && tail==null){
head=tail=n;
tail.next=null;
}

//if head is not equal to tail
else{
tail.next=n;
tail=n;
tail.next=null;
}
}
}

//method to traverse the list 
void display(){
Node temp=head;
while(temp!=null){
 System.out.print(temp.data+" -> ");
 temp=temp.next;
}
System.out.print("null");
}

public static void main(String []args){
Main obj=new Main();
obj.createList();
System.out.println("Displaying the Linkled List:");
obj.display();
}
}

