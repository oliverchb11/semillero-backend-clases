import java.util.Scanner;

public class Initial {
    public void inicial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");
        Integer age = 50;
        Integer number = 60;
        String[] letters = { "a", "j" };
        System.out.println("Ingresa tu nombre");
        String name = sc.nextLine();
        System.out.println(age + number);
        System.out.println(letters.length);
        for (int i = 0; i <= letters.length; i++) {
            System.out.println(letters[i]);
        }
    }
}
