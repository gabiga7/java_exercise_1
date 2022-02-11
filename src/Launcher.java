import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        while (1==1)
        {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            if (s.contentEquals("quit"))
                System.exit(1);
            else if (s.contentEquals("fibo"))
                Fibo.callFibo();
            else
                System.out.println("Unknown command");
        }
    }
}
