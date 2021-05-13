package com.IB.LinkedList;

import java.util.Arrays;

public class ReverseList {
	
	public static ListNode reverse(ListNode list) {
		ListNode prev = null, curr = list;
		while(curr != null) {
			ListNode tmp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tmp;
		}
		return prev;
	}
	
	public static void main(String[] args) {
		ListUtils.print(reverse(ListUtils.create(new int[] {1,2,3,4,5})));
	}

}
