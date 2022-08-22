package com.company;

public class Main {

    public static void main(String[] args) {
        // String
        String s = "Helllo worlllld";
        System.out.println(s.charAt(1)); // получение символла по его индексу
        // получение массива char из строки
        for (char c : s.toCharArray()) {
            System.out.print(c);
        }
        // длинна строки length
        System.out.println(s.length());
        // строки java все иммутабельны
        s.toLowerCase(); // приводит строку к нмжнему регистру
        String s2 = s.toLowerCase();
        System.out.println(s2);
        System.out.println(s);
        System.out.println(s.toUpperCase()); // приводит строку к вкрхнему ркгистру

        // определение подстроки
        System.out.println(s.substring(3));
        System.out.println(s.substring(0, 3));

        // замена одной подстроки на другую
        System.out.println(s.replace("ll", "L"));
        System.out.println(s.replace('l', 'L'));
        System.out.println(s.replaceAll("o", "0"));

        // разделение строки по указанным раделителям
        s = "I am Senior";
        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // форматирование строк
        String name = "Vasya";
        int age = 79;
        // TODO: флаги форматирования
        // %s - подстановка строки
        // %d - подстановка целого числа
        // %f - подстановка вещественного числа
        // %с - подстановак одного символа
        // %1$s - переиспользование строки, целого числа, вещественного числа, символа
        // %% - символ %
        // \\ - символ \
        String msg = String.format("My name is %s. I'm %d years old, %1$s is good boy", name, age);
        System.out.println(msg);
        System.out.printf("Age: %d\n", 120);
        System.out.printf("%2.2s 12\n", "hello");
        System.out.printf("%09d\n", 123);
        System.out.printf("%10.2f\n", 3.1485);

        // TODO: таблица умножения
        System.out.println();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d x %d = %2d  ", j, i, i * j);
            }
            System.out.println();
        }

        // TODO: символы управления кареткой
        // \n переход на новую строку
        // \t табуляция
        // \b backspace одного символа
        System.out.print("hello\nJava\t!Seniori\b\n");

        // StringBuilder, StringBuffer
        StringBuilder b = new StringBuilder(2343);
        b.append("jbdhhj");
        b.append("djsndf");
        System.out.println(b);
        // StringBuffer потокобезопасный
        // StringBuilder не потокобезопасный
        // в остальном все идентичные классы
    }
}