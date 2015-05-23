/*
 * LinkedList.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
import java.util.NoSuchElementException;

public class LinkedList<E>
{
    private Node<E> head;
    private class Node<E>
    {
        public E data;
        public Node<E> next;
    }

    /*
      Constructs an empty linked list.
    */
    public LinkedList()
    {
      head = null;
    }

    /*
      Get the first element in the linked list.
      @return the first element in the linked list.
    */
    public E getFirst()
    {
        if (head == null)
            throw new NoSuchElementException();
        return head.data;
    }

    /*
      Remove the first element in the linked list.
      @return the removed element.
    */
    public E removeFirst()
    {
        if (head == null)
            throw new NoSuchElementException();

        E element = head.data;
        head = head.next;
        return head.data;
    }

    /*
      Adds an element to the front of the linked list.
      @param element the object to add.
    */
    public void addFirst(E element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = head;
        head = newNode;
    }

    public ListIterator<E> listIterator()
    {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements ListIterator<E>
    {
        private Node<E> position;
        private Node<E> previous;
        private int index;

        /*
          Constructs an iterator that points to the front of the linked list.
        */
        public LinkedListIterator()
        {
            position = null;
            previous = null;
            index = 0;
        }

        /*
          Tests if there is an element after the iterator position.
          @return true if there is an element after the iterator position.
        */
        public boolean hasNext()
        {
            if (position == null)
                return head != null;
            else
                return position.next != null;
        }

        /*
          Moves the iterator to the next element and returns the data of that element.
          If there is no element after the current position, then throw a NoSuchElementException.
          @return the travered element.
        */
        public E next()
        {
            if (!hasNext())
                throw new NoSuchElementException();

            previous = position;
            if (position == null)
                position = head;
            else
                position = position.next;

            index++;
            return position.data;
        }

        /*
          Adds an element before the iterator position and
          moves the iterator position to the inserted element.
          @param element - the object to add.
        */
        public void add(E element)
        {
            if (position == null)
            {
                addFirst(element);
                position = head;
            }
            else
            {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = position.next;
                position.next = newNode;
                position = newNode;
            }
            previous = position;
            index++;
        }

        /*
          Removes the last traversed element.
        */
        public void remove()
        {
            if (position == previous)
                throw new IllegalStateException();
            if (position == head)
                removeFirst();
            else
                previous.next = position.next;
            index--;
            position = previous;
        }

        /*
          Sets the last traversed element to a different value.
          @param element - the object to set.
        */
        public void set(E element)
        {
            if (position == null)
                throw new NoSuchElementException();
            position.data = element;
        }

        /*
          Gives the index of the element that would be returned on a call to next,
          but size() if at the end of the list.
          @return the index of the next element to be returned.
        */
        public int nextIndex()
        {
            return index;
        }
    }

    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("T");
        list.addFirst("S");
        list.addFirst("E");
        list.addFirst("T");

        ListIterator<String> iterator = list.listIterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
