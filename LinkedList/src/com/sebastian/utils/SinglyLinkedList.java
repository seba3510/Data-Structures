package com.sebastian.utils;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.NoSuchElementException;

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

        boolean empty = isEmpty();

        if ((empty)) {
            String err = "Cannot remove an element from an empty list";
            throw new EmptyLinkedListException(err);
        } // if()

        boolean removed = false;

        this.head = this.head.next;
        decrementSize();
        removed = true;

        return removed;

    } // removeFirst()

    // =========================================================================================================

    @Override
    public boolean removeLast() {

        boolean empty = isEmpty();

        int n = this.size;

        if ((empty)) {
            String err = "Cannot remove an element on an empty list";
            throw new EmptyLinkedListException(err);

        }

        else if ((n == 1)) {
            removeFirst();

        }

        ListNode<T> curr = this.head;
        return removeLast(curr);

    }// removeLast()
     // =========================================================================================================

    private boolean removeLast(ListNode<T> curr) {

        if ((curr.next == this.tail)) {
            this.tail = curr;
            curr.next = null;
            decrementSize();
            return true;

        } // if()

        curr = curr.next;
        return removeLast(curr);
    } // removeLast()

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

    private void decrementSize() {

        this.size--;
    } // decrementSize()
      // =========================================================================================================

    @Override
    public String toString() {

        String list = "";
        ListNode<T> curr = this.head;

        while ((curr != null)) {

            list += curr.data;

            if ((curr.next != null)) {
                list += "-> ";
            } // if()

            curr = curr.next;

        } // while()

        return list;
    } // toString()

} // class
