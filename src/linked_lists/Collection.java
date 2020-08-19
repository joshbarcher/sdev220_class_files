package linked_lists;

import java.util.Iterator;

public interface Collection
{
    //basic methods
    boolean add(Object element);
    boolean remove(Object element);
    boolean contains(Object element);
    void clear();
    int size();
    boolean isEmpty();

    //set methods
    boolean addAll(Collection other);
    boolean containsAll(Collection other);
    boolean removeAll(Collection other);
    boolean retainAll(Collection other);

    //misc methods
    boolean equals(Object other);
    int hashCode();
    Iterator iterator();
    Object[] toArray();
}

