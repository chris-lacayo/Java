import java.util.ArrayList;
import java.util.Scanner;

public class wordScramble {

    public static void main(String[] args) {

        ArrayList<Integer> usedElements = (new ArrayList<Integer>());
        ArrayList<String> encryptedWords = (new ArrayList<String>());
        String[] allWords;

        Scanner input = ( new Scanner( System.in) );
        String word = ("");
        String encryptedWord = ("");
        int randNum = ( 0 );

        System.out.println("Enter words to scramble: ");
        word = input.nextLine();

        allWords = word.split(" ");

        for (int i = ( 0 ); i < allWords.length; ++i) {

            usedElements.clear();
            encryptedWord = ("");

            for (int x = (0); x < allWords[i].length(); ++x) {

                randNum = (int) Math.floor(Math.random() * allWords[i].length());

                while (usedElements.contains(randNum)) {
                    randNum = (int) Math.floor(Math.random() * allWords[i].length());
                }

                encryptedWord += allWords[i].charAt(randNum);
                usedElements.add(randNum);
            }


            encryptedWords.add(encryptedWord);
        }

        encryptedWord = ( "" );

            for ( int i = ( 0 ); i < ( encryptedWords.size( ) ); ++i) {

                encryptedWord += encryptedWords.get( i );
                encryptedWord += " ";
            }
                System.out.println( "Encrypted Sentence: " + encryptedWord );



    }

}