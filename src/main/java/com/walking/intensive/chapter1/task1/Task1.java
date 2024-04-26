package com.walking.intensive.chapter1.task1;

public class Task1 {
    public static void main(String[] args) {

        int age = 5;

        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {

        if (age < 0 || age > 127) {
            return "Некорректно введен возраст";
        }
        int age2 = age % 100;
        if (age2 % 10 == 1 && age2 != 11) {
            return "Вам " + age + " год";
        }
        if (age2 > 4 && age2 < 21 || age2 % 10 > 4 || age2 % 10 == 0) {
            return "Вам " + age + " лет";
        }
        return "Вам " + age + " года";
    }
}