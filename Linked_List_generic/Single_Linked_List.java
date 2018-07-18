public class Single_Linked_List<T> { //single linked list code
    private Node<T> head; //created a head
    private Node<T> tail; //created a tail
    private int size; //to keep track of the size
	
    public Single_Linked_List() { //constructor
	head = tail = null;
    size = 0;
    }
	    
    public int size() {//returns the size of the linked list
	return size;
    }
	    
    public boolean isEmpty() {//checks if the linked list is empty
	return size == 0;
    }
	    
    public void addHead(T d) { //add to the head 
	Node<T> n = new Node<>(d, head);
        head = n;
	size++; //need to increase the size
        if (tail == null) {//if there isn't isn't a tail then set the thing you are adding to be the head and tail
	    tail = head;
	}
     }
	    
     public void addTail(T d) { //add tail 
	Node<T> n = new Node<>(d, null);
        if(tail == null) { //if there isn't a tail then set the head and tail to be the new node you are adding
        	head = tail = n;
	}
	else { //if there is already something there then add it after the tail
	    tail.setNext(n); //set the new packet of data as tail now
	    tail = n;
	}
	size++;//increase the size
     }
    public T removeHead() throws Exception{//removing the head
	if(head == null) {//if there isn't anything set a the head
		throw new Exception("Empty List");//throws a exception and says list is empty
	}	
	Node<T> n = head; //sets the n to be head
        head = head.getNext();//set the head to be the packet of data that was after it
        if(head == null) { //if head is now empty set the tail to be the same value as head
            tail = head;	
	}
	size--; //decrease the size
	return n.getData();//return the original head that is now node n
     }
	    
     public String toString() { //to string method to print out the linked list
	String ans = "";
	Node<T> n = head;
	ans += "(H)-->";
	while(n != null) {
	    ans += n.getData();
	    ans += " --> ";
	    n = n.getNext();
        }
	return ans + "(T)";
     } 

}
