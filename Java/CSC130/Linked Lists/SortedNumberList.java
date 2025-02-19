public class SortedNumberList {
    public Node head;
    public Node tail;

    public SortedNumberList() {
        head = null;
        tail = null;
    }

    // Inserts the number into the list in the correct position
    public void insert(double number) {
        Node newNode = new Node(number);

        if (head == null) { // Empty list case
            head = newNode;
            tail = newNode;
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.getData() < number) {
            previous = current;
            current = current.getNext();
        }

        if (previous == null) { // Insert at head
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        } else if (current == null) { // Insert at tail
            previous.setNext(newNode);
            newNode.setPrevious(previous);
            tail = newNode;
        } else { // Insert in middle
            previous.setNext(newNode);
            newNode.setPrevious(previous);
            newNode.setNext(current);
            current.setPrevious(newNode);
        }
    }

    // Removes the node with the specified number value from the list
    public boolean remove(double number) {
        Node current = head;

        while (current != null) {
            if (current.getData() == number) {
                if (current == head) { // Removing head
                    head = current.getNext();
                    if (head != null) {
                        head.setPrevious(null);
                    } else {
                        tail = null;
                    }
                } else if (current == tail) { // Removing tail
                    tail = current.getPrevious();
                    tail.setNext(null);
                } else { // Removing from middle
                    current.getPrevious().setNext(current.getNext());
                    current.getNext().setPrevious(current.getPrevious());
                }
                return true;
            }
            current = current.getNext();
        }
        return false; // Number not found
    }
}
