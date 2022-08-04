public class SinglyLinkedList{

    public class Node{
        public int value;
        public Node next;
    }

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public static void main(String[] args){

        SinglyLinkedList ssl = new SinglyLinkedList();
        ssl.createSinglyLinkedList(6);
        System.out.println(ssl.head.value);

    }



}
