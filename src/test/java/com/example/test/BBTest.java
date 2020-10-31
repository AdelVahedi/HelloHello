package com.example.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BBTest {

    @Test
    void calc() {
        BB b = new BB();
        assertEquals( "t2t",b.calc());
    }

}