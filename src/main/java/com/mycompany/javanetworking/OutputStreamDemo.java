package com.mycompany.javanetworking;
public class OutputStreamDemo {
    public static void generateCharacters(){
        int firstPrintableCharacter = 33;
        int numberOfPrintableCharacters = 94;
        int numberOfCharactersPerLine = 72;
        int start = firstPrintableCharacter;
        while (true) { /* infinite loop */
            for (int i = start; i < start + numberOfCharactersPerLine; i++) {
                System.out.write((
                (i - firstPrintableCharacter) % numberOfPrintableCharacters)
                + firstPrintableCharacter);}
            System.out.write('\r'); // carriage return
            System.out.write('\n'); // linefeed
            start = ((start + 1) - firstPrintableCharacter)% numberOfPrintableCharacters + firstPrintableCharacter;
            break;}}
    public static void main(String[] args) {
        OutputStreamDemo.generateCharacters();}}
