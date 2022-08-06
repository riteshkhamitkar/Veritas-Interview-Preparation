public class doubly{



    public class DoublyNode{
        public int value;
        public DoublyNode next;
        public DoublyNode prev;
    }

    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createdll(int nodeValue){
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size=1;
        return head;
    }

    public static void main(String[] args){
        doubly ritesh = new doubly();
        ritesh.createdll(1);
        System.out.println(ritesh.head.value);
    }

}
