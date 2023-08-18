package org.example;

import org.junit.jupiter.api.Test;

class MessagePrinterTest {

    private final MessagePrinter printer = new MessagePrinter();

    @Test
    void testOne() {
       printer.printMessage();
    }

     @Test
    void testTwo() {
       printer.printMessage("Test message");
    }
}
