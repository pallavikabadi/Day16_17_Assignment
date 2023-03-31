package com.bridgelabz.DataStructurePrograms.UnOrderedList;

public class LinkedList <T> {

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
    public T pop() {

        if (head == null)
            return null;
        T popData = head.data;
        head = head.next;
        return popData;
    }
    public T poplast() {

        if (head == null)
            return null;
        T popData = tail.data;
        Node<T> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
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
    public Boolean insertAfter(T searchData, T insertData) {

        Node<T> newNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode != null) {
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            return true;
        }
        return false;
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
}







