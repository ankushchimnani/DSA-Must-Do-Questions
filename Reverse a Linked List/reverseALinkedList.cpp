#include <bits/stdc++.h>
using namespace std;

/* Node structure of LinkedList */

struct Node {
    
	int data;
	struct Node* next;
	
	Node(int data){
	    
		this->data = data;
		next = NULL;
	}
};

struct LinkedList {
    
	Node* head;
	LinkedList() { head = NULL; }

	
	void push(int data){
	    
		Node* temp = new Node(data);
		
		if(head == NULL ){
	        head = temp;
	    }
	    
	    else{
	        
		Node* curr = head;
		
		while( curr->next != NULL ){
		    curr =  curr->next;
		}
		
		curr->next = temp;
		
	    }
	}
	
	// Function to reverse the linked list 
	
	void reverse(){
		
		Node* curr = head;
		Node *prev = NULL, *next = NULL;

		while (curr != NULL) {
			
			next = curr->next;

			curr->next = prev;

			prev = curr;
			
			curr = next;
		}
		
		head = prev;
	}

	
	void print(){
	    
		struct Node* temp = head;
		while (temp != NULL) {
			cout << temp->data << " ";
			temp = temp->next;
		}
	}

};

int main(){
	
	LinkedList L;
	
	L.push(1);
	L.push(2);
	L.push(3);
	L.push(4);
    
	L.reverse();

	L.print();
	
	return 0;
}
