class CustomHashMap{
    //node class
    static class Node{
        int key, value;
        Node next;
        Node(int k, int v){
            key=k;
            value=v;
        }
    }
    //size of hash table
    private final int SIZE=1000;
    //array of linked lists 
    private Node[] table =new Node[SIZE];
    //hash function to convert key into index
    private int hash(int key) {
        return key % SIZE;
    }
     // Insert or update a key-value pair
    public void put(int key, int value){
        int index=hash(key);
        Node head=table[index];
        // Traverse linked list to check if key already exists
        while (head !=null) {
            if (head.key ==key) {
                head.value= value;
                return;
            }
            head=head.next;
        }
        // If key not found, insert new node at beginning
        Node newNode =new Node(key, value);
        newNode.next=table[index];
        table[index]=newNode;
    }
     // Retrieve value for a given key
    public int get(int key){
        int index =hash(key);
        Node head =table[index];
        //traverse linked list to find the key
        while (head !=null) {
            if (head.key== key) return head.value;
            head = head.next;
        }
        return -1;
    }
    //remove key-value pair from hash map
    public void remove(int key) {
        int index=hash(key);
        Node head=table[index];
        Node prev=null;
        while (head != null){
            if (head.key == key){
                if (prev ==null) table[index]=head.next;
                else prev.next=head.next;
                return;
            }
            prev=head;
            head=head.next;
        }
    }
}
