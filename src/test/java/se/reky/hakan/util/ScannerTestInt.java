package se.reky.hakan.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class ScannerTestInt {

    private Scanner scanner;

    @BeforeEach
    void setUp(){
        scanner = new Scanner(String.valueOf(1));
    }

    @Test
    void testScannerInt(){
        Assertions.assertEquals(1, scanner.nextInt());
    }
}
