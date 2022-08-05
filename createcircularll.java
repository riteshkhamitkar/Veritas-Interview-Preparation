public class circularll {

    public class Node{
        public int value;
        public Node next;
    }

    public Node head;
    public Node tail;
    public int size;
    
    public Node createcircular(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size=1;
        return head;


    }

    public static void main(String[] args){
        circularll ritesh = new circularll();
        ritesh.createcircular(5);
        System.out.println(ritesh.head.value);
        System.out.println(ritesh.head.next.value);
    }


}
