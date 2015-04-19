package com.kadet.memberGenerator;

import javax.swing.*;

/**
 * Created by AlexSoroka on 4/17/2015.
 */
public class Main {

    public static void main(String[] args) {
        try {
            AppBundle.initState();
            AppBundle.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
