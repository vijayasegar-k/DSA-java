package com.linkedlist;

public class CreateLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		
		SingleLinkNode node = null;
//		node = headToTail(arr);
		node = tailToHead(arr);
		while(node != null) {
			System.out.print(node.value + "->");
			node = node.next;
		}
	}
	
	private static SingleLinkNode tailToHead(int[] arr) {
		SingleLinkNode current = null;
		for(int i = arr.length-1; i >= 0; i--) {
			current = new SingleLinkNode(arr[i], current);
		}
		return current;
	}
	
	private static SingleLinkNode headToTail(int[] arr) {
		SingleLinkNode dummyHead = new SingleLinkNode(0);
		SingleLinkNode current = dummyHead;
		
		for(int i = 0; i < arr.length; i++) {
			current.next = new SingleLinkNode(arr[i]);
			current = current.next;
		}
		
		return dummyHead.next;
	}

}
