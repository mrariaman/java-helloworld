import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Application Started");
        System.out.println("1) Print the default message.");
        System.out.println("2) Greet the user");

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        if (userChoice.equals("1")){
            System.out.println("Hello World !");
        } else if (userChoice.equals("2")) {
            System.out.println("Please enter your name:");
            String userName = scanner.nextLine();
            System.out.println("Hello " + userName);
        } else {
            System.out.println("Invalid data passed, try again !!!");
        }

        scanner.close();
    }
}
