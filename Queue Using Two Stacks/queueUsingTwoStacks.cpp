#include <bits/stdc++.h>
using namespace std;

class Queue {
    
	stack<int> s1, s2;
    
    public:
	// Enqueue an item to the queue
	void enQueue(int x){
	    
		// Push into stack S1
		this->s1.push(x);
	}

	// Dequeue an item from the queue
	int deQueue(){
		

		// if s2 is empty, then pop all elements of s1 and
		// push them to s2 in the order they are popped
		
		if (s2.empty()) {
			while (!s1.empty()) {
				this->s2.push(s1.top());
				this->s1.pop();
			}
		}

		// Top of S2 is the required front of the queue
		
		int X = this->s2.top();
		this->s2.pop();
		return X;
	}
};


int main(){
    
	Queue q;
	
	int queries;
	cin>>queries;
	
	while(queries--){
	    int type;
	    cin>>type;
	    
	    if(type == 1){
	        int X;
	        cin>>X;
	        q.enQueue(X);
	    }
	    
	    else{
	        cout<<q.deQueue()<<" ";
	    }
	}
	
	return 0;
}
