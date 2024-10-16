package com.bptn.course._18_java_threads._coding_39;

import java.util.Arrays;
import java.util.List;

public class MyThread extends Thread {

    // Declare the printer instance variable
    private SynchronizedPrinter printer;

    // Create a constructor to initialize the above instance variable
    public MyThread(SynchronizedPrinter printer) {
        this.printer = printer;
    }

    // Override the run() method to call the printNumbers() methods.
    @Override
    public void run() {
        this.printer.printNumbers();
    }
}
