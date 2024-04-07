package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSayHello() {
        assertEquals("Hello and welcome!", Main.sayHello());
    }

    @Test
    void testCountdown(){
        String[] vergleich = {"i = 4", "i = 3", "i = 2", "i = 1", "i = 0"};
        assertArrayEquals(vergleich, Main.countdown(5));
    }
}