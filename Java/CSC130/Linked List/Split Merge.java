import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Node class to create a node
class Node{
    String name;
    Node next;
    Node(String initialName){
        name = initialName;
        next = null;
    }
}

// Llist class to create a linked list
class Llist{
    Node head;
    void add (Node newNode) {
        if (head == null) { 
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    Llist split(){
        // Count the number of nodes in the list
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Find the midpoint
        int midpoint = count / 2;
        temp = head;
        for (int i = 1; i < midpoint; i++) {
            temp = temp.next;
        }

        // Split the list into two halves
        Llist myList2 = new Llist();
        myList2.head = temp.next;
        temp.next = null;

        return myList2;
    }   

    // Merge two linked lists
    void merge(Llist myList2){
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = myList2.head;
    }

    // Traverse the linked list
    void traverse(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.name);
            temp = temp.next;
        }
        System.out.println();
    }
}    
class Driver{
    public static void main(String[] args) throws IOException {
        String file = System.getProperty("user.home") + "/first-names.txt"; // Set file path
        Llist first=new Llist(); // Create a linked list
        Scanner input= new Scanner(new File(file)); // Read the file
        while (input.hasNext()) {
            first.add(new Node(input.next())); // Add the names to the linked list
        }
        input.close();

        Llist second=first.split();
        first.traverse();
        second.traverse();
        first.merge(second);
        first.traverse();
    }
}
    