/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.streamprac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author harsh
 */
public class StreamPrac {

    public static void main(String[] args) {
//        List<String> city = Arrays.asList("Rajkot", "Morbi", "Keshod", "Ahmedabad","Halvad", "Kadi", "Visavadar", "Jamnagar");
//
//        city.stream().
//                filter(cname -> cname.startsWith(""))
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);

//        Arrays.asList("Rajkot","Gujarat")
//                .stream()
//                .findFirst()
//                .ifPresent(System.out::println);
//   
//            Stream.of("101","102","103","104")
//                    .mapToInt(Integer::parseInt)
//                    .min()
//                    .ifPresent(System.out::println);
//           IntStream.range(1, 10)
//                   .mapToObj(s->""+s)
//                   .forEach(System.out::println);
//           
        Stream.of("Rajkot", "Nadiad", "Morbi")
                .filter(s -> {
                    System.out.println("Filter on" + s);
                    return s.startsWith("R");
                })
                .map(s -> {
                            System.out.println("Map on" + s);
                            return s.toUpperCase();
                        })
                .forEach(s->System.out.println("forEach() on s"+s));
    }
}
