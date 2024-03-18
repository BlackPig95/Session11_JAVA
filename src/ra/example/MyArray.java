package ra.example;

public class MyArray<T>//E
{
    T[] array;

    public void printArray(T[] arr)
    {
        for (T t : arr)
        {
            System.out.println(t);
        }
    }
}
