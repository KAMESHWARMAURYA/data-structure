package linkedlist;

public class CustomLInkedLIst {

    // add first
    Node head;
    public void addFirst(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    // add last

    public void addLast(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        Node currentNode = head;
        while (currentNode.next !=null){
            currentNode = currentNode.next;
        }
        currentNode.next = node;
    }

    // delete first

    public void deleteFirst(){
        if (head == null){
            System.out.println("empty");
            return;
        }
        head = head.next;
    }

    // delete last

    public void deleteLast(){
        if (head == null){
            System.out.println("Empty");
            return;
        }
        if (head.next == null){
            head = null;
        }
        Node secondLastNode = head;
        Node lastNode = head.next;
        while (lastNode.next !=null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    //display
    public void printData(){
        if (head == null){
            System.out.println("null");
            return;
        }
        Node currentNode = head;
        while (currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }
}
