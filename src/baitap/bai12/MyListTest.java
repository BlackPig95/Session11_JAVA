package baitap.bai12;

public class MyListTest
{
    public static void main(String[] args)
    {
        MyList<Integer> myList1 = new MyList<>();
        MyList<Integer> myList2 = new MyList<>(50);

        myList1.add(1);
        myList1.add(2);
        myList1.add(3);
        myList1.add(4);
        myList1.add(5);
        myList1.add(6);
        myList1.add(7);
        System.out.println("Ban đầu");
        for (int i = 0; i < myList1.size(); i++)
        {
            System.out.print(myList1.get(i) + " ");
        }
        System.out.println("-------------------------");
        System.out.println("Get: " + myList1.get(0));
        System.out.println("Remove: " + myList1.remove(2));
        System.out.println("Xóa");
        for (int i = 0; i < myList1.size(); i++)
        {
            System.out.print(myList1.get(i) + " ");
        }
        System.out.println("----------------------------");
        System.out.println("Size " + myList1.size());
        myList2 = myList1.clone();
        for (int i = 0; i < myList2.size(); i++)
        {
            System.out.print(myList2.get(i) + " ");
        }
        System.out.println("_____________________________");
        System.out.println(myList2.contains(0));
        System.out.println(myList2.contains(7));
        myList1.clear();
        System.out.println("Cleared");
        for (int i = 0; i < myList1.size(); i++)
        {
            System.out.print(myList1.get(i) + " ");
        }
    }
}
