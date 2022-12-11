package MyArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int five = 5000000;
        String text = "Замеряем время!";

        myTimeArray(text, five);
        myTimeLinked(text, five);

    }

    public static void myTimeArray(String text, int five) {
        long start = System.currentTimeMillis();

        ArrayList<String> myArray = new ArrayList<>();

        for (int i = 0; i < five; i++) {
            myArray.add(text);
            //System.out.println("myArray "+ i );
        }

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени для myArray, мс: " + elapsed);
    }

    public static void myTimeLinked(String text, int five) {

        long start = System.currentTimeMillis();

        LinkedList<String> myLinked = new LinkedList<>();

        for (int i = 0; i < five; i++) {
            myLinked.add(text);
            //System.out.println("myLinked "+ i );
        }

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени для myLinked, мс: " + elapsed);
    }
}
