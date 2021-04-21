#include <bits/stdc++.h>
using namespace std;
class Node {
public:
    int data;
    Node* next;
};
Node* newNode(int data)
{
    Node* new_node = new Node();
    new_node->data = data;
    new_node->next = NULL;
    return new_node;
}
void push(Node** head_ref, int new_data)
{
    Node* new_node = newNode(new_data);
    new_node->next = (*head_ref);
    (*head_ref) = new_node;
}
 
Node* addTwoList(Node* first, Node* second)
{
    // Function to add two linked list

    Node* res = NULL;
    Node *temp, *prev = NULL;
    int carry = 0, sum;
 
    // while both lists exist
    while (first != NULL || second != NULL) {
        sum = carry + (first ? first->data : 0)
              + (second ? second->data : 0);
 
        // update carry for next calulation
        carry = (sum >= 10) ? 1 : 0;
 
        sum = sum % 10;
 
        // Create a new node with sum as data
        temp = newNode(sum);

        if (res == NULL)
            res = temp;

        else
            prev->next = temp;

        prev = temp;

        if (first)
            first = first->next;
        if (second)
            second = second->next;
    }
 
    if (carry > 0)
        temp->next = newNode(carry);

    return res;
}
 
void printList(Node* node)
{
    // Function to print the linked list
    while (node != NULL) {
        cout << node->data << " ";
        node = node->next;
    }
    cout << endl;
}
 
int main()
{
    Node* result = NULL;
    Node* first = NULL;
    Node* second = NULL;
 
    // create first list 2->4->3
    push(&first, 2);
    push(&first, 4);
    push(&first, 3);
 
    // create second list 5->6->4
    push(&second, 5);
    push(&second, 6);
    push(&second, 4);


    result = addTwoList(first, second);
    printList(result);
 
    return 0;
}