package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException
    {

//        TempController tempController = new TempController();
//        tempController.setVisible(true);

        comExecutor executor= new comExecutor();
        executor.exec("echo level auto | sudo tee /proc/acpi/ibm/fan");
	// write your code here
    }
}
