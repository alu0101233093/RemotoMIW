// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.printf("My name is Leonardo");
        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i es igual a " + i);
        }
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.println("sum = " + sum);
        }
        int mul = 1;
        for (int i = 1; i <= 20; i++) {
            mul *= i;
            System.out.println("mul = " + mul);
        }
        int fibonacci = 1;
        int sum = 1;
        int tmp = 0;
        for (int i = 1; i <= 15; i++) {
            // 1 1 2 3 5 8 13 21 ...
            tmp = sum; // tmp = 5
            sum = sum + fibonacci; // sum = 5 + 3 = 8
            fibonacci = tmp; // fibonacci = 5
            System.out.println("fibonacci = " + sum);
        }
    }
}