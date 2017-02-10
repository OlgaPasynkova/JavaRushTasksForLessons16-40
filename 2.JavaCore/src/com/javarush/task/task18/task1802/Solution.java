package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int min = inputStream.read();
        System.out.println(min);

        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read(); //прочитать очередной байт
            System.out.println(data);
            if (min>data) min=data; //добавить его к общей сумме
        }
        inputStream.close(); // закрываем поток

        System.out.println(min); //выводим min на экран.
    }
}
