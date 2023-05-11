#include<bits/stdc++.h>
using namespace std;
//DLL
class Node {
    public:
    int data;
    Node* next;
    Node* prev;
    Node(int val){
        data=val;
        next=NULL;
        prev=NULL;
    }
};

class DLL{
 public:
  Node* head,*tail;
  DLL(){
     head=NULL;
     tail=NULL;
  }
  void createList(){
      int num;
      cout<<"Enter the number of nodes to create:";
      cin>>num;
      for(int i=0;i<num;i++){
          int v;
          cout<<"Enter the data of the node "<<i+1<<" : ";
          cin>>v;
          Node* n=new Node(v);
          if(head==NULL && tail==NULL){
              head=n;
              tail=n;
              tail->next=NULL;
              tail->prev=NULL;
          }else{
              tail->next=n;
              n->prev=tail;
              tail=n;
              n->next=NULL;
          }
      }
  }
  
  void display(){
      Node *temp=head;
      while(temp!=NULL){
          cout<<temp->data<<"->";
          temp=temp->next;
      }cout<<"NULL";
      cout<<endl;
      temp=tail;
      while(temp!=NULL){
          cout<<temp->data<<"->";
          temp=temp->prev;
      }cout<<"NULL";
  }
};


int main(){
DLL obj;
obj.createList();
obj.display();
return 0;    
}


