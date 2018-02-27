package com.company;

public class Main {

    public static void main(String[] args) {
        ListClass list = new ListClass();

        for (int i = 0; i < 10; i++) {
            Node node = new Node("" + i);
            list.addNode(node);
        }
        System.out.println("Create list: ");
        list.print();

        System.out.println("Delete Tail ");
        list.removeTail();
        list.print();

        System.out.println("Delete after ");
        list.removeAfter(5);
        list.print();

        System.out.println("Delete all ");
        list.removeAll();
        list.print();
    }


}
