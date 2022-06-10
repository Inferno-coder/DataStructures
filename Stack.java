//program to implement the stack using the linked list
class Main{
		Node head=null,tail=null;
		class Node{
		int data;
		Node next;
		Node(int item){
	    data=item;
		next=null;
		}
		}
		
		//method to perform the push operation
		void push(int item){
		Node n=new Node(item);
		if(head==null && tail==null){
		head=tail=n;
		tail.next=null;
		}
		else{
		tail.next=n;
		tail=n;
		tail.next=null;
		}
		}
		
		//method to perfrom the pop operation using the double approach
		void pop(){
		if(head.next==null && tail.next==null)System.out.println("The stack is already empty");
		else{
		Node q=head;
		Node p=head.next;
		while(p.next!=null){
		p=p.next;
		q=q.next;
		}
		if(p.next==null)
		{
		tail=q;
		tail.next=null;  
		}
	    }
		}
		
		//method to perform the pop operation using the single pointer approach 
// 		void pop(){
// 		    if(head==null)System.out.println("nope");
// 		    else{
// 		    Node p=head;
// 		    if(head.next!=null){
// 		    while(p.next.next!=null){
// 		        p=p.next;
// 		    }
// 		    tail=p;
// 		    tail.next=null;
// 		    }
// 		    else{
// 		        head=null;
// 		    }
// 		    }
// 		}
		
		//method to perform the display operation
		void display(){
		Node temp=head;
		while(temp!=null){
		System.out.print(temp.data+" -> ");
		temp=temp.next;
		}
		System.out.println("Null");
		}
		
    public static void main(String []args){
	   Main o=new Main();
	   o.push(1);
	   o.push(2);
	   
	   System.out.println();
	   o.display();
	   o.pop();
	   o.display();
	   o.pop();
	   o.pop();
	   o.pop();
	}
}