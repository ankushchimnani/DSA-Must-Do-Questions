#include <bits/stdc++.h>
using namespace std;

/* Link list node */
class Node {
public:
    int data;
    Node* next;
};

void push(Node** head_ref, int new_data)
{
    Node* new_node = new Node();

    new_node->data = new_data;

    new_node->next = (*head_ref);

    (*head_ref) = new_node;
}

int detectLoop(Node* list)
{
    Node *slow_p = list, *fast_p = list;

    while (slow_p && fast_p && fast_p->next) {
        slow_p = slow_p->next;
        fast_p = fast_p->next->next;
        if (slow_p == fast_p) {
            return 1;
        }
    }
    return 0;
}
int main() {
    /* Start with the empty list */
    Node* head = NULL;

    push(&head, 3);
    push(&head, 2);
    push(&head, 0);
    push(&head, -4);

    /* Create a loop for testing */
    head->next->next->next->next = head;
    if (detectLoop(head))
        cout << "Loop found" << endl;
    else
        cout << "No Loop" << endl;
    return 0;
}