package com.sebastian.utils;

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addFirst'");
    }

    // =========================================================================================================

    @Override
    public void addLast(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addLast'");
    }

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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    // =========================================================================================================

    @Override
    public boolean remove(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    // =========================================================================================================

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    // =========================================================================================================

    @Override
    public boolean contains(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }

} // class
