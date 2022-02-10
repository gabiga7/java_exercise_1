import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        Scanner scanner = new Scanner(System.in);
        String s= scanner.next();
        if (s.contentEquals("quit"))
            System.exit(1);
        else
            System.out.println("Unknown command");
    }
}
