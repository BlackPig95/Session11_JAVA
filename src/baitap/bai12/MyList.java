package baitap.bai12;

import java.util.Arrays;

public class MyList<E>
{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList()
    {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity)
    {
        elements = new Object[capacity];
    }

    public void add(E element)
    {
        if (size == elements.length)
        {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public void add(int index, E element)
    {
        if (size == elements.length)
        {
            ensureCapacity();
        }
        for (int i = index; i < size; i++)
        {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
    }

    public E remove(int index)
    {
        for (int i = 0; i < size; i++)
        {
            if (elements[index] == elements[i])
            {
                for (int j = i; j < size - 1; j++)
                {
                    elements[j] = elements[j + 1];
                }
                size--;
                return (E) elements[size - 1];
            }
        }
        return null;
    }

    public int size()
    {
        return this.size;
    }

    public MyList<E> clone()
    {
        MyList<E> newList = new MyList<>();
        for (int i = 0; i < size; i++)
        {
            newList.add((E) elements[i]);
        }
        return newList;
    }

    public boolean contains(E object)
    {
        for (int i = 0; i < size; i++)
        {
            if (object == elements[i])
            {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E object)
    {
        for (int i = 0; i < size; i++)
        {
            if (object == elements[i])
            {
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity()
    {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int index)
    {
        for (int i = 0; i < size; i++)
        {
            if (elements[index] == elements[i])
            {
                return (E) elements[i];
            }
        }
        return null;
    }

    public void clear()
    {
        for (int i = size - 1; i >= 0; i--)
        {
            this.elements[i] = null;
            size--;
        }
    }
}
