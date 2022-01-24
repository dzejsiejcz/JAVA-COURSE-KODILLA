package com.kodilla.testing.loop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class testLoopAndConditionalBreakpoints {

    @Test
    void testLoop() {

        // given
        long sum = 0;

        //when
        for (int n=0; n<1000; n++) {
            sum +=n;
            System.out.println("[" + n + "] Sum equals: " + sum);
        }

        //then
        assertEquals(499500, sum);

    }
}
