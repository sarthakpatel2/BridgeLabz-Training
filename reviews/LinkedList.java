class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList{
    private Node head;
    //add an element at the list
    public void add(int data){
        Node newNode=new Node(data);
        if (head ==null){
            head=newNode;
        } else{
            Node current=head;
            while (current.next !=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    // delete an element by its value
    public boolean delete(int data){
        if (head==null){
            return false; //shows list is empty
        }
        if (head.data==data){
            head=head.next; //deletes the head
            return true;
        }
        Node current=head;
        while (current.next !=null &&current.next.data !=data){
            current=current.next;
        }

        if (current.next ==null){
            return false; //element not found
        }
        current.next=current.next.next; //bypass the deleted node
        return true;
    }
    //display elements of the list
    public void display(){
        Node current=head;
        while (current !=null){
            System.out.print(current.data +" -");
            current =current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Linked List after adding :");
        list.display();
        list.delete(20);
        System.out.println("Linked list after deleting 20:");
        list.display();
    }
}