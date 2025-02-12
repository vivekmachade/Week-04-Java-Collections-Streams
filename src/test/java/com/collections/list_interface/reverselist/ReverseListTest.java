package com.collections.list_interface.reverselist;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ReverseListTest {

    @Test
    void reverseArraylist() {
        // An array list to reverse
        ArrayList<Integer> testArray = new ArrayList<>(Arrays.asList(100, 234, 321, 423, 52));
        ArrayList<Integer> expectedReverseArray = new ArrayList<>(Arrays.asList(52, 423, 321, 234, 100));

        //Calling the ReverseArraylist method
        ArrayList<Integer> result = ReverseList.ReverseArraylist(testArray);

        // Verify the reversed list matches expectation
        assertEquals(expectedReverseArray, result);
    }

    @Test
    void reverserLinkedlist() {
        // A linked list to reverse
        LinkedList<Integer> testLinkedList = new LinkedList<>(Arrays.asList(100, 234, 321, 423, 52));
        LinkedList<Integer> expectedReverseLinkedList = new LinkedList<>(Arrays.asList(52, 423, 321, 234, 100));

        // Calling the ReverserLinkedlist method
        LinkedList<Integer> result = ReverseList.ReverserLinkedlist(testLinkedList);

        //  Verify the reversed list matches expectation
        assertEquals(expectedReverseLinkedList, result);
    }

    @Test
    void testReverseArraylist_EmptyList() {
        ArrayList<Integer> emptyList = new ArrayList<>();
        assertEquals(emptyList, ReverseList.ReverseArraylist(emptyList));
    }

    @Test
    void testReverserLinkedlist_EmptyList() {
        LinkedList<Integer> emptyList = new LinkedList<>();
        assertEquals(emptyList, ReverseList.ReverserLinkedlist(emptyList));
    }
}
