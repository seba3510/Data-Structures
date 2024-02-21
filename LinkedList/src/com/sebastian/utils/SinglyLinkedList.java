package com.sebastian.utils;

import javax.print.DocFlavor.STRING;

public class SinglyLinkedList<T> implements List<T> {

    private ListNode<T> head;

    private ListNode<T> tail;

    private int size;

    // =========================================================================================================

    public SinglyLinkedList() {

        this.head = null;
        this.tail = null;
        this.size = 0;

    } // SinglyLinkedList()

    @Override
    public void addFirst(T element) {
        boolean empty = isEmpty();

        ListNode<T> temp = new ListNode<T>(element);

        if ((empty)) {
            this.head = temp;
            this.tail = this.head;

        }

        else {

            temp.next = this.head;
            this.head = temp;
        }

        incrementSize();
    } // addFirst()

    // =========================================================================================================

    @Override
    public void addLast(T element) {

        ListNode<T> temp = new ListNode<T>(element);

        boolean empty = isEmpty();

        if ((empty)) {
            addFirst(element);

        }

        else {

            this.tail.next = temp;
            this.tail = temp;
        }

        incrementSize();
    } // addLast()

    // =========================================================================================================

    @Override
    public boolean removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }

    // =========================================================================================================

    @Override
    public boolean removeLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeLast'");
    }

    // =========================================================================================================

    @Override
    public T peek() {
        boolean empty = isEmpty();

        if ((empty)) {
            String err = "Empty list";
            throw new EmptyLinkedListException(err);
        } // if()

        T val = this.head.data;
        return val;
    } // peek()
      // =========================================================================================================

    @Override
    public boolean remove(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    // =========================================================================================================

    @Override
    public boolean isEmpty() {
        return ((this.size == 0));
    } // isEmpty()

    // =========================================================================================================

    @Override
    public boolean contains(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

    @Override
    public int size() {
        return this.size;
    }// size()

    // =========================================================================================================

    private void incrementSize() {

        this.size++;

    } // incrementSize()

    // =========================================================================================================

    @Override
    public String toString() {

        String list = "";
        ListNode<T> curr = this.head;

        while ((curr != null)) {

            list += curr.data;

            if ((curr.next != null)) {
                list += "-> ";
            }

            curr = curr.next;

        } // while()

        return list;
    } // toString()

} // class
