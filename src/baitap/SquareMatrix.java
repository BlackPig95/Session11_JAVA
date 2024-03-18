package baitap;

import java.util.ArrayList;
import java.util.Random;

public class SquareMatrix
{
    public static void main(String[] args)
    {
        Random random = new Random();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        int size = random.nextInt(1, 11);
        for (int i = 0; i < size; i++)
        {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < size; j++)
            {
                matrix.get(i).add(random.nextInt(1, 101));
            }
        }
        for (ArrayList<Integer> rows : matrix)
        {
            for (Integer number : rows)
            {
                System.out.print(number + "  ");
            }
            System.out.println();
        }
    }
}
