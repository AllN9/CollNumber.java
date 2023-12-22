import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HWSeminar_6 {
    public static void main(String[] args) {

        System.out.println("Чтобы вывести список команд введите \"help\". ");

        try (Scanner scanner = new Scanner(System.in)) {
            boolean work = true;
            Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
            while (work) {
                System.out.println("Введите команду или имя пользователя, которого хотите записать: ");
                String comand = scanner.nextLine();

                switch (comand) {
                    case "help":
                        System.out.println("print - Выводит телефонный справочник на экран\nexit - Прекращение работы программы\n");
                        break;
                    case "print":
                        CollNumber.printBook(bookPhone);
                        break;
                    case "exit":
                        System.out.println("By-by");
                        work = false;
                        break;
                    default:
                        String key = comand;
                        System.out.println("Введите номер пользователя: ");
                        Scanner input = new Scanner(System.in);
                        input = new Scanner(System.in);
                        int value = input.nextInt();

                        CollNumber.addNumber(key, value, bookPhone);
                }
            }
        }
    }
}
