public class GenericDoublyLinkedList <E> {
    class Node<T> {
        public T data;
        public Node<T> next;
        public Node<T> prev;

        Node(T data, Node<T> next, Node<T> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

    Node<E> head = null;

    Node<E> tail = null;

    public void addfrontNode(E data) {
        Node<E> temp = new Node<E>(data, head, null);
        if (head != null) {
            head.prev = temp;
        }
        head = temp;

        if (tail == null) {
            tail = temp;
        }
        System.out.println("New node added: " + data);


    }

    public void addbackNode(E data) {
        Node temp = new Node(data, null, tail);

        if (tail != null) {
            tail.next = temp;
        }
        tail = temp;
        if (head == null) {
            head = temp;
        }
        System.out.println("New node added: " + data);
    }

    public E peekFront() {
        System.out.println(head.data);
        return head.data;
    }

    public E peekBack() {
        System.out.println(tail.data);
        return tail.data;
    }


    public E removefrontNode() {
        Node<E> temp = head;
        head = head.next;
        head.prev = null;
        System.out.println("deleted: " + temp.data);
        return temp.data;
    }

    public E removebackNode() {
        Node<E> temp = tail;
        tail = tail.prev;
        tail.next = null;
        System.out.println("deleted: " + temp.data);
        return temp.data;
    }

    public void forward() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void backward() {
        Node<E> temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }


    }
}
