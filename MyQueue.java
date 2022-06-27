package lab3;

import java.util.NoSuchElementException;

;

public class MyQueue<T> implements QueueADT<T> {
	
	class Node {
		T data;
		Node next;
		Node( T elt) {
		data = elt;
		next = null;
		}
		Node() {
		this( null );}}
	
	Node head, back;
	int size;

    public MyQueue() {
    	head = new Node();
        back = head;
    	int size = 0;
        // TODO Auto-generated constructor stub
    }
    public void enqueue(T x ) {
    	 
    	Node p = new Node(x);
    	back.next = p;
    	back = p;
    	size ++;}
    public T dequeue() {
    if(size==0) {
    	throw new NoSuchElementException();
    }
    if( size==1) {
    	 Node p = head.next;
         T dat = p.data;
         
         head.next = head.next.next;
         size --;
         back = head;
         return dat;
    	
    }
    	
     Node p = head.next;
     T dat = p.data;
     
     head.next = head.next.next;
     size --;
     return dat;
    	
    }
    
    @SuppressWarnings("unchecked")
	public T front() {
    	if(size==0) {
        	throw new NoSuchElementException();
        }
    	return (T) head.next.data;
    }
    
   



    public int size() {
	
	return size;
	
	
}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}}

