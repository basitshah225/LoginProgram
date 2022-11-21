import java.util.Scanner;

public class LoginProgram {

    public static void main(String[] args) {
        //initialise variables
        String userName = "basitshah225";
        String password = "123";
        int maxNumOfAttempts = 5;
        int attemptCounter = 0;
        boolean validCredentials = false;

        //create new scanner to read user input
        Scanner input = new Scanner(System.in);
        //loop until correct credentials or attempt limit reached
        while (validCredentials == false && attemptCounter < maxNumOfAttempts ) {

            attemptCounter++;
            String inputUserName = ""; //reset user input to empty field after every attempt
            String inputPassword = "";
            //loop until user enters input for both fields per attempt
            while (inputUserName.isEmpty()) {
                System.out.print("Please enter your username: ");
                inputUserName = input.nextLine();
                if (inputUserName.isEmpty()) {
                    System.out.println("Field can not be blank");
                }
            }
            while (inputPassword.isEmpty()) {
                System.out.print("Please enter your password: ");
                inputPassword = input.nextLine();
                if (inputPassword.isEmpty()) {
                    System.out.println("Field can not be blank");
                }
            }
            //escape loop if correct values entered
            if (inputUserName.equals(userName) && inputPassword.equals(password)) {
                validCredentials = true;
                attemptCounter = 0; //reset to 0 in case correct credentials entered on last attempt.
            }
            else {
                System.out.println("Incorrect User Name or Password! " + (maxNumOfAttempts - attemptCounter) + " attempt(s) remaining");
            }
        }
        if (attemptCounter >= maxNumOfAttempts) {
            System.out.println("Sorry maximum number of login attempts reached!");
        }
        else {
            System.out.println("Congratulations, you have logged in!");
        }
    }
}
