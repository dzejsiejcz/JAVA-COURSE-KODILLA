package com.kodilla.spring.calculator;


import org.springframework.stereotype.Component;

@Component
public class Display {


    void displayValue(double vall){
        System.out.println(vall);
    }

}
