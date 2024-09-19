package LinkList;

import java.util.Scanner;

public class ListNode {

    Node head = null;
    Scanner input = new Scanner(System.in);

    public class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    public void InsertFirstLinkList() {
        int data;
        int a;
        do {

            System.out.print("Enter the node value : ");
            data = input.nextInt();

            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            System.out.println("If you insert node than press 1 or not to press 0");
            a = input.nextInt();
        } while (a == 1);
    }

    public void PrintLinkList() {
        Node newHead = head;
        if (head == null) {
            System.out.println("There is no node exist");
        } else {
            while (newHead != null) {
                System.out.print(newHead.data + " --> ");
                newHead = newHead.next;
            }
            System.out.println("null");
        }
    }

    public void InsertLast() {
        int data;
        Node current = head;
        System.out.print("Enter the value to insert the last : ");
        data = input.nextInt();
        Node last = new Node(data);
        if (head == null) {
            head = last;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = last;
            current = last;
        }
    }

    public void InsertAnyPosition() {
        int position, count = 1, data;
        Node current = head;
        Node temp;
        System.out.print("Enter the position you need to insert : ");
        position = input.nextInt();
        System.out.print("Enter the value you need to insert any position : ");
        data = input.nextInt();
        Node pInsert = new Node(data);
        if (head == null && position == 1) {
            head = pInsert;
        } else if (position == 1) {
            pInsert.next = head;
            head = pInsert;
        } else {
            while (count < position - 1) {
                current = current.next;
                count += 1;
            }
            temp = current.next;
            pInsert.next = temp;
            current.next = pInsert;

        }
    }

    public Node DeleteFirst() {
        if (head == null) {
            return null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        }
    }
}