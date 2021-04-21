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
	public static boolean detectPalindromeLinkedList(Node head){
		Stack<Node> stack = new Stack<>();
		Node current = head;
		while(current != null){
			stack.push(current);
			current = current.next;
		}
		current = head;
		while(current != null){
			if (current.data != stack.peek().data) return  false;
			current = current.next;
			stack.pop();
		}
		return true;
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
		int[] arr = {1,2,2,1}; //input array
		Node head = generateSinglyLinkedList(arr);
		if (detectPalindromeLinkedList(head)) System.out.println("Given linked list is a palindrome");
		else{
			System.out.println("Given linked list is not a palindrome");
		} 

	}
}