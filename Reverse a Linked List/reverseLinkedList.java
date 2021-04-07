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
	public static Node reverseLinkedList(Node head){
		Node current = head;
		Node after = null;
		Node before = null;
		while(current != null){
			after = current.next;
			current.next = before;
			before = current;
			current = after;
		}
		head = before;
		return head;
	}

	//This function prints the Singly linked list on a single line.
	public static void printList(Node head){
		if(head == null) return ;
		while(head != null){
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println("NULL");

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
		int[] arr = {1,2,3,4}; //input array
		Node head = generateSinglyLinkedList(arr);
		head = reverseLinkedList(head);
		printList(head);

	}
}