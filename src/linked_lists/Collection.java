package linked_lists;

import java.util.Iterator;

public interface Collection<T>
{
    //basic methods
    boolean add(T element);
    boolean remove(T element);
    boolean contains(T element);
    void clear();
    int size();
    boolean isEmpty();

    //set methods
    boolean addAll(Collection<T> other);
    boolean containsAll(Collection<T> other);
    boolean removeAll(Collection<T> other);
    boolean retainAll(Collection<T> other);

    //misc methods
    boolean equals(Object other);
    int hashCode();
    Iterator<T> iterator();
    Object[] toArray();
}

