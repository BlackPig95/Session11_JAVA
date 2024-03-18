package baitap.bai13;

public class TestMyLinkedList
{
    public static void main(String[] args)
    {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);

        myLinkedList.add(4, 9);
        myLinkedList.add(3, 8);
        myLinkedList.printList();
        System.out.println("---------------------------------");

        MyLinkedList<Integer> newLinkedList = myLinkedList.clone();
        System.out.println("New linked list");
        newLinkedList.printList();
        System.out.println("--------------------------");
        System.out.println(myLinkedList.contains(13));
        System.out.println(myLinkedList.contains(6));
        System.out.println(myLinkedList.contains(9));
        System.out.println(myLinkedList.contains(10));
        System.out.println(myLinkedList.indexOf(11));
    }
}

