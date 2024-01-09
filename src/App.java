import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String validUsername = "Coded";
        String validPassword = "Coded123";

        int x = 0;
        while (x <= 3) {
            System.out.println("enter your name ");
            String usernameInput = scanner.nextLine();
            System.out.println("enter your password ");
            String passwordInput = scanner.nextLine();
            login(usernameInput, passwordInput);
            x++;
        }
        scanner.close();

    }

    public static void login(String usernameInput, String passwordInput) {
        try {
            String validUsername = "Coded";
            String validPassword = "Coded123";
            if (usernameInput.equals(validUsername) && passwordInput.equals(validPassword)) {
                System.out.println("welcom to coded");
            } else {
                throw new Exception("Invalid credentials");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
