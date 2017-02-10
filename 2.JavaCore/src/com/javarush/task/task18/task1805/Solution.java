package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений — отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream inputStream = new FileInputStream(reader.readLine());

            List<Integer> byteList = new LinkedList<>();


            while (inputStream.available() > 0) {
                int currentByte = inputStream.read();
                if (!byteList.contains(currentByte)) byteList.add(currentByte);

            }
            byteList.sort(null);


            for (Integer i:byteList) {
                System.out.print(i + " ");
            }

            inputStream.close();

    }
}
