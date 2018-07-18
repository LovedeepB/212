public class DNode<T> {//double node class has a two way connection, the node after and the node before
    private DNode<T> prev;//for the previous node
    private DNode<T> next; //for the next node
    private T data;//the data
    
    public DNode() {//constructor
        prev = null;
        next = null;
        data = null;
    }
    
    public DNode(T d, DNode<T> p, DNode<T> n) {//three parameter constructor
        data = d;
        prev = p;
        next = n;
    }
    
    public T getData() {//getter
        return data;
    }
    
    public DNode<T> getPrev(){//getter
        return prev;
    }
    
    public DNode<T> getNext(){//getter
        return next;
    }
    
    public void setData(T d) {//setter
        data = d;
    }
    
    public void setPrev(DNode<T> p) {//setter
        prev = p;
    }
    
    public void setNext(DNode<T> n) {//setter
        next = n;
    }
}