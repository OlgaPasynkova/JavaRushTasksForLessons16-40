package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
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

        int maxCount = 0;
        for (Map.Entry<Integer, Integer> pair : bytesCount.entrySet()) {
            if (maxCount < pair.getValue()) maxCount = pair.getValue();
        }
        for (Map.Entry<Integer, Integer> pair : bytesCount.entrySet()) {
            if (maxCount == pair.getValue()) System.out.print(pair.getKey() + " ");
        }

        inputStream.close();
    }
}
