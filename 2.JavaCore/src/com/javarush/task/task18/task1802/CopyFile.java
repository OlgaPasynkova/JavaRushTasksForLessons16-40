package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Olga Pasynkova on 09.02.2017.
 */
public class CopyFile {
    public static void main(String[] args) throws Exception
    {
        //Создаем поток-чтения-байт-из-файла
        FileInputStream inputStream = new FileInputStream("d:/downloads/test.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("d:/downloads/test2.txt");

        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
            int data = inputStream.read(); // прочитать очередной байт в переменную data
            System.out.println((char)data);
            outputStream.write(data); // и записать его во второй поток
        }

        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        outputStream.close();
    }
}
