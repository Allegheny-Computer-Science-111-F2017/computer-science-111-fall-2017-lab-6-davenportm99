package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * This program is called to ManipulateDna.
 *
 */
public class ManipulateDna {
  /** This program is going to Manipulate Dna.
   *
   *
   */

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Marcus Davenport " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    String complementDna = dna.toUpperCase();
    System.out.println(" Okay I am going to manipulate the DNA string \"" + dna + "\"");
    // Step Two: Compute the complement of the DNA String
    complementDna = complementDna.replace('A' , 't' ); 
    complementDna = complementDna.replace('T' , 'a' );
    complementDna = complementDna.replace('C' , 'g' );
    complementDna = complementDna.replace('G' , 'c' );
    System.out.println("Complement of " + dna.toUpperCase() + " is " + complementDna.toUpperCase());
    dna = dna.toUpperCase();
    
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    String allowed = ("ACTG ");
    Random ran = new Random();
    int randomNum = ran.nextInt(4);
    int randomNum2 = ran.nextInt(3);
    char randomletter = allowed.charAt(randomNum);
    char randomletter2 = allowed.charAt(randomNum2);
    System.out.println("Inserting " + randomletter 
        + " at position 0 gives " + randomletter + dna.toUpperCase());
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    String first = dna.substring(0 , randomNum);
    String second = dna.substring(randomNum + 1, dna.length());
    System.out.println("Deleting from position " + randomNum + " gives " + first + second);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    String three = dna.substring(0 , randomNum);
    String four = dna.substring(randomNum + 1, dna.length());
    System.out.println("Changing position " + (randomNum + 1) + " gives " + first +  randomletter2
        + second);
    // Step Six: Display a final thankyou message
    System.out.println("Thanks for using the ManipulateDna program. Have an awesome day. " );
  }

}
