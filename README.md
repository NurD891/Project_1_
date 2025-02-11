#Project Report: Password Generator

##1. Introduction This project aims to develop a simple yet effective Java-based password generator that allows users to create secure passwords based on their preferences. The application generates random passwords using a combination of uppercase letters, lowercase letters, numbers, and special characters.

##2. Design Choices:
*The program utilizes the SecureRandom class to ensure strong randomness in password generation.
*Users can specify the desired length of the password, with a minimum constraint of 6 characters.
*A predefined set of characters (letters, numbers, and symbols) is used to create passwords.
*The program operates through a command-line interface (CLI) for simplicity and ease of use.

##3. Implementation Details:
*The password generation logic is encapsulated in the generatePassword method.
*The main method handles user input and ensures a minimum password length.
*Input validation is performed to prevent invalid or weak password requests.
*JavaDoc-style comments are included to improve code readability and maintainability.

##4. Example Output:
Enter desired password length:
8
Generated Password: aB3$kLm9



