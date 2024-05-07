//package se.reky.hakan.util;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import se.reky.hakan.IOHandler;
//
//
//import java.util.Scanner;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@ExtendWith(MockitoExtension.class)
//class IOHandlerTestMockito {
//
//    @Mock
//    private Scanner scanner;
//    @InjectMocks
//    private IOHandler ioHandler;
//
//
//    @BeforeEach
//    void setUp() {
//        ioHandler = new IOHandler(scanner);
//    }
//
//
//
//    @Test
//    void promptForNewGame() {
//        Mockito.when(scanner.nextLine()).thenReturn("yes");
//       assertTrue(ioHandler.promptForNewGame());
//    }
//
//
//    @Test
//    void displayEndGameMessage() {
//    }
//
//    @Test
//    void output() {
//    }
//
//    @Test
//    void nextInt() {
//    }
//
//    @Test
//    void nextLine() {
//        assertEquals("yes", ioHandler.nextLine());
//    }
//
//    @Test
//    void hasNextInt() {
//        scanner = new Scanner(String.valueOf(1));
//
//        assertEquals(scanner, ioHandler.nextInt());
//    }
//}