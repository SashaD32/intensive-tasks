package com.walking.intensive.chapter1.task1;

public class Task1 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
        int age = 58;

        System.out.println("Вам " + age + " " + getAgeString(age%100));
    }

    static String getAgeString(int age) {



        if (age % 10 == 1 && age != 11)
            return "год";

        else if (age > 4 && age < 21 || age % 10 > 4 || age % 10 == 0)
            return "лет";

        else
            return "года";
    }
}