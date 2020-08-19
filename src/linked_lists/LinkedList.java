package linked_lists;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedList implements List
{
    private Node head;
    private int size;

    public LinkedList() {
        //do nothing...
    }

    public boolean add(Object element) {
        //is the list empty?
        if (head == null) {
            head = new Node(element, null);
        }
        else {
            //move to the last element
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(element, null);
        }
        size++;
        return true;
    }

    public boolean contains(Object element) {
        Node current = head;

        //while we have an element
        while (current != null) {
            //if we found it
            if (current.data.equals(element)) {
                return true;
            }
            //otherwise, move to next
            current = current.next;
        }
        return false;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean remove(Object element) {
        //is the list empty?
        if (head == null) {
            return false; //not successful!
        }
        else if (head.data.equals(element)) {
            //remove the first element
            head = head.next;
            size--;
            return true;
        }
        else {
            //move to the node beforehand
            Node current = head;
            while (current.next != null &&
                   !current.next.data.equals(element)) {
                current = current.next;
            }

            //if we didn't find it
            if (current.next == null) {
                return false;
            }
            else {
                current.next = current.next.next;
                size--;
                return true;
            }
        }
    }

    public void clear()
    {
        head = null;
        size = 0;
    }

    @Override
    public void add(int index, Object element)
    {
        indexCheck(index);

        //move to the element before the goal index
        Node current = head;
        for (int i = 0; i < index - 1; i++)
        {
            current = current.next;
        }

        Node next = new Node(element, current.next);
        current.next = next;
    }

    private void indexCheck(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException(
                "Index is invalid!");
        }
    }

    @Override
    public Object get(int index)
    {
        indexCheck(index);

        //move to the element at the goal index
        Node current = head;
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }

        //return the element at this index
        return current.data;
    }

    @Override
    public Object set(int index, Object element)
    {
        indexCheck(index);

        //move to the element at the goal index
        Node current = head;
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }

        //change the element in node
        Object result = current.data;
        current.data = element;
        return result;
    }

    @Override
    public Object remove(int index)
    {
        indexCheck(index);

        //move to the element before the goal index
        Node current = head;
        for (int i = 0; i < index - 1; i++)
        {
            current = current.next;
        }

        //remove the node
        Object result = current.next.data;
        current.next = current.next.next;
        return result;
    }

    @Override
    public int indexOf(Object element)
    {
        Node current = head;
        int index = 0;

        while (current != null)
        {
            if (current.data.equals(element))
            {
                return index;
            }
            index++;
            current = current.next;
        }

        return -1; //not found!
    }

    @Override
    public int lastIndexOf(Object element)
    {
        Node current = head;
        int index = 0;
        int foundIndex = -1;

        while (current != null)
        {
            if (current.data.equals(element))
            {
                //save all indices that are found
                //and return the last one found
                foundIndex = index;
            }
            index++;
            current = current.next;
        }

        return foundIndex;
    }

    @Override
    public List subList(int from, int to) {
        throw new RuntimeException("Operation not supported");
    }

    @Override
    public ListIterator listIterator() {
        throw new RuntimeException("Operation not supported");
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new RuntimeException("Operation not supported");
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new RuntimeException("Operation not supported");
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new RuntimeException("Operation not supported");
    }

    @Override
    public boolean containsAll(Collection collection) {
        throw new RuntimeException("Operation not supported");
    }

    @Override
    public Iterator iterator() {
        throw new RuntimeException("Operation not supported");
    }

    @Override
    public Object[] toArray() {
        throw new RuntimeException("Operation not supported");
    }

    @Override
    public Object[] toArray(Object[] objects) {
        throw new RuntimeException("Operation not supported");
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}

