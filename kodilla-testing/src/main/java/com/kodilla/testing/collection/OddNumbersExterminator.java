package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> output = new ArrayList<>();
        for (Integer item : numbers) {
            if (item % 2==0){
                output.add(item);
            }
        }
        return output;
    }
}
