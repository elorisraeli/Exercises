package com.company.homework.Pracrice11;

public class Node {
    private Node next;
    private Node prev;
    private Student s;

    public Node(Student s){
        this.s = s;
    }

    public String toString(){
        return s.toString();
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
