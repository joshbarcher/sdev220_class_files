package linked_lists;

import java.util.Collection;
import java.util.ListIterator;

/**
 * An interface representing a list of elements.
 * @param <T> the generic type
 */
public interface List extends Collection
{
    /**
     * Adds a new element at the provided index
     * in the list. All other elements at that
     * index and higher indices are moved to the
     * next higher index.
     *
     * @param index the position for the new element
     * @param element the element to insert
     */
    void add(int index, Object element);

    /**
     * Returns the element at the given index.
     *
     * @throws IndexOutOfBoundsException this exception
     * is thrown when the index is invalid
     * @param index the index of the element to return
     * @return the element at the provided index
     */
    Object get(int index);

    /**
     * Replaces the element at the given index.
     *
     * @throws IndexOutOfBoundsException this exception
     * is thrown when the index is invalid
     * @param index the index of the element to replace
     * @param element the element to insert into the list
     * @return the old element that is being replaced
     */
    Object set(int index, Object element);

    /**
     * Removes the element at the given index.
     *
     * @throws IndexOutOfBoundsException this exception
     * is thrown when the index is invalid
     * @param index the index of the element to return
     * @return the removed element
     */
    Object remove(int index);

    /**
     * Returns the first index at the which the provided
     * element is found, or -1 if not found.
     *
     * @param element the element to search for
     * @return the index of the element or -1 if not found
     */
    int indexOf(Object element);

    /**
     * Returns the last index at the which the provided
     * element is found, or -1 if not found.
     *
     * @param element the element to search for
     * @return the index of the element or -1 if not found
     */
    int lastIndexOf(Object element);

    /**
     * Returns a new list between the provided indices.
     *
     * @throws IndexOutOfBoundsException this exception
     * is thrown when either of the provided indices
     * are invalid, or out of order.
     *
     * @param from the lower index
     * @param to the higher index
     * @return a new list object
     */
    List subList(int from, int to);

    /**
     * Returns an iterator over the list.
     * @return a new list iterator
     */
    ListIterator listIterator();
}