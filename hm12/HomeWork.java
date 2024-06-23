package org.example.lesson12.hm12;

import java.util.List;

public class HomeWork {
    //    Для элементов списка строк:
//выберите только элементы длиной меньше 7 символов
//преобразуйте их в верхний регистр
//добавьте к ним длину
//вызовите функцию которая преобразует строки в обратный порядок
//Пример: ["Dima", "Max", "Alexander"] -> ["4-AMID", "3-XAM"]
    public static void main(String[] args) {
        List<String> names = List.of("Dima", "Max", "Alexander");
        System.out.println(
                names.stream()
                        .filter(name -> name.length() < 7)
                        .map(name -> name.toUpperCase())
                        .map(name -> name + "-" + name.length())
                        .map(name -> new StringBuilder(name))
                        .map(builder -> builder.reverse())
                        .map(builder -> builder.toString())
                        .toList()

        );
    }
}
