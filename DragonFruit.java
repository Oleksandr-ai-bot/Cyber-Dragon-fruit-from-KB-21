import java.util.Scanner;

public class DragonFruit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dragonFruit = "Драгон фрукт 🐉" ;

        System.out.print("Введіть ціле число: ");
        int intValue = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Введіть строку: ");
        String stringValue = scanner.next();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("1. Вивід за допомогою println:");
        System.out.println("Ціле число: " + intValue + ", Число з плаваючою точкою: " + doubleValue + ", Строка: " + stringValue + ", Логічне значення: " + booleanValue);
        System.out.println("\n2. Вивід за допомогою MessageFormat:");
        System.out.println(java.text.MessageFormat.format("Ціле число: {0}, Число з плаваючою точкою: {1}, Строка: {2}, Логічне значення: {3}", intValue, doubleValue, stringValue, booleanValue));
        System.out.println("\n3. Вивід за допомогою System.out.format:");
        System.out.format("Ціле число: %d, Число з плаваючою точкою: %.2f, Строка: %s, Логічне значення: %b%n", intValue, doubleValue, stringValue, booleanValue);
        System.out.println("\n4. Виведення цілого числа у десятковій системі: " + intValue);
        System.out.format("\n5. Виведення цілого числа у шістнадцятковій системі: %x%n", intValue);
        System.out.format("\n6. Виведення цілого числа у вісімковій системі: %o%n", intValue);
        System.out.format("\n7. Виведення числа з плаваючою точкою у науковому форматі: %e%n", doubleValue);
        System.out.format("\n8. Виведення числа з плаваючою точкою з 3-ма знаками після коми: %.3f%n", doubleValue);
        System.out.println("\n9. Логічне значення:" + booleanValue);
        System.out.format("\n10.Виведення перших 7 символів строки: %.7s%n", stringValue);
        System.out.println("\n11. доповнення:" + dragonFruit);
    }
}
