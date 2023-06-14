import java.util.NoSuchElementException;

public class Link {

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;
    private int size;

    public void addFirst(int item){
        // add the new node to the beginning
        // move the first to next
        // add the new value to the node

        var node = new Node(item); // create new node

        if(isEmpty()){  // check if the list is empty, so we append the node and will be the single one in list
            first = last = node;
        } else {
            node.next = first; // move the first node to next and create an empty node in place
            first = node; // put the node created first
        }
        size++;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void addLast(int item) {
        var node = new Node(item); // create the node object (new node)

        if(first == null) { // verify if the list is empty like previous and if true append the new node
            first = last = node;
        } else{
            last.next = node; // create the node before the last item
            last = node; // append the new value in new node
        }

        size++;
    }
    public int indexOf(int item){
        int index = 0; // index of that item
        var current = first; // starting with the first node
        while(current != null){ // transverse the list until is null ( to the end )
            if(current.value == item){ // if the current value where we are is the item we are looking for
                return index; // return the index of that item (the position)
            }
            current = current.next; // if not move to the next value
            index++; // and append the index while transverse with one (which represent the index of each item while transversing )
        }
        return -1; // in the final after we go to null, return -1
    }
    public boolean contains(int item){
        return indexOf(item) != 1;
    }
    public void removeFirst() {

        if(isEmpty()){
            throw new NoSuchElementException(); // if the list is empty just throw and error
        }
        if(first == last) { // if the list has just one item
            first = last = null; // we remove it and set the null to list
            return; // and we don't execute
        }
        var second = first.next; // set this variable as the second item from the list
        first.next = null; // will remove the link
        first = second; // set the second as the first

        size--;
    }
    public void removeLast() {

        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = last = null;
            return;
        }
        var previous = getPrevious(last); // set a var that represent the last element in the list
        last = previous; // set the last as previous element
        last.next = null; // remove the element and set it to null

        size--;
    }
    private Node getPrevious(Node node){
        var current = first; // set a var that represent the first and will represent all the elements in list
        while (current != null) { // iterate thu the list
            if (current.next == last) return current; // if we check the last we return the previous item before it for the removeLast method
            current = current.next; // we iterate to previous of last element
        }
        return null;
    }
    public int size(){
        return size;
    }
    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while(current!= null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }
    public void reverse(){
        //  l            f
        // [10 <- 20 <- 30]
        //  p      c     n
        //         p     c      n
        //               p      stop
        //  n = c.next
        //  c.next = p

        var previous = first; // setting two variables for first and next item
        var current = first.next;


        while(current != null){ // changing the directions
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first; // we set the new link
        last.next = null;
        first = previous;
    }
    public int getKthFromTheEnd(int k){

        if(isEmpty()) { throw new IllegalArgumentException(); }
        var a = first;
        var b = first;

        for(int i = 0; i<k-1; i++){
            b = b.next; // we move the second pointer forward
            if(b == null){
                throw new IllegalArgumentException();
            }
        }
        while(b!= last){
            a = a.next;
            b = b.next;
        }
        return a.value;
    }


}
