package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> phones = Arrays.asList("IPhone 12", "IPhone 11",
                "Samsung Galaxy S10", "OnePlus Nord",
                "Samsung galaxy S20", "Nokia 1100",
                "HP 41 devicesHTC 276 devices",
                "Huawei 377 devices",
                "i-mate 34 devices ",
                "i-mobile 37 devices ",
                "Icemobile 61 devices"
        );

        List<String> result = phones.stream()
//                .filter(phone -> phone.length() > 12 || phone.length() < 20)
//                .filter(phone -> phone.length() > 12 && phone.length() < 20)
//                .filter(phone->phone.startsWith("IPhone"))
//                .map(phone->phone.toUpperCase())
                

                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
