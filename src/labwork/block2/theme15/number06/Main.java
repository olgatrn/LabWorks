package labwork.block2.theme15.number06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWord("cat", "кот");
        myTranslator.addNewWord("mouse", "мышь");
        myTranslator.addNewWord("caught", "поймал");
        System.out.println("Enter the line in English:");
        String lineFromeConsole = new Scanner(System.in).nextLine();
        String[] arrayOfWords = lineFromeConsole.split(" ");
        for (String word : arrayOfWords) {
            System.out.print(myTranslator.translate(word.toLowerCase()) + " ");
        }
    }
}
