package org.example;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(12);
        integers.add(4);
        integers.add(8);
        integers.add(90);
        integers.add(38);

        forEachPrint(integers);
        System.out.println("----------------------");
        forEachPrettyPrint(integers);
        System.out.println("------CONSUMER 1-----------");
        forEach(integers, (Integer num)-> System.out.println(num));
        System.out.println("------CONSUMER 2-----------");
        //forEach(integers, (num)-> System.out.println("Elemento: " + integers.get(num) ));

        System.out.println("fin");

        ArrayList<String> marcasAviones = new ArrayList<>();
        marcasAviones.add("Boeing");
        marcasAviones.add("Airbus");
        marcasAviones.add("Locked Martin");
        marcasAviones.add("Mirage");
        marcasAviones.add("Mcdonald Douglas");
        marcasAviones.stream().
                map(marca->marca.toUpperCase())
                .filter(marcaMayuscula->marcaMayuscula.startsWith("M"))
                .forEach(marcaFilter-> System.out.println(marcaFilter));

        List<String> marcasFilter = marcasAviones.stream()
                .filter(marca->marca.startsWith("M"))
                .collect(Collectors.toList());


    }
    public static void forEachPrint(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static void forEachPrettyPrint(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Elemento: " + i + " :" + list.get(i));
        }
    }

    public static void forEach(ArrayList<Integer> list, Consumer<Integer> action)
    {
        for (int i = 0; i < list.size(); i++) {
            action.accept(list.get(i));
        }
    }
}