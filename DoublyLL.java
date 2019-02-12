package Doublyll;

/**
 *
 * @author Abhinav Thakur
 */
class Node{
    Node next;
    Node prev;
    int data;
    public Node(int d){
        data = d;
        this.prev = null;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    Node tail;
    public void traverse(){
        if(head == null){
            System.out.println("List is Empty !");
        }
        else{
            Node current;
            current = head;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
    public void traverseReverse(){
        if(tail == null){
            System.out.println("Yaha Kuch Nahin Hai!");
        }
        else{
            Node current;
            current = tail;
            while(current != null){
                System.out.println(current.data);
                current = current.prev;
            }
        }
    }
    public Node insertBig(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head.prev = node;
            head = node;
        }
        return head;
    }
    public Node insertEnd(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
    }
        return head;
    }
    public void deleteBig(){
        if(head == null){
            System.out.println("List is Empty !");
        }
        else{
            if(head != null && head == tail){
                head = null;
                tail = null;
            }
            else{
            head = head.next;
            head.prev = null;
            }
        }
    }
    public void deleteEnd(){
        if(head == null){
            System.out.println("List is Empty !");
        }
        else{
            if(tail != null && tail == head){
                head = null;
                tail = null;
            }
            tail = tail.prev;
            tail.next = null;
        }
    }
}
public class DoublyLL {
    public static void main(String[] args){
        LinkedList l1 = new LinkedList();
        
        l1.insertBig(7);
        l1.insertBig(6);
        l1.insertBig(5);
        l1.insertBig(4);
        l1.insertBig(3);
        l1.insertBig(2);
        l1.insertBig(1);
        l1.insertEnd(8);
        l1.insertEnd(9);
        l1.insertEnd(10);
        l1.traverse();
        
    }
}
