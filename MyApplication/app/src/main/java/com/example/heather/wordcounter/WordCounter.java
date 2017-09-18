package com.example.heather.wordcounter;

/**
 * Created by heather on 18/09/2017.
 */

public class WordCounter {
    public static int countWords( String string ) {
        return string.split(" ").length;
    }
}
