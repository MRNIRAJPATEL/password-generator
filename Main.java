import java.util.Scanner;

/**
 * Project
 */
public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("How many random passwords do you want generated :");
    int total = in.nextInt();
    System.out.println("How many characters long do you want your random password to be? ");
    int length = in.nextInt();

    // array to contain passwords
    String[] randomPasswords = new String[total];

    // loop through the total number of passwords
    for (int i = 0; i < total; i++) {
      // generate one random password
      String randomPassword = "";
      for (int j = 0; j < length; j++) {
        // generate one random character
        randomPassword += randomCharacter();
      }
      // add the random password to the array
      randomPasswords[i] = randomPassword;
    }
    // print the array of passwords
    printPasswords(randomPasswords);
  }

  public static void printPasswords(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  // '0'-'9' => 48-57 in ASCII
  // 'A'-'Z' => 65-90 in ASCII
  // 'a'-'z' => 97-122 in ASCII
  public static char randomCharacter() {
    // 10 digits + 26 uppercase letters + 26 lowercase letters = 62 possible characters
    int rand = (int) (Math.random() * 62);

    if (rand <= 9) {
      // number: rand is between 0-9 => 48-57 in ASCII
      int ascii = rand + 48;
      return (char) (ascii);
    } else if (rand <= 35) {
      // uppercase letter: rand is between 10-35 => 65-90 in ASCII
      int ascii = rand + 55; // 65-10=55
      return (char) (ascii);
    } else {
      // lowercase letter: rand is between 36-61 => 97-122 in ASCII
      int ascii = rand + 61; // 97-36 = 61
      return (char) (ascii);
    }
  }
}
