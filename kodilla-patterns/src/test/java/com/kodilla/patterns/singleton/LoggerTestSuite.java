package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void writeLog(){
        logger = Logger.INSTANCE;
        logger.log("Checked out new branch");
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String text = logger.getLastLog();
        //Then
        assertEquals("Checked out new branch", text);
    }
}
