package baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListString
{
    public static void main(String[] args)
    {
        //bai 4 List có nhiều hơn 3 ký tự
        int maxLengh = 3;
        final String initialString = "Rikkei Academy de nong dan biet code";
        List<String> listString = new ArrayList<>();
        listString = Arrays.asList(initialString.split(" "));
        for (String str : listString)
        {
            if (str.length() > maxLengh)
                System.out.println(str);
        }
        //bai 5 chuỗi ngắn nhất
        final String shortestString = "sif soao fwifiwe fweifiwef ewigwiefiqw fiwefk few fieig fefe";
        List<String> shortestList = new ArrayList<>(Arrays.asList(shortestString.split(" ")));
        int minLength = shortestList.get(0).length();
        for (String s : shortestList)
        {//Duyệt để tìm độ dài nhỏ nhất
            if (s.length() < minLength)
            {
                minLength = s.length();
            }
        }
        for (String s : shortestList)
        {//In ra các phần tử có độ dài nhỏ nhất
            if (s.length() == minLength)
                System.out.println("Chuỗi ngắn nhất: " + s);
        }
    }
}
