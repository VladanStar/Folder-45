package joptionpanestring;

import javax.swing.JOptionPane;

public class JOptionPaneString {

    static void proveraPoDuzini() {
        String s1 = JOptionPane.showInputDialog(null, "Unesite prvi String s1: ");
        String s2 = JOptionPane.showInputDialog(null, "Unesite drugi String s2: ");
        if (s1.length() == s2.length()) {
            JOptionPane.showMessageDialog(null, "Stringovi s1 i s2 su iste duzine");
        } else if (s1.length() > s2.length()) {
            JOptionPane.showMessageDialog(null, "String s1 je duzi od String s2");
        } else {
            JOptionPane.showConfirmDialog(null, "String s2 je duzi od Stringa s1");
        }

    }

    static void postojiUStringu() {
        String s1 = JOptionPane.showInputDialog(null, "Unesite prvi String s1: ");
        String s2 = JOptionPane.showInputDialog(null, "Unesite drugi String s2: ");
        if (s1.startsWith(s2)) {
            JOptionPane.showMessageDialog(null, "String s1 pocinje   Stringom s2");

        } else if (s1.contains(s2)) {
            JOptionPane.showMessageDialog(null, "String s1 sadrzi String s2");
        } else {
            JOptionPane.showMessageDialog(null, "String s1 ne sadrzi String s2");

        }
    }

    static void konverzijaSlova() {
        String s1 = JOptionPane.showInputDialog(null, "Unesite prvi String s1: ");
        JOptionPane.showMessageDialog(null, "  Mala slova " + s1.toLowerCase());
        JOptionPane.showMessageDialog(null, "Velika slova " + s1.toUpperCase());

    }

    static void sort() {
        String s1 = JOptionPane.showInputDialog(null, "Unesite prvi String s1: ");
        String s2 = JOptionPane.showInputDialog(null, "Unesite drugi String s2: ");
        if (s1.compareToIgnoreCase(s2) > 0) {
            JOptionPane.showMessageDialog(null, "Sortirano " + s2 + " " + s1);
        } else if (s2.compareToIgnoreCase(s1) > 0) {
            JOptionPane.showMessageDialog(null, "Sortirano " + s1 + " " + s2);

        } else {
            JOptionPane.showMessageDialog(null, "Stringovi su indenticni " + s2 + " " + s1);
        }
    }

    public static void main(String[] args) {
        char ch;
        while (true) {
            ch = JOptionPane.showInputDialog(null, "Izaberite jednu od opcija: \n"
                    + "a - sortiraj stringove \n"
                    + "b - konverzija stringova \n"
                    + "c - postoji u Stringu \n"
                    + "d - provera po duzini \n"
                    + "f - kraj programa \n").charAt(0);
            switch (ch) {
                case 'a':
                    sort();
                    break;
                case 'b':
                    konverzijaSlova();
                    break;
                case 'c':
                    postojiUStringu();
                    break;
                case 'd':
                    proveraPoDuzini();
                    break;
                case 'f':
                    JOptionPane.showMessageDialog(null, "Kraj Programa!!!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Unesite neadekvatan znak");
                       continue;
            }
        }

    }

}
