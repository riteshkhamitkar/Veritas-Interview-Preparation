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

    public void insertcll(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createcircular(nodeValue);
            return;
        }else if (location ==0){
            node.next = head;
            head = node;
            tail.next = head;
        }else if(location >= size){
            tail.next = node;
            tail = node;
            node.next = head;
        }else {
        Node tempNode = head;
        int index =0;
            while(index < location-1 ){
                tempNode = tempNode.next;
                index++;

            }
            node.next = tempNode.next;
            tempNode.next = node;

        }
        size++;
    }

    // traversal

    public void traversecll(){
        if(head != null){
            Node tempNode = head;
            for(int i=0; i<size;i++){
                System.out.println(tempNode.value);
                if(i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }else{
            System.out.println("\nCLL does not exits");
        }
    }

    public static void main(String[] args){
        circularll ritesh = new circularll();
        ritesh.createcircular(5);
        ritesh.insertcll(4, 0);
        ritesh.insertcll(7, 2);
        System.out.println(ritesh.head.value);
        System.out.println(ritesh.head.next.value);
        System.out.println(ritesh.head.next.next.value);
        ritesh.traversecll();

    }


}
