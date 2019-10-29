package com.playtika.courses.homework9;

import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Iterator;

import static org.junit.Assert.*;

public class ArrayStackTest {

    private Stack<String> stack = new ArrayStack<>();

    @Test(expected = EmptyStackException.class)
    public void newStackShouldNotHaveElements() {
        assertEquals(0, stack.size());
        assertFalse(stack.iterator().hasNext());
        stack.pop();
    }

    @Test
    public void elementsShouldBePushedAndPoppedInCorrectOrder() {
        stack.push("abc");
        stack.push("qwe");
        stack.push("poi");
        stack.push("def");

        assertEquals("def", stack.pop());
        assertEquals("poi", stack.pop());
        assertEquals("qwe", stack.pop());
        assertEquals("abc", stack.pop());
    }

    @Test
    public void stackShouldHaveCorrectSize(){
        stack.push("a");
        assertEquals(1, stack.size());

        stack.push("b");
        assertEquals(2, stack.size());

        stack.push("c");
        assertEquals(3, stack.size());

        stack.pop();
        assertEquals(2, stack.size());

        stack.pop();
        assertEquals(1, stack.size());

        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    public void stackIteratorShouldReturnCorrectValues() {
        stack.push("abc");
        stack.push("qwe");
        stack.push("poi");
        stack.push("def");

        Iterator<String> iterator = stack.iterator();

        assertTrue(iterator.hasNext());
        assertEquals("def", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("poi", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("qwe", iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals("abc", iterator.next());
        assertFalse(iterator.hasNext());
    }
}
