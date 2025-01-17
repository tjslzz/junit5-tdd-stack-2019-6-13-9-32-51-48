package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberGameTest {

    @Test
    public void should_return_number_when_call_number_given_NormalNumber_SuchAs_1(){
        assertEquals("1",NumberGame.number(1));
    }

    @Test
    public void should_return_Fizz_when_call_number_given_MultipleOfThree_SuchAs_6(){
        assertEquals("Fizz",NumberGame.number(6));
    }

    @Test
    public void should_return_Buzz_when_call_number_given_MultipleOfFive_SuchAs_10(){
        assertEquals("Buzz",NumberGame.number(10));
    }

    @Test
    public void should_return_Whizz_when_call_number_given_MultipleOfSeven_SuchAs_14(){
        assertEquals("Whizz",NumberGame.number(14));
    }

    @Test
    public void should_return_FizzBuzz_when_call_number_given_MultipleOfThreeAndFive_SuchAs_15(){
        assertEquals("FizzBuzz",NumberGame.number(15));
    }

    @Test
    public void should_return_FizzWhizz_when_call_number_given_MultipleOfThreeAndSeven_SuchAs_21(){
        assertEquals("FizzWhizz",NumberGame.number(21));
    }

    @Test
    public void should_return_BuzzWhizz_when_call_number_given_MultipleOfFiveAndSeven_SuchAs_35(){
        assertEquals("BuzzWhizz",NumberGame.number(35));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_call_number_given_MultipleOfThreeAndFiveAndSeven_SuchAs_105(){
        assertEquals("FizzBuzzWhizz",NumberGame.number(105));
    }

    @Test
    public void should_return_Fizz_when_call_number_given_13(){
        assertEquals("Fizz",NumberGame.number(13));
    }

    @Test
    public void should_return_infos_when_call_number_given_List(){
        for(int i = 0 ; i <= 120;i ++){
            System.out.println(NumberGame.number(i));
        }
    }
}
