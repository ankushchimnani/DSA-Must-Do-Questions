import java.io.*;
import java.lang.*;
import java.util.*;

//This class implements the structure of the Singly linked list
class Node{
	int data;
	Node next;

	Node(int data){
		this.data = data;
		this.next = null;
	}
}


class Main{
	//This function adds two Singly linked list. 
	public static Node addTwoLinkedList(Node head1, Node head2){
		int carry = 0;
		Node ans = null; //return value which stores the resultant linked list
		Node temp = ans;
		while(head1 != null || head2 != null){
			int value = carry;
			if (head1 == null){
				value += head2.data;
				head2 = head2.next;
			}else if (head2 == null){
				value += head1.data;
				head1 = head1.next;
			}else{
				value += head1.data + head2.data;
				head1 = head1.next;
				head2 = head2.next;
			}
			carry = value / 10;
			value = value % 10;
			if (ans == null){
				ans = new Node(value);
				temp = ans;
			}else{
				temp.next = new Node(value);
				temp = temp.next;
			}
		}
		if (carry != 0){
			temp.next = new Node(carry);
			temp = temp.next;
		}
		return ans;
	}

	//This function prints the Singly linked list on a single line.
	public static void printList(Node head){
		if(head == null) return ;
		while(head != null){
			System.out.print(head.data + " ");
			head = head.next;
		}

	}

	//This function creates a singly linked list from an array.
	public static Node generateSinglyLinkedList(int[] arr){
		if (arr.length == 0 || arr == null) return null;
		Node SinglyLinkedList = new Node(arr[0]);
		Node temp = SinglyLinkedList;
		for (int i=1;i<arr.length;i++){
			temp.next = new Node(arr[i]);
			temp = temp.next;
		}
		return SinglyLinkedList;
	}

	//Main Function
	public static void main(String[] args){
		int[] arr1 = {1,2,4}; //input array
		int[] arr2 = {1,2,6}; //input array
		Node head1 = generateSinglyLinkedList(arr1);
		Node head2 = generateSinglyLinkedList(arr2);
		Node ans = addTwoLinkedList(head1,head2);
		printList(ans);

	}
}
