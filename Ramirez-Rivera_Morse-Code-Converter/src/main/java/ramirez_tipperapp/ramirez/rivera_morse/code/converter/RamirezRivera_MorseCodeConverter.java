/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ramirez_tipperapp.ramirez.rivera_morse.code.converter;
import java.util.Scanner;
/**
 *
 * @author angelramirez-rivera
 */
public class RamirezRivera_MorseCodeConverter {

    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create an instance of the Morse class
        Morse morse = new Morse();

        // Convert the input string to Morse code using the Morse class
        String morseCode = morse.convertToMorse(input);

        // Display the Morse code
        System.out.println("Morse Code: " + morseCode);

        // Close the scanner
        scanner.close();
    }
}

class Morse {
    final int NUM_CHARS = 40;

    private String original;
    private String mcode;

    private char[] regular = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
        'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', ',', '.'
    };

    String[] morse = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
        "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
        "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "/"
    };

    public String convertToMorse(String input) {
        StringBuilder morseCode = new StringBuilder();

        for (char ch : input.toUpperCase().toCharArray()) {
            int index = indexOf(regular, ch);
            if (index != -1) {
                morseCode.append(morse[index]).append(" ");
            }
        }

        return morseCode.toString().trim();
    }

    public int indexOf(char[] array, char target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Character not found in the array
    }
}
