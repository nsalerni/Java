/*
 * ListIterator.java
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
import java.util.NoSuchElementException;

public interface ListIterator<E>
{
    /*
      Move the iterator past the next element.
      @return the traversed element.
    */
    E next();

    /*
      Tests if there is an element after the iterator position.
      @return true if there is an element after the iterator position.
    */
    boolean hasNext();

    /*
      Adds an element before the iterator position and moves
      the iterator past the inserted element.
      @param element - the element to add.
    */
    void add(E element);

    /*
      Removes the last travered element.
    */
    void remove();

    /*
      Sets the last travered element to a different value.
      @param element - the element to set.
    */
    void set(E element);

    /*
      Gives the index of the next element to be returned on a call to next().
      @return the index of the element.
    */
    int nextIndex();
}
