package com.sebastian.utils;

/**
 * ListNode
 */
public class ListNode<T> {

    protected ListNode<T> next;

    protected T data;

    // ================================================================================================

    public ListNode() {
        this.data = null;
        this.next = null;
    } // ListNode()

    public ListNode(T data) {

        this.data = data;
        this.next = null;

    } // ListNode()

} // class