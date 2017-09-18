package com.example.heather.wordcounter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by heather on 18/09/2017.
 */
public class WordCounterTest {

    @Test
    public void canCountWords() {
        assertEquals( 4, WordCounter.countWords("I can count words") );
    }
}

