import java.util.Scanner;

public class Fibo {
    public static void callFibo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int v = scanner.nextInt();
        System.out.println(fibo(v));
    }

    public static int fibo(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibo(n-1) + fibo(n-2);
    }
}
