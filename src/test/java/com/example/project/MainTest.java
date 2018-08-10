package com.example.project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class MainTest {

    @Test
    void testDemo() {
        Main obj = new Main();
        assertEquals(8, obj.demo(2, 3), "2^3=8");
    }

}
