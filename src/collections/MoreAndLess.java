package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoreAndLess {

    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int [] numbers = new int[] {1, 7, 32, 452, 324, 3, 43, 121, 5443, 335, 9999, 454, -2, -324, -9999, -343};
        Arrays.sort(numbers);
        System.out.println("Least: " + numbers[0] + "\n" + "More: " + numbers[numbers.length - 1]);//first way
        List<Integer> listNumbers = Arrays.asList(1, 7, 32, 452, 324, 3, 43, 121, 5443, 335, 9999, 454, -2, -324, -9999, -343);
        System.out.println("Least: " + Collections.max(listNumbers) + "\n" + "More: " + Collections.min(listNumbers));//second way
        for (Integer i: listNumbers) {
            if(i < min) min = i; if(i > max) max = i; //Можно ли писать это одной строчкой?
        }
        System.out.println("Least: " + min + "\n" + "More: " + max);//third way


    }
}
