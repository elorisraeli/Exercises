package com.company.homework.Pracrice11;

public class Classroom {
    private Node head;
    private Node tail;
    private int size;

    public Classroom(int size){
        this.size = size;
        this.head = null;
        this.tail = null;
    }

    public void add(Student s){
        Node newNode = new Node(s);
        if (head==null){
            head = newNode;
        }
        else {
            Node temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        size++;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
