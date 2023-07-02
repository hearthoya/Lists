//public class DoublyLinkedList {
//    class Node {
//        public String data;
//        public Node next;
//        public Node prev;
//
//        Node(String string, Node next, Node prev) {
//            this.data = string;
//            this.next = next;
//            this.prev = prev;
//        }
//    }
//
//    Node head = null;
//    Node tail = null;
//
//    public void addfrontNode(String string) {
//        Node temp = new Node(string, head, null);
//        if (head != null) {
//            head.prev = temp;
//        }
//        head = temp;
//
//        if (tail == null) {
//            tail = temp;
//        }
//        System.out.println("New node added: " + string);
//
//
//    }
//
//    public void addbackNode(String string) {
//        Node temp = new Node(string, null, tail);
//
//        if (tail != null) {
//            tail.next = temp;
//        }
//        tail = temp;
//        if (head == null) {
//            head = temp;
//        }
//        System.out.println("New node added: " + string);
//    }
//
//    public String removefrontNode() {
//        Node temp = head;
//        head = head.next;
//        head.prev = null;
//        System.out.println("deleted: " + temp.data);
//        return temp.data;
//    }
//
//    public String removebackNode() {
//        Node temp = tail;
//        tail = tail.prev;
//        tail.next = null;
//        System.out.println("deleted: " + temp.data);
//        return temp.data;
//    }
//
//    public void forward() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.next;
//        }
//    }
//
//    public void backward() {
//        Node temp = tail;
//        while (temp != null) {
//            System.out.println(temp.data);
//            temp = temp.prev;
//        }
//    }
//}