/*
 * Stack.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
 import java.util.NoSuchElementException;

 public class Stack<E>
 {
    private Node top;

    private class Node
    {
        public E data;
        public Node next;

        public Node(E data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    /*
      Push an element on the stack.
      @param element - the element to push on the stack.
    */
    public void push(E element)
    {
        top = new Node(element, top);
    }

    /*
      Pop the top element from the stack.
      @return result - the element of the stack that was popped.
    */
    public E pop()
    {
        if (top == null)
            throw new NoSuchElementException();

        E result = top.data;
        top = top.next;
        return result;
    }

    /*
      Peak at the top element from the stack.
      @return the top element of the stack.
    */
    public E peak()
    {
        if (top == null)
            throw new NoSuchElementException();

        return top.data;
    }

    /*
      Is the stack empty?
      @return true if the stack is empty, otherwise false.
    */
    public boolean isEmpty()
    {
        return (top == null);
    }

    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<String>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.peak());
        System.out.println(stack.isEmpty());
    }
 }
