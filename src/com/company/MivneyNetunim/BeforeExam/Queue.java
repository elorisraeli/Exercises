package com.company.MivneyNetunim.BeforeExam;

public class Queue {
    final int INIT_SIZE = 4;
    int maxSize;
    Integer[] items;
    int front, tail, size;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        front = 0;
        tail = 0;
        size = 0;
        items = new Integer[maxSize];
    }

    public Queue() {
        maxSize = INIT_SIZE;
        front = 0;
        tail = 0;
        size = 0;
        items = new Integer[maxSize];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean addElement(int element){
        if (size == maxSize) return false;
        items[tail] = element;
        tail++;
        size++;
        return true;
    }

    public Integer pop(){
        if (isEmpty()) return null;
        Integer popHead = items[front];
        size--;
        front = (front+1) % items.length;
        return popHead;
    }

    public Integer peekHead(){
        if (isEmpty()) return null;
        return items[front];
    }
}
