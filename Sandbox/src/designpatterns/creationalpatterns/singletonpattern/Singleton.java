package designpatterns.creationalpatterns.singletonpattern;

import java.util.Arrays;
import java.util.Collections;
import  java.util.LinkedList;

public class Singleton {
    private static Singleton firstInstance = null;

    // Holds all my scrabble letters in an array
    String[] scrabbleLetters = {
            "a", "a", "a", "a", "a", "a", "a", "a", "a",
            "b", "b", "c", "c", "d", "d", "d", "e", "e", "e",
            "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f",
            "g", "g", "g", "h", "h", "i", "i", "i","i","i","i","i",
            "k", "l", "l","l","l","l","l","l", "m", "m", "n", "n",
            "n","n","n", "o","o","o","o","o","o","o","o", "p","p", "q",
            "r","r","r","r","r","r","r", "s", "s","s","s","s","s","s","s",
            "t", "t","t","t","t","t","t","t", "u","u","u","u","u", "v","v","v",
            "w","w","w","w", "x", "y","y","y","y", "z"
    };

    private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;

    // We won't allow creation of more objects of this class as it is a singleton.
    private Singleton() {}

    // we will synchronized to allow threads to wait until they are done getting the instance, to prevent them create different instances.
    // but we dont use synchronized because it slows down everything dramatically.
    public static Singleton getInstance() {
        if (firstInstance == null) {

            if (firstThread) {
                firstThread = false;

                Thread.currentThread();
                try {
                    Thread.sleep(1000); // First Thread Sleeping
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
            }

            // We will use Synchronized method to prevent thread creating different instances of the singleton
            synchronized (Singleton.class) {
                if (firstInstance == null) {
                    firstInstance = new Singleton();

                    Collections.shuffle(firstInstance.letterList);
                }
            }
        }

        return  firstInstance;
    }


    public LinkedList<String> getLetterList() {
        return firstInstance.letterList;
    }

    public LinkedList<String> getTiles(int howManyTiles) {
        LinkedList<String> tilesToSend = new LinkedList<>();

        for (int i = 0; i <= howManyTiles; i++) {
            tilesToSend.add(firstInstance.letterList.remove(0));
        }

        return tilesToSend;
    }
}
