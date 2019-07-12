package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberGameTest {

    @Test
    public void should_return_number_when_call_number_given_NormalNumber_SuchAs_1(){
        assertEquals("1",NumberGame.number(1));
    }

    @Test
    public void should_return_Fizz_when_call_number_given_MultipleOfThree_SuchAs_3(){
        assertEquals("Fizz",NumberGame.number(6));
    }
}
