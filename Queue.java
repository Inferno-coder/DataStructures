//program to implement the queue using the linked list
class Main{
	//inner class Node 
		Node head=null,tail=null;
		class Node{
		int data;
		Node next;
		Node(int item){
	    data=item;
		next=null;
		}
		}
		
		//method to perform the enqueue operation
		void enqueue(int item){
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
		
		//method to perform the display operation
		void display(){
			Node p=head;
			while(p!=null){
				System.out.print(p.data+" -> ");
				p=p.next;
			}
			System.out.print("Null");
		}
		
		//method to perform the dequeue operation
		void dequeue(){
			if(head==null)System.out.println("\nthe queue is already empty");
			else if(head.next==null)head=null;
			else{
				head=head.next;
			}
		}
	//method to implement the main function	
    public static void main(String []args){
	   Main o=new Main();
	   o.enqueue(10);
	   o.enqueue(20);
	   o.enqueue(30);
	   o.enqueue(40);
	   o.display();
	   o.dequeue();
	   o.dequeue();
	   System.out.println();
	    //display
	   o.display();
	   o.dequeue();
	   o.dequeue();
	   o.dequeue();
	   o.dequeue();
	}
}
