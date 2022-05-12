package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";

        // When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        ResultSet rs = statement.executeQuery(sqlCheckTable);

        // Then
        int howMany = -1;
        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0, howMany);
        rs.close();
        statement.close();
    }

    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdateStart = "UPDATE BOOKS SET BESTSELLER=0";
        Statement statement = dbManager.getConnection().createStatement();
        statement.execute(sqlUpdateStart);

        //When
        String sqlProcedureCall = "CALL UpdateBestsellers()";
        String sqlCheckTable = "SELECT BESTSELLER AS IS_A_BESTSELLER FROM BOOKS WHERE BOOK_ID=5";
        statement.execute(sqlProcedureCall);
        ResultSet resultSet = statement.executeQuery(sqlCheckTable);

        //Then
        boolean is_best = false;
        if (resultSet.next()) {
            is_best = resultSet.getBoolean("IS_A_BESTSELLER");
        }
        assertTrue(is_best);
        resultSet.close();
        statement.close();
    }
}