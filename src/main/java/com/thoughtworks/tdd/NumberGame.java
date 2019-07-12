package com.thoughtworks.tdd;

public class NumberGame {
    public static String number(int i){
        if(i % 3 == 0 && i % 5 == 0) return "FizzBuzz";
        if(i % 3 == 0 && i % 7 == 0) return "FizzWhizz";
        if(i % 5 == 0 && i % 7 == 0) return "BuzzWhizz";
        if(i % 3 == 0)return "Fizz";
        if(i % 5 == 0)return "Buzz";
        if(i % 7 == 0)return "Whizz";
        return i+"";
    }
}
