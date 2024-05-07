import java.util.Arrays;
import java.util.Scanner;

public class LoginPage {
    public static void loginPage() {
        while (true) {
            System.out.println("Welcome to the game!");
            System.out.print("Type your login: ");
            Scanner login = new Scanner(System.in);
            String login1 = login.next();
            if (Arrays.asList(UsersList.loginList).contains(login1)) {
                System.out.print("OK, now enter your password: ");
                Scanner password = new Scanner(System.in);
                String password1 = login.next();
                if (password1==User.userPassword){


                }
            }
            else
                System.out.println("Login not found. Please try again!");
        }
    }
}
