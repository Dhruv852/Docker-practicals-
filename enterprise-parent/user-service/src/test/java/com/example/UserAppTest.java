package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserAppTest {

    @Test
    public void testStatus() {
        assertEquals(
                "USER_READY",
                UserApp.getUserStatus()
        );
    }
}