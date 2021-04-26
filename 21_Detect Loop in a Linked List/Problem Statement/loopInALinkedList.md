## **Detect Loop in a Linked List**

Given a linked list, check if the linked list has loop or not. Below diagram shows a linked list with a loop.
Refer [this](https://i0.wp.com/www.dineshonjava.com/wp-content/uploads/2018/09/Linked-List-Loop.png?resize=530%2C207&ssl=1) this for better understanding. 

#### **Sample Input**
	list = [3,2,0,-4], position = 1

#### **Sample Output**
	Linked List contains a cycle.

#### **Sample Explanation**
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, position is used here  	    to denote the index of the node that tail's next pointer is connected to. Note that position is not passed as a parameter.


#### **Expected Time Complexity**
__O__(N), where N is the number of elements in the linked list. Only one traversal of the loop should be needed.


#### **Expected Space Complexity**
__O__(1), Auxiliary space

#### **Constraints**
	The number of the nodes in the list is in the range [0, 10^4].
	-10^5 <= Node.val <= 10^5
