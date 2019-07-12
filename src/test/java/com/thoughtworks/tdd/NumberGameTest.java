package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberGameTest {

    @Test
    public void should_return_number_when_call_number_given_NormalNumberSuchAs_1(){
        assertEquals("1",NumberGame.number(1));
    }
}
