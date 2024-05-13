package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



import java.util.Scanner;

public class IOHandlerTest {

    private IOHandler ioHandler;

    private IOHandler testHandler(String dataForScanner){

        Scanner scanner = new Scanner(dataForScanner);
        return new IOHandler(scanner);
    }

    @Test
    void testHasNextInt(){

        ioHandler = testHandler("1");
        Assertions.assertTrue(ioHandler.hasNextInt());
    }

    @Test
    void testHasNextLine(){
        ioHandler = testHandler(("yes"));
        Assertions.assertEquals("yes", ioHandler.nextLine() );
    }


}
