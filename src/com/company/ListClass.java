package com.company;

public class ListClass implements ListInterface {
    private int length;
    private Node head;
    private Node tail;


    ListClass() {
        this.length = 0;
    }

    @Override
    public void addNode(Node node) {
        if (this.length == 0) {
            this.head = node;
            node.setNext(null);
            node.setBefore(null);
        } else {
            node.setBefore(this.tail);
            this.tail.setNext(node);
        }

        this.tail = node;
        this.length++;

    }

    @Override
    public void removeTail() {
        if (this.length > 0) {
            this.tail = this.tail.getBefore();
            this.tail.setNext(null);
        }
    }

    @Override
    public void removeAll() {
        this.length = 0;
        this.head = null;
    }

    @Override
    public void print() {
        System.out.println("display list:");
        Node current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
