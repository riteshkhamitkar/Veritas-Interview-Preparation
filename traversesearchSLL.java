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

    // Insertion in LL 

    public void insertLinkedList(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }else if(location ==0){
            node.next = head;
            head = node;
        }else if(location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else{
            Node tempNode = head;
            int index=0;
            while(index < location -1){
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;

    }

    // SLL Traverse 

    public void traverse(){
        if(head == null){
            System.out.println("SLL does not exist");
        }else{
            Node tempNode = head;
            for(int i = 0; i < size;i++){
                System.out.print(tempNode.value);
                if(i != size -1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // Searching value in LL 

    boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i = 0; i < size; i++){
                if(tempNode.value == nodeValue){
                    System.out.print("FOund node at : "+i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node not found");
        return false;
    }

    public static void main(String[] args){

        SinglyLinkedList ssl = new SinglyLinkedList();
        ssl.createSinglyLinkedList(6);
         
        ssl.insertLinkedList(6, 1);
        ssl.insertLinkedList(7, 3);
        ssl.insertLinkedList(8, 4);
        ssl.insertLinkedList(9, 5);
        ssl.traverse();
        ssl.searchNode(7);
    }



}
