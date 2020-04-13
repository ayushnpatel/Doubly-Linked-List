public class DoublyLinkedList<T>{

    ListNode<T> head;
    ListNode<T> tail;
    int size;
    public DoublyLinkedList(){
        this.size = 0;
        head = null;
        tail = null;
    }
    /*public DoublyLinkedList(ListNode<T> listNode){
        this.size = 1;
        this.root.setNext(listNode);
        this.end.setPrevious(listNode);
    }*/
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        tail = null;
    }

    public void add(T element) {
         
        ListNode<T> temp = new ListNode<T>(element);
        temp.setNext(null);
        temp.setPrevious(tail);
        if(tail != null) {
            tail.setNext(temp);
        }
        tail = temp;
        if(head == null) { 
            head = temp;
        }
        size++;
    }

    public void add(int index, T value){
        ListNode<T> node = new ListNode<T>(value);
        if(index > size()+1  || index < 0){
            throw new IndexOutOfBoundsException();
        }else if(index == 0){
            ListNode temp = head;
            head = node;
            node.setNext(temp);
            size++;
        }else if (index == size()){
            ListNode<T> temp = tail;
            tail = node;
            node.setPrevious(temp);
            temp.setNext(tail); // it is linked, it is not being printed
            size++;
        }
        else{
            ListNode<T> temp = head;
            for(int x = 0; x < index-1; x++){
                temp = temp.getNext();
            }
            node.setNext(temp.getNext());
            node.setPrevious(temp);
            temp.getNext().setPrevious(node);
            temp.setNext(node);
            size++;
        }
    }

    public T get(int index){
        ListNode<T> temp = head;
        if(index > size()-1  || index < 0){
            throw new IndexOutOfBoundsException();
        }
        else if(index == 0){        
            return temp.getValue();
        }else if(index == size()-1){
            while(temp.hasNext()){
                temp = temp.getNext();
            }
            return temp.getValue();
        }else{
            for(int x = 0; x < index; x++){
                temp = temp.getNext();
            }
            return temp.getValue();
        }
    }
    public void set(int index, T value){
        ListNode<T> temp = head;
        if(index > size()-1  || index < 0){
            throw new IndexOutOfBoundsException();
        }
        else if(index == 0){        
            head.setValue(value);
        }else if(index == size()-1){
            while(temp.hasNext()){
                temp = temp.getNext();
            }
            temp.setValue(value);
        }else{
            for(int x = 0; x < index; x++){
                temp = temp.getNext();
            }
            temp.setValue(value);
        }
    }

    public boolean contains(T value){
        ListNode<T> temp = head;
        boolean contains = false; 
        if(temp.getValue() == value)
                contains = true;      
        while(temp.hasNext()){
            temp = temp.getNext();
            if(temp.getValue().equals(value)){
                System.out.println(temp.getValue());
                contains = true;
            }
        }
        return contains;
    }

    public T remove(int index){
        if(index > size() || index < 0){
            throw new IndexOutOfBoundsException();
        }else if(index == 0){
            //ListNode<T> temp = head;  
            T value = head.getValue();      
            head = head.getNext();
            size--;
            return value;
        }else if(index == size()-1){
            T value = tail.getValue();
            tail = tail.getPrevious();
            tail.setNext(null);
            size--;
            return value;
        }
        else{
            ListNode<T> temp = head;
            for(int x = 0; x < index; x++){
                temp = temp.getNext();
            }
            T value = temp.getValue();
            ListNode<T> hehe = temp;
            temp.getNext().setPrevious(hehe.getPrevious());
            temp.getPrevious().setNext(hehe.getNext());
            size--;
            return value;
        }
        
    }

    public String toString(){
        String temp="";
        temp+="[";
        ListNode<T> temp2 = head;
        temp+=temp2.getValue();
        temp2 = temp2.getNext();
        while(temp2 != null){ 
            temp+=", "+temp2.getValue();
            temp2 = temp2.getNext();
        }
        temp+="]";
        return temp;
    }

    public String toReversedString(){
        String temp="";
        temp+="[";
        ListNode<T> temp2 = tail;
        temp+=temp2.getValue();
        temp2 = temp2.getPrevious();
        while(temp2 != null){
            temp+=", "+temp2.getValue();
            temp2 = temp2.getPrevious();
        }
        temp+="]";
        return temp;
    }
}