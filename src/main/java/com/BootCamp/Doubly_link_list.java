package com.BootCamp;



public class Doubly_link_list {
	
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	
	private class ListNode{
	private int data;
	private ListNode next;
	private ListNode previous;
	
	public ListNode(int data) {
		this.data = data;
		
		
	}
	

}
         public  Doubly_link_list() {
        	 this.head = null;
        	 this.tail = null;
        	 this.length = 0;
        	 
         }
         public boolean isEmpty() {
        	 return length == 0 ;
        	 
        	 
         }
         public int length() {
        	 return length;
        	 
         }
}