package org.dci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testReverseVowels() {
        assertEquals("buiutafel", Main.reverseVowels("beautiful"));
        assertEquals("dunasoir", Main.reverseVowels("dinosaur"));
        assertEquals("odicatuen", Main.reverseVowels("education"));
    }

}