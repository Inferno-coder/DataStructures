#include<bits/stdc++.h>
using namespace std;
class Node{
    public:
    int val;
    Node* next;
    Node(int item){
        val=item;
        next=NULL;
    }
};
class LinkedList{
    public:
 Node * head,*tail;
 LinkedList(){
     head=NULL;
     tail=NULL;
 }
 void createList(){
     int n,v;
     cout<<"Enter the total number of nodes in the list";
     cin>>n;
     for(int i=0;i<n;i++){
         cout<<"Enter the data of node "<<i+1<<" : ";
         cin>>v;
         Node* n=new Node(v);
         if(head==NULL && tail==NULL){
             head=n;
             tail=n;
             tail->next=NULL;
         }else{
             tail->next=n;
             tail=n;
             tail->next=NULL;
         }
     }
 }
 
 void display(){
     Node *temp=head;
     while(temp!=NULL){
        cout<<temp->val<<" -> ";
        temp=temp->next;
     }
     cout<<"NULL"<<endl;
 }
};
int main(){
    LinkedList li;
    li.createList();
    li.display();
    return 0;
}
