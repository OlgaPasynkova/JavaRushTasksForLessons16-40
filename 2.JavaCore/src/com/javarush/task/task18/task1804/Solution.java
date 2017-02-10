package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        Map<Integer, Integer> bytesCount = new HashMap<Integer, Integer>();


        while (inputStream.available() > 0) {
            int currentByte = inputStream.read();
            bytesCount.put(currentByte, (bytesCount.containsKey(currentByte) ? bytesCount.get(currentByte) + 1 : 1));
        }

        int minCount = -1;
        for (Map.Entry<Integer, Integer> pair : bytesCount.entrySet()) {
            if (minCount == -1) minCount = pair.getValue();
            else if (minCount > pair.getValue()) minCount = pair.getValue();
        }
        for (Map.Entry<Integer, Integer> pair : bytesCount.entrySet()) {
            if (minCount == pair.getValue()) System.out.print(pair.getKey() + " ");
        }

        inputStream.close();

    }
}
