package baitap.bai13;

import org.w3c.dom.Node;

public class MyLinkedList<E>
{
    private MyNode<E> head;
    private MyNode<E> tail;
    private int numNodes = 0;

    public MyLinkedList()
    {
    }

    ;

    public MyLinkedList(E data)
    {
        head = new MyNode<>(data);
    }

    public void addFirst(E e)
    {
        MyNode<E> newNode = new MyNode<>(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
        if (tail == null)
            tail = head;
    }

    public void addLast(E e)
    {
        MyNode newNode = new MyNode<>(e);
        if (tail == null)
            head = tail = newNode;
        else
        {
            tail.next = newNode;
            tail = tail.next;
        }
        numNodes++;
    }

    public void add(int index, E e)
    {
        if (index == 0) addFirst(e);
        else if (index >= numNodes) addLast(e);
        else
        {
            MyNode current = head;
            for (int i = 1; i < index; i++)
            {
                current = current.next;//Tương đương head.next?
            }//=>current lúc này ở vị trí index-1, current.next ở vị trí index
            MyNode temp = current.next;//=> temp ở vị trí index
            current.next = new MyNode(e);//Current = index-1. Set current.next(index)thành node mới được thêm vào
            (current.next).next = temp;//Current=index-1, current.next=newNode, current.next.next=index
            numNodes++;
        }
    }

    public E removeFirst()
    {
        if (numNodes == 0) return null;
        else
        {
            MyNode<E> temp = head;
            head = head.next;
            numNodes--;
            if (head == null) tail = null;
            return temp.getData();
        }
    }

    public E removeLast()
    {
        if (numNodes == 0) return null;
        else if (numNodes == 1)
        {
            MyNode<E> temp = head;
            head = tail = null;
            return temp.getData();
        } else
        {
            MyNode<E> current = head;
            for (int i = 0; i < numNodes - 2; i++)
            {
                current = current.next;
            }
            MyNode<E> temp = tail;
            tail = current;
            tail.next = null;
            numNodes--;
            return temp.getData();
        }
    }

    public E remove(int index)
    {
        if (index < 0 || index >= numNodes) return null;
        else if (index == 0) return removeFirst();
        else if (index == numNodes - 1) return removeLast();
        else
        {
            MyNode<E> previous = head;
            for (int i = 1; i < index; i++)
            {
                previous = previous.next;// Tương đương head.next
            }//Ở vòng lặp thứ i, previous có vị trí i
            MyNode<E> current = previous.next;
            previous.next = current.next;
            numNodes--;
            return current.getData();
        }
    }

    public void printList()
    {
        if (numNodes <= 0) return;
        MyNode<E> current = head;
        for (int i = 0; i < numNodes; i++)
        {
            System.out.print(current.getData() + " ");
            current = current.next;
        }
    }

    public int size()
    {
        return numNodes;
    }

    public MyLinkedList<E> clone()
    {
        MyLinkedList<E> newLinkedList = new MyLinkedList<>();
        newLinkedList.head = head;
        for (int i = 0; i < numNodes; i++)
        {
            newLinkedList.head.next = this.head.next;
            System.out.println(newLinkedList.head.getData());
            System.out.println(newLinkedList.head.next.getData());
            newLinkedList.numNodes++;
        }
        return newLinkedList;
    }

    public boolean contains(E item)
    {
        MyNode<E> current = this.head;
        for (int i = 0; i < numNodes; i++)
        {
            if (item == current.getData())
                return true;
            current = current.next;
        }
        return false;
    }

    public int indexOf(E item)
    {
        MyNode<E> current = this.head;
        for (int i = 0; i < numNodes; i++)
        {
            if (item == current.getData())
                return i;
            current = current.next;
        }
        return -1;
    }

    private class MyNode<E>
    {
        private MyNode<E> next;
        private E data;

        public MyNode(E data)
        {
            this.data = data;
        }

        public E getData()
        {
            return this.data;
        }
    }
}
