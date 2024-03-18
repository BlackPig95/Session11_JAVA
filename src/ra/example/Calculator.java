package ra.example;

import java.util.Arrays;

public class Calculator
{
    public static <T> void printf(T[] array)
    {
        System.out.println(Arrays.toString(array));
    }
}
