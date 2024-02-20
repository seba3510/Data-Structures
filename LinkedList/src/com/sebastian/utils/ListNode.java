package com.sebastian.utils;


/**
 * ListNode
 */
public class ListNode<T>{


    private ListNode<T> next;

    private T  data;

    public ListNode<T> getNext() {
        return this.next;
    } // getNext()

    public void setNext(ListNode<T> next) {
        this.next = next;
    } // setNext()

    public T getData() {
        return this.data;
    } // getData()

    public void setData(T data) {
        this.data = data;
    } // setData()


    //================================================================================================


    public ListNode() {
        setData(null);
        setNext(null);
    } // ListNode()


    public ListNode(T data){

        setData(data);

    } // ListNode()


    


    
} // class