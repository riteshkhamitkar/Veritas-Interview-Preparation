class Main {
 
    static Node head;
 
    static class Node {
 
        int value;
        Node next;
 
        Node(int d)
        {
            value = d;
            next = null;
        }
    }
 
    /* 2 */
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    // 3
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.value+ " ");
            node = node.next;
        }
    }
 
    // 4
    public static void main(String[] args)
    {
        Main list = new Main();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
 
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
