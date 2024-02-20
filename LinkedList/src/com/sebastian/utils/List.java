package com.sebastian.utils;

/**
 * This is an inteface that contains basic methods for a singly linked list
 * 
 * @author
 *         Sebastian Corporan Berrios
 */
public interface List<T> {

    /**
     * Adds the specified element to the front of the list
     * 
     * @param element
     *                The specified element to be added
     */
    void addFirst(T element);

    /**
     * Adds the specified element at the end of the list
     * 
     * @param element
     *                The specified element to add
     */
    void addLast(T element);

    /**
     * Removes the element located at the head of the list
     * 
     * @return
     *         {@code true} if the element was removed, false otherwise
     * 
     * @throws EmptyLinkedListException
     *                                  If the list is empty
     */
    boolean removeFirst();

    /**
     * Removes the element located at the tail of the list
     * 
     * @return
     *         {@code true} if the element was removed, false otherwise
     * 
     * @throws EmptyLinkedListException
     *                                  If the list is empty
     */
    boolean removeLast();

    /**
     * Returns the element located at the head of the list
     * 
     * @return
     *         The element located at the head node of the list
     * 
     * @throws EmptyLinkedListException
     *                                  If the list is empty
     */
    T peek();

    /**
     * Removes the specified element from the list
     * 
     * @param element
     *                The element to remove from the list
     * @return
     *         {@code true} if the element was removed, false otherwise
     */
    boolean remove(T element);

    /**
     * Determines if the list is empty
     * 
     * @return
     *         {@code true} if the list is empty, {@code false} otherwise
     */
    boolean isEmpty();

    /**
     * Determines if the specified element is found in the list
     * 
     * 
     * @param element
     *                The element to look for in the list
     * @return
     * 
     *         {@code true} if the element was found, false otherwise
     */
    boolean contains(T element);

} // interface
