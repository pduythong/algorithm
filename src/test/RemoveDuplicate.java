package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 0, 0);
        List<Integer> listWithoutDuplicates = new ArrayList<>(
                new HashSet<>(list));


        listWithoutDuplicates.forEach(System.out::println);

        System.out.println("----------------------------");

        list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("----------------------------");

    }

}
