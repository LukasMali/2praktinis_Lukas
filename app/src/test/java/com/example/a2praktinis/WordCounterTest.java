package com.example.a2praktinis;

import com.example.a2praktinis.utils.Counter;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordCounterTest {

    // Tests for character counting functionality
    @Test
    public void testCharacterCount_emptyInput() {
        String input = "";
        int result = Counter.getCharsCount(input);
        assertEquals("Expected 0 characters for empty input.", 0, result);
    }

    @Test
    public void testCharacterCount_normalInput() {
        String input = "Hello World";
        int result = Counter.getCharsCount(input);
        assertEquals("Expected 11 characters for 'Hello World'.", 11, result);
    }

    @Test
    public void testCharacterCount_spacesOnly() {
        String input = "   ";
        int result = Counter.getCharsCount(input);
        assertEquals("Expected 3 characters for input with spaces only.", 3, result);
    }

    @Test
    public void testCharacterCount_tabsOnly() {
        String input = "\t\t\t";
        int result = Counter.getCharsCount(input);
        assertEquals("Expected 3 characters for input with tabs only.", 3, result);
    }

    @Test
    public void testCharacterCount_mixedInput() {
        String input = "   Hello   World   ";
        int result = Counter.getCharsCount(input);
        assertEquals("Expected 19 characters for '   Hello   World   '.", 19, result);
    }

    // Tests for word counting functionality
    @Test
    public void testWordCount_emptyInput() {
        String input = "";
        int result = Counter.getWordsCount(input);
        assertEquals("Expected 0 words for empty input.", 0, result);
    }

    @Test
    public void testWordCount_normalInput() {
        String input = "Hello World";
        int result = Counter.getWordsCount(input);
        assertEquals("Expected 2 words for 'Hello World'.", 2, result);
    }

    @Test
    public void testWordCount_spacesOnly() {
        String input = "   ";
        int result = Counter.getWordsCount(input);
        assertEquals("Expected 0 words for input with spaces only.", 0, result);
    }

    @Test
    public void testWordCount_tabsOnly() {
        String input = "\t\t\t";
        int result = Counter.getWordsCount(input);
        assertEquals("Expected 0 words for input with tabs only.", 0, result);
    }

    @Test
    public void testWordCount_mixedInput() {
        String input = "   Hello   World   ";
        int result = Counter.getWordsCount(input);
        assertEquals("Expected 2 words for '   Hello   World   '.", 2, result);
    }

    @Test
    public void testWordCount_tabsAndSpaces() {
        String input = "\tHello \t World\t";
        int result = Counter.getWordsCount(input);
        assertEquals("Expected 2 words for input with tabs and spaces.", 2, result);
    }
}
