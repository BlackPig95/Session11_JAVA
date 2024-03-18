package ra.example;

import java.util.Collection;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        MyArray<Integer> arrayInt = new MyArray<>();
        arrayInt.array = new Integer[]{1, 2, 3};
        MyArray<String> arrayStr = new MyArray<>();
        arrayStr.array = new String[]{"awf", "fawf"};
        Calculator.printf(arrayInt.array);
        Calculator.printf(arrayStr.array);
        sort(new Integer[]{2, 5, 62, 4});
        sort(new Person[]{new Person()});
    }

    public MyArray<?> genericWildcard()
    {
//        return new MyArray<>();
        return new MyArray<Integer>();
//        return new MyArray<String>();
    }

    public static <T extends Comparable<T>> void sort(T[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i].compareTo(array[j]) > 0)
                {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void printGeneric(MyArray<? super Person> arr)//=> Pass in MyArray<something>
    {

    }
}
