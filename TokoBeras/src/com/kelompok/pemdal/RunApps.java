package com.kelompok.pemdal;

import javax.swing.*;

public class RunApps {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setContentPane(new DataBeras().getRoot());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(500,300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
