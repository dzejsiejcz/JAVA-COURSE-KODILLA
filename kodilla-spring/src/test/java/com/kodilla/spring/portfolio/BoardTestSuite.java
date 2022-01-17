package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest
public class BoardTestSuite {

    @Autowired
    Board board;
    @Test
    void testTaskAdd(){
        //Given

        //When & Then
        assertNotNull(board.getDoneList());
        assertNotNull(board.getInProgressList());
        assertNotNull(board.getToDoList());
    }

}
