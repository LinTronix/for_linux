package com.company;

import jdk.nashorn.api.tree.NewTree;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class TempController extends JFrame
{
    private JPanel panel1;
    private JButton auto;
    private JButton maxLevelButton;
    private JButton exitButton;
    private JPanel rootPanel;
    private comExecutor executor = new comExecutor();

    public TempController()
    {
        add(rootPanel);
        setSize(400,500);
        auto.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                try
                {
                    executor.exec("xdg-open /home/paps/Documents/javatest");
                } catch (IOException e)
                {
                    e.printStackTrace();
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        maxLevelButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {

                try
                {
                    executor.exec("echo level 7 | sudo tee /proc/acpi/ibm/fan");
                } catch (IOException e)
                {

                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        exitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                System.exit(0);
            }
        });
    }


}
