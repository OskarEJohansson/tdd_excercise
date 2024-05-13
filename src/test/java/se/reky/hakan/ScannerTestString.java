package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ScannerTestString {

    Scanner scanner;

    @BeforeEach
    void setUp(){
        scanner = new Scanner("Yes");
    }

    @Test
    void testScannerString(){
        Assertions.assertEquals("Yes", scanner.nextLine());
    }



}
