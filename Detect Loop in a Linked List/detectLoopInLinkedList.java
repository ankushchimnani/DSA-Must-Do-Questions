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
	public static boolean detectLoop(Node head){
		Node fast = head;
		Node slow = head;
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;

			if (fast == slow) return true;
		}
		return false;
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
		int[] arr = {3,2,0,4}; //input array
		Node head = generateSinglyLinkedList(arr);
		if (!detectLoop(head)) System.out.println("Linked List does not contain a cycle");
		else{
			System.out.println("Linked List contains a cycle");
		} 

	}
}