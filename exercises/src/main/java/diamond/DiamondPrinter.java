package diamond;

import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {

        List<Character> alphabet = new ArrayList<>(); // lista z algabetem
        List<String> diamond = new ArrayList<>(); // finalna lista z poszczególnymi wierszami diamentu

        for (char c = 'A'; c <= 'Z'; c++) { // wypełnienie listy alphabet literami
            alphabet.add(c);
        }

        int numberOfLetters = 0;
        for (int i = 0; i < alphabet.size(); i++) { // ustalenie liczby porządkowej wybranej litery
            if (alphabet.get(i) == a) {
                numberOfLetters = i + 1; // 1 dodane dla łatwiejszego liczenia (teraz jest realna liczba porządkowa litery, liczona od 1).
            }
        }

        char[] oneLine = new char[numberOfLetters * 2 - 1]; // tabela dla każdego poszczególnego wiersza diamentu.

        int m = 1; // zmienna potrzebna do dolnej części diamentu

        for (int i = 0; i < numberOfLetters * 2 - 1; i++) {
            for (int n = 0; n < oneLine.length; n++) {
                oneLine[n] = ' ';
            }
            if (i < numberOfLetters) {
                oneLine[numberOfLetters - 1 - i] = alphabet.get(i);
                oneLine[numberOfLetters - 1 + i] = alphabet.get(i);
            } else {
                oneLine[m] = alphabet.get(numberOfLetters - 1 - m);
                oneLine[numberOfLetters * 2 - 2 - m] = alphabet.get(numberOfLetters - 1 - m);
                m = m + 1;
            }
            String oneLineString = new String(oneLine); // każdorazowa zamiana tabeli wiersza na Stringa
            diamond.add(oneLineString); // dodanie Stringa do listy diamond
            System.out.println(diamond.get(i)); // wyświetlenie wiersza w konsoli
        }
        return diamond; // zwrócenie całego diamentu
    }
}