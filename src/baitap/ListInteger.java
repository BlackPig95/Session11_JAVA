package baitap;

import java.util.*;

public class ListInteger
{
    private static int maxSize = 10;

    public static void main(String[] args)
    {
        //bai 1 In ra số lớn nhất trong List
        List<Integer> listInteger = new ArrayList<>(maxSize);
        Random random = new Random();
        for (int i = 0; i < maxSize; i++)
        {
            listInteger.add(random.nextInt(100));
        }
        System.out.println("List ban đầu: " + listInteger);
//        Iterator<Integer> iterator = listInteger.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }
        System.out.println("Phần tử lớn nhất: " + Collections.max(listInteger));
        //bai 2 Đảo ngược List
        List<Integer> reversedListInteger = new ArrayList<>(maxSize);
        for (int i = listInteger.size() - 1; i >= 0; i--)
        {
            reversedListInteger.add(listInteger.get(i));
        }
        System.out.println("List đảo ngược: " + reversedListInteger);
        //bai 3 Sắp xếp giảm dần
//        Collections.sort(listInteger, Collections.reverseOrder());
//        System.out.println("List giảm dần: " + listInteger);

//        Collections.sort(listInteger);
//        Collections.reverse(listInteger);
        listInteger.sort(Collections.reverseOrder());
        System.out.println("List giảm dần: " + listInteger);
        //Bai 6 Sắp xếp tăng dần bằng thuật toán
        for (int i = 0; i < listInteger.size() - 1; i++)
        {
            for (int j = 0; j < listInteger.size() - 1 - i; j++)
            {
                if (listInteger.get(j) > listInteger.get(j + 1))
                {
                    int temp = listInteger.get(j);
                    listInteger.set(j, listInteger.get(j + 1));
                    listInteger.set(j + 1, temp);
                }
            }
        }
        System.out.println("Sắp xếp tăng dần: " + listInteger);

        //Bài 7 Xóa số chẵn
        List<Integer> noEvenList = new ArrayList<>();
        for (Integer i : listInteger)
        {
            if (i % 2 == 0)
                continue;
            noEvenList.add(i);
        }
        System.out.println("List không có số chẵn: " + noEvenList);
        //Bài 8 Copy list bằng add all
        List<Integer> copiedList = new ArrayList<>();
        copiedList.addAll(listInteger);
//        Collections.addAll(copiedList, listInteger);//Phải là array ở argument thứ 2
//        List<Integer> copiedList = new ArrayList<>(listInteger);
        System.out.println("Copied list: " + copiedList);
        //Bài 9 Xóa phần tử trùng lặp
        List<Integer> dupedList = new ArrayList<>()
        {
            {
                add(3);
                add(3);
                add(2);
                add(2);
                add(6);
                add(6);
            }
        };
        System.out.println("List trùng: " + dupedList);

//        Set<Integer> tempSet = new LinkedHashSet<>();//Dùng set nhưng không cần list mới
//        dupedList.removeIf((item) -> !tempSet.add(item));
//        System.out.println("List không trùng: " + dupedList);

        //        Set<Integer> tempSet = new LinkedHashSet<>(dupedList);// Dùng set
//        List<Integer> dedupedList = new ArrayList<>(tempSet);

        List<Integer> dedupedList = new ArrayList<>();//Dùng list mới
        ArrayList<Integer> test = new ArrayList<>();
        test.clone();
        for (Integer item : dupedList) //Dùng contains
        {
            if (!dedupedList.contains(item))
            {
                dedupedList.add(item);
            }
        }
        System.out.println("List không trùng: " + dedupedList);

        //Bài 10 Tính tổng trong list
        int sum = 0;
        for (Integer item : listInteger)
        {
            sum += item;
        }
        System.out.println("Tổng các số: " + sum);
        //Bài 11 Tìm số nhỏ nhất
        System.out.println("Số nhỏ nhất: " + Collections.min(listInteger));
    }
}
