#include<bits/stdc++.h>
using namespace std;

// structure of node of linked list
struct Node {

		int data;
		
		Node *next = NULL;
  
};

// Function to check if the linked list
// is palindrome or not
bool isPalindrome(Node* head){
		
		// Temp pointer
		Node* temp= head;

		stack <int> s;

		// Push all elements of the list
		// into the stack
		while(temp != NULL){
				s.push(temp->data);

				// Move ahead
				temp = temp->next;
		}

		// Pop all the elements of stack and
		// Check with elements of linkedlist one by one
		
		while(head != NULL ){
			
			// Get the top most element
			int top =s.top();

			// Pop the element
			s.pop();

			// Check if data is not
			// same as the top element
			if(head -> data != top){
				return false;
			}

		    head=head->next;
		}

    return true;

    
}


int main(){

	// Linked list
	Node* head = new Node;
	head->data = 1;
	Node* temp = head;
  temp->next = new Node;
  temp->next->data = 2;
	temp = temp->next;
	temp->next = new Node;
	temp->next->data = 3;
	temp = temp->next;
	temp->next  = new Node;
	temp->next->data = 2;
	temp = temp->next;
	temp->next  = new Node;
	temp->next->data = 1;
	temp = temp->next;

	if(isPalindrome(head))
			cout<<"Given linked list is a palindrome \n";
	else
		cout<<"Given linked list is not a palindrome\n";

return 0;
}
