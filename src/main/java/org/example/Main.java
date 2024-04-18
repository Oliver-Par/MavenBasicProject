package org.example;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static String sayHello(){
        return "Hello and welcome!";
    }

    public static String[] countdown(int x){
        String[] output = new String[x];
        int counter = 0;
        for (int i = x-1; i >= 0; i--) {


            output[counter] = "i = " + i;
            ++counter;
        }

        return output
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Main.countdown(10)));

        System.out.println(Main.sayHello());
    }
}
