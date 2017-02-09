package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());
    }

    public static void main(String[] args)
    {
        for (Thread thread:threads){
            thread.start();
        }
    }
    public static class MyThread1 extends Thread{
        @Override
        public void run()
        {
            while (true){

            }
        }
    }
    public static class MyThread2 extends Thread{
        @Override
        public void run()
        {
            try{
                sleep(0);
            }
            catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }

    public static class MyThread3 extends Thread
    {
        @Override
        public void run()
        {
            try
            {
                while (true)
                {
                    System.out.println("Ура");
                    sleep(500);

                }
            }
            catch (InterruptedException e)
            {

            }
        }
    }
    public static class MyThread4 extends Thread implements Message{
        @Override
        public void run()
        {
            while(true){

            }
        }

        @Override
        public void showWarning()
        {
            this.stop();
        }
    }
    public static class MyThread5 extends Thread{

        @Override
        public void run()
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int summe = 0;
            String line;
            try
            {
                while (!(line = reader.readLine()).equals("N"))
                {
                    summe +=Integer.parseInt(line);
                }
                System.out.println(summe);
            }
            catch (IOException e){
            }

        }


    }
}