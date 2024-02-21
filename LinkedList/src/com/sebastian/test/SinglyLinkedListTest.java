package com.sebastian.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

import com.sebastian.utils.SinglyLinkedList;
import com.sebastian.utils.EmptyLinkedListException;

public class SinglyLinkedListTest {

    private SinglyLinkedList<Integer> list;

    @Before
    public void setUp() {

        this.list = new SinglyLinkedList<Integer>();

        this.list.addFirst(1);
        this.list.addFirst(2);
        this.list.addFirst(3);
        this.list.addLast(4);
        this.list.addLast(5);
        this.list.addLast(6);
    } // setUp()

    // =====================================================================================

    @Test
    public void testToStringForEmptyList() {

        String expected = "";
        String result = new SinglyLinkedList<Integer>().toString();
        assertEquals(expected, result);

    } // testToStringForEmptyList()

    // =====================================================================================

    @Test
    public void testToStringAsExpected() {

        String expected = "3-> 2-> 1-> 4-> 5-> 6";
        String result = this.list.toString();
        assertEquals(expected, result);

    } // testToStringForEmptyList()

    // =====================================================================================

    @Test
    public void testAddFirstAsExpected() {

        this.list.addFirst(7);
        this.list.addFirst(8);
        this.list.addFirst(9);
        String expected = "9-> 8-> 7-> 3-> 2-> 1-> 4-> 5-> 6";
        String result = this.list.toString();
        assertEquals(expected, result);

    } // testAddFirstAsExpected()

    // =====================================================================================

    @Test
    public void testAddFirstFirstForEmptyList() {

        SinglyLinkedList<Integer> myList = new SinglyLinkedList<Integer>();
        myList.addFirst(5);

        String expected = "5";
        String result = myList.toString();
        assertEquals(expected, result);
    } // testAddFirstForEmptyList()

    // =====================================================================================

    @Test
    public void testRemoveFirstAsExpected() {

        int n = 3;

        for (int i = 0; i < n; i++) {
            this.list.removeFirst();
        } // for()

        String expected = "3-> 2-> 1";
        String result = this.list.toString();
        assertEquals(expected, result);

    } // testRemoveFirstAsExpected()

    // =====================================================================================

    @Test
    public void testRemoveFirstForEmptyList() {

        try {
            SinglyLinkedList<Integer> obj = new SinglyLinkedList<>();

            obj.removeFirst();
            String err = "EmptySinglyLinkedListException expected to be thrown";
            fail(err);

        } catch (EmptyLinkedListException e) {

            String expected = "Cannot remove an element on an empty list!";
            String result = e.getMessage();
            assertEquals(expected, result);
        } // catch()

    } // testRemoveFirstForEmptyList()

    // =====================================================================================

    @Test
    public void testRemoveLastAsExpected() {

        int n = 3;

        for (int i = 0; i < n; i++) {
            this.list.removeLast();
        } // for()

        String expected = "6-> 5-> 4";
        String result = this.list.toString();
        assertEquals(expected, result);

    } // testRemoveLastAsExpected()

    // =====================================================================================

    @Test
    public void testRemoveLastForEmptyList() {

        try {
            SinglyLinkedList<Integer> obj = new SinglyLinkedList<>();

            obj.removeLast();
            String err = "EmptySinglyLinkedListException expected to be thrown";
            fail(err);

        } catch (EmptyLinkedListException e) {

            String expected = "Cannot remove an element on an empty list!";
            String result = e.getMessage();
            assertEquals(expected, result);
        } // catch()

    } // testRemoveFirstForEmptyList()

    // =====================================================================================

    @Test
    public void testContainsForEmptyList() {

        try {
            int elem = 6;

            new SinglyLinkedList<Integer>().contains(elem);
            String err = "NoSuchElementException expected to be thrown";
            fail(err);
        } catch (NoSuchElementException e) {

            String expected = "Empty list";
            String result = e.getMessage();
            assertEquals(expected, result);

        } // catch()

    } // testContainsForEmptyList()

    // =====================================================================================

    @Test
    public void testRemoveAsExpected() {

        int elem1 = 6;
        String expected1 = "5-> 4-> 3-> 2-> 1";
        this.list.remove(elem1);
        String result1 = this.list.toString();
        assertEquals(expected1, result1);

        int elem2 = 2;
        String expected2 = "5-> 4-> 3-> 2";
        this.list.remove(elem2);
        String result2 = this.list.toString();
        assertEquals(expected2, result2);

        int elem3 = 3;
        String expected3 = "5-> 4-> 3-> 2";
        this.list.remove(elem3);
        String result3 = this.list.toString();
        assertEquals(expected3, result3);

    } // testRemoveAsExpected()

    // =====================================================================================

    @Test
    public void testRemoveForEmptyList() {

        try {
            int elem = 5;
            new SinglyLinkedList<Integer>().remove(elem);
        } catch (EmptyLinkedListException e) {
            String expected = "Cannot remove an element on an empty list";
            String result = e.getMessage();

        } // catch()

    } // testRemoveForEmptyList()

    // =====================================================================================

    @Test
    public void testPeekAsExpected() {

        int expected = 6;
        int result = this.list.peek();
        assertEquals(expected, result);

    } // testPeekAsExpected()

    // =====================================================================================

    @Test
    public void testPeekForEmptyList() {

        try {
            new SinglyLinkedList<Integer>().peek();

            String err = "EmptyLinkedListException expected to be thrown";
            fail(err);

        } catch (EmptyLinkedListException e) {
            String expected = "Empty list";
            String result = e.getMessage();
            assertEquals(expected, result);
        } // catch()

    } // testPeekForEmptyList()

    // =====================================================================================

    @Test
    public void testPeekWhenRemovingElements() {

        this.list.removeFirst();
        this.list.removeFirst();
        this.list.removeFirst();

        int expected = 3;
        int result = this.list.peek();
        assertEquals(expected, result);
    } // testPeekWhenRemovingElements()

    // =====================================================================================

    @Test
    public void testContainsAsExpected() {

        int elem1 = 5;
        boolean result1 = this.list.contains(elem1);
        assertTrue((result1));

        int elem2 = 2;
        boolean result2 = this.list.contains(elem2);
        assertTrue((result2));

        int elem3 = 4;
        boolean result3 = this.list.contains(elem3);
        assertTrue((result3));

    } // testContainsAsExpected()

    // =====================================================================================

    @Test
    public void testSizeAsExpected() {

        int expected = 6;
        int result = this.list.size();
        assertEquals(expected, result);

    } // testSizeAsExpected()

    // =====================================================================================

    @Test
    public void testSizeForEmptyList() {

        int result = new SinglyLinkedList<Integer>().size();
        int expected = 0;
        assertEquals(expected, result);

    } // testSizeForEmptyList()

    // =====================================================================================

    @Test
    public void testSizeWhenRemovingElements() {

        int n = 4;

        for (int i = 0; i < n; i++) {
            this.list.removeFirst();
        } // for()

        int expected = 2;
        int result = this.list.size();
        assertEquals(expected, result);
    } // testSizeWhenRemovingElements()
} // class
