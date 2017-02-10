package com.javarush.task.task18.task1807;

/*
Подсчет запятых
С консоли считать имя файла.
Посчитать в файле количество символов ‘,‘, количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ‘,‘.
*/

        import java.io.BufferedReader;
        import java.io.FileInputStream;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        char delimiter = ',';
        int count = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        while (inputStream.available() > 0) {
            if (inputStream.read() == (int) delimiter) count++;
        }

        System.out.println(count);

        reader.close();
        inputStream.close();
    }
}
