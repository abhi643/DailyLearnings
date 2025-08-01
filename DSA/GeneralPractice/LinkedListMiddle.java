class Node{
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}
public class LinkedListMiddle {
    public Node findMiddle(Node head){
        if (head == null) {
            return null;
        }
        
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        LinkedListMiddle list = new LinkedListMiddle();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middle = list.findMiddle(head);
        if (middle != null) {
            System.out.println("Middle element is: " + middle.val);
        } else {
            System.out.println("List is empty.");
        }
    }
}
