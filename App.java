import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int table;

        System.out.println("Enter the table you want to generate: ");

        try (Scanner myScanner = new Scanner(System.in)) {
            table = myScanner.nextInt();
        } catch (Exception e) {
            table = 1;
        }

        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " X " + table + " = " + table * i);
        }

    }
}