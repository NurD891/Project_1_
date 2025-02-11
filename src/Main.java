import java.security.SecureRandom;
import java.util.Scanner;

/**
 * PasswordGenerator class to generate secure passwords.
 * Allows users to specify length with a minimum of 6 characters.
 */
public class Main {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_+=<>?/";

    /**
     * Generates a random password of the given length.
     * @param length Desired length of the password (minimum 6).
     * @return Generated password as a string.
     */
    public static String generatePassword(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            password.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return password.toString();
    }

    /**
     * Main method to interact with the user and generate a password.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter desired password length:");
        int length = scanner.nextInt();
        length = Math.max(length, 6);

        System.out.println("Generated Password: " + generatePassword(length));
        scanner.close();
    }
}
