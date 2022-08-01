import java.util.*;

public class Review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine(); // scan string
        int age = scanner.nextInt(); // scan number: beware of input mismatch exception
        scanner.nextLine(); // calling scanner.nextInt() will only read the numeric portion inside the scanner, we need to call nextLine method again to get rid of \n that is still inside the scanner
        String food = scanner.nextLine();
        System.out.println(name);
        System.out.println(age);
        System.out.println(food);
        Integer.parseInt("1");
        Integer a = 1;
        a.toString();
        String.valueOf(1);
        Integer.toString(1);
    }
}
