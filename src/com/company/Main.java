package com.company;

public class Main {

    public static void main(String[] args) {
        ListClass list = new ListClass();

        for (int i = 0; i < 5; i++) {
            Node node = new Node("" + i);
            list.addNode(node);
        }
        list.print();

        list.removeTail();
        list.print();

        list.removeAll();
        list.print();
    }


}
