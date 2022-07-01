package com.company.MivneyNetunim.BeforeExam;

public class Stack {
    final int INIT_SIZE = 5;
    Integer[] items;
    int count;
    int max;

    public Stack(int max) { // O(1)
        this.max = max;
        items = new Integer[max];
        count = 0;
    }

    public Stack() { // O(1)
        this.max = INIT_SIZE;
        items = new Integer[max];
        count = 0;
    }

    public boolean push(int item) {
        if (count == max) return false;
        else
            items[count++] = item;
        return true;
    }
    public Integer pop(){
        if (count > 0) return items[--count];
        return null;
    }
    public void clear(){
        count = 0;
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public int size(){
        return count;
    }
    public Integer elementAt(int index){
        if (index > count) return -1;
        return items[index];
    }

}
