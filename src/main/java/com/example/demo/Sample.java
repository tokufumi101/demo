package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[]args){
        Integer[]num={1,2,3,4,5};

        List<Integer> l= Arrays.asList(num);

//        l.forEach(System.out::println);
        l.stream().filter(i->i<=3).forEach(
                System.out::println
        );
    }
}
