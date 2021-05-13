package com.IB.LinkedList;

public class ListUtils {
	public static ListNode create(int[] arr) {
		ListNode node = new ListNode(0);
		ListNode tmp = node;
		for(int i : arr) {
			tmp.next = new ListNode(i);
			tmp = tmp.next;
		}
		return node.next;
	}
	
	public static void print(ListNode list) {
		while(list != null) {
			System.out.println(list.val);
			list = list.next;
		}
	}
}
