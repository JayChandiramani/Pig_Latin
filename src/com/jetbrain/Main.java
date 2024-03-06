package com.jetbrain;

import javax.swing.*;

public class Main {

    public static void piglatin() {
        String word = JOptionPane.showInputDialog(null,"Enter a word ","Entered Word", JOptionPane.INFORMATION_MESSAGE);

        for (int i=0; i<word.length();i++){
            char ch = word.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'|| ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                String nw = word.substring(i) + word.substring(0,i) + "ay";
                System.out.println(nw);
                JOptionPane.showMessageDialog(null, word + " " + "in PigLatin is: " + nw, "Message Output", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        piglatin();
    }
}


