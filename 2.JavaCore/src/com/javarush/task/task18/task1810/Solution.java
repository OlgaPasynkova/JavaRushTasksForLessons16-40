package com.javarush.task.task18.task1810;

/* 
DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки работы с файлами.
2.2 Выбросить исключение DownloadException.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream;
        String s = reader.readLine();

        while (!s.isEmpty()) {
            inputStream = new FileInputStream(s);

            if (inputStream.available() < 1000) {
                reader.close();
                inputStream.close();
                throw new DownloadException();

            }
            s = reader.readLine();
        }

    }

    public static class DownloadException extends Exception {

    }
}
