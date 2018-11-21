package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class comExecutor
{
    public void exec(String comStr) throws IOException, InterruptedException
    {


        String[] cmd = {"/bin/bash","-c","echo password| sudo -S ls"};
        Process proc = Runtime.getRuntime().exec(comStr);


        BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

        String line = "";
        while((line = reader.readLine()) != null)
        {
            System.out.print(line + "\n");
        }

        proc.waitFor();
    }
}
