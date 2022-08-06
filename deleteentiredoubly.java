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

    // Insertion 

    public void insert(int nodeValue, int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if(head == null){
            createdll(nodeValue);
            return;
        }else if(location==0){
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
            
        }else if(location >= size){
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }else{
            DoublyNode tempNode = head;
            int index = 0;
            while (index < location-1){
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev=tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev=newNode;

        }
        size++;
        
    }

    // Traverse dll
    public void traversedll() {
        if (head != null) {
          DoublyNode tempNode = head;
          for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size-1) {
              System.out.print(" -> ");
            }
            tempNode = tempNode.next;
          }
        } else {
          System.out.println("The DLL does not exist!");
        }
        System.out.println("\n");
      }

      // Reverse Traverse
  public void reverseTraverseDLL() {
    if (head != null) {
      DoublyNode tempNode = tail;
      for (int i = 0; i < size; i++) {
        System.out.print(tempNode.value);
        if (i != size-1) {
          System.out.print(" <- ");
        }
        tempNode = tempNode.prev;
      }
    } else {
      System.out.println("The DLL does not exist!");
    }
    System.out.println("\n");
  }
    
  // Searching 

 public boolean search(int nodeValue){
    if(head != null){
        DoublyNode tempNode = head;
        for(int i =0; i< size; i++){
            if(tempNode.value == nodeValue){
                System.out.println("Found at index " +i);
                return true;
                 
            }
            tempNode = tempNode.next;   
        }
    }
    System.out.println("Not found");
    return false;
 } 

 //deletion

 public void deletedll(int location){
    if(head == null){
        System.out.println("Not exists!");
        return;
    }else if (location ==0){
        if(size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }else if(location >= size){
        DoublyNode tempNode = tail.prev;
        if(size == 1){
            head = null;
            tail = null;
            size--;
            return;
        }else {
            tempNode.next = null;
            tail = tempNode;
            size--;
        
        }
    }else{
        DoublyNode tempNode = head;
        for(int i=0;i<location-1;i++){
            tempNode = tempNode.next;
        }
        tempNode.next = tempNode.next.next;
        tempNode.next.prev = tempNode;
        size--;
    }
 }

 // Delete entire list

 public void deleteentire(){
    DoublyNode tempNode = head;
    for(int i =0; i < size; i++){
        tempNode.prev = null;
        tempNode = tempNode.next;
    }
    head = null;
    tail = null;
    System.out.println("The DLL has been deleted!");
 }
    
         
    

    public static void main(String[] args){
        doubly ritesh = new doubly();
         
        ritesh.insert(1, 0);
        ritesh.insert(3, 1);
        ritesh.insert(4, 2);
        ritesh.insert(5, 3);
        ritesh.traversedll();
        ritesh.reverseTraverseDLL();
        ritesh.search(3);
        ritesh.search(9);
        ritesh.deletedll(2);
        ritesh.traversedll();
        ritesh.deleteentire();
        ritesh.traversedll();


         
    }

}
