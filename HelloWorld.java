import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("please input");

        Scanner scanner = new Scanner(System.in);
        String str = "hello world";
        if (scanner.hasNext()) {
            str = scanner.next();
        }
        scanner.close();
        System.out.println(str);
    }
}
