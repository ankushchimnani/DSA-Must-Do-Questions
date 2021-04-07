#include <bits/stdc++.h>
using namespace std;

// Class for stack implementation

class Stack {
	queue<int> q1, q2;
	int N; // Size of the stack

    public:
    
	Stack(){
	    
		this->N = 0;
	}

	int pop(){

		// Dequeue all elements of q1 except the last and
		// Enqueue them to q2.
		
		while (q1.size() != 1) {
			this->q2.push(this->q1.front());
			this->q1.pop();
		}

		// Front of q1 is the top of stack;
		int top = this->q1.front();
		this->q1.pop();
		this->N--;

		// swap the names of two queues 
		queue<int> q = this->q1;
		this->q1 = this->q2;
		this->q2 = q;
		
		return top;
	}

	void push(int X){
	    
		this->q1.push(X);
		this->N++;
	}

	
};

int main(){
    
	Stack s;
	s.push(2);
	s.push(3);
	cout<<s.pop()<<" ";
	s.push(4);
	cout<<s.pop()<<" ";

	return 0;
}

