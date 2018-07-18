public class Node<T> { //generic node class
    private T data; //created a generic variable callled data
    private Node<T> next; //create a generic variable of type Node called next
    
    public Node() { //constructor
       data= null;
       next=null;
    }
    public Node(T d, Node<T> n){ //two parameter constructor
	data=d;
	next=n;
    } 
    public T getData() {//getter
        return data;
    }
    public void setData(T d) {//setter
	data=d;
    }
    public Node<T> getNext(){//getter
	return next;
    }
    public void setNext(Node<T> n) {//setter
	next=n;
    }
    public String toString() {//to string method that helps print out the node
        Node<T> first = this;
        String ans = "";
        int count = 0;
        Node<T> node = this;
        while(node != null) {
            ans += node.getData();
            if (node.getNext() != null) {
                   ans += "  -->  ";
            }    
            node = node.getNext();
            if(++count % 2 == 0) {
            	first = first.getNext();
            }
            if (node == first) {
                ans += " ... " ;
                break;
            }
            
        }
        return ans;
    }
    public static void main(String[] args) { //main method
	Node<Integer> a= new Node<>(2,null); //created a node that has nothing after it 
	Node<Integer> b= new Node<>(3,a);// created a node that is before a
	Node<Integer> c= new Node<>(4,b); //node is before b
	Node<Integer> d= new Node<>(6,c);//node is before c
	Node<Integer> e= new Node<>(8,d);//node is before d
		
	Node<String> first= new Node<>("Hi",null);//has nothing after it, it is the last node
	Node<String> second= new Node<>("Hello",first);//is the second to last
	Node<String> third= new Node<>("Bye",second);//is the first
	System.out.println("The data stored in the integer nodes is:");
	System.out.println(e);
	System.out.println("The data stored in the String nodes is:");
	System.out.println(third);
    }
   } 