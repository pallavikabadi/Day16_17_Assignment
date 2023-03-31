package com.bridgelabz.DataStructurePrograms.SimpleBalancedParentheses;

public class Stack<T> {

    Node<T> head;
    Node<T> tail;

    public void append(T data) {

        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void push(T data) {

        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void display() {

        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public T pop(char ch) {

        if (head == null)
            return null;
        T popData = head.data;
        head = head.next;
        return popData;
    }

    public Node<T> search(T searchData) {

        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.equals(searchData)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Node<T> delete(T delete) {
        Node<T> temp1 = head;
        Node<T> temp2 = head;
        Node<T> temp3 = head;
        int count = 0;
        while (temp1 != null & temp2 != null & temp3 != null) {
            count++;
            if (count > 2) {
                temp3 = temp3.next;
            }
            if (temp1.data == delete) {
                temp2 = temp2.next;
                temp3.next = temp2;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
    public Node<T> size() {
        Node<T> temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        System.out.println("LinkedList Size = " + count);
        return temp;
    }

    public void check() {
        if (head == null)
            System.out.println("The Arithmetic Equation is BALANCED");
        else
            System.out.println("Equation is NOT BALANCED");
    }
}







