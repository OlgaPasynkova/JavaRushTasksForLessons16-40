package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(620));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String s = String.valueOf(number);
        int result=0;
        for (int i=0;i<3;i++){
            result += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return result;
    }
}