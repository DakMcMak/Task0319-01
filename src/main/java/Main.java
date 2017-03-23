import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println( name1 + " получает " + number1 + " через " + number2 + " лет. ");
    }

}
