import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = scanner.nextInt();
        logger.log("Создаем и наполняем список");
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }
        logger.log("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации:");
        System.out.println("Введите порог для фильтра:");
        int tresHold = scanner.nextInt();
        Filter filter = new Filter(tresHold);
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        logger.log("Завершаем программу");

    }
}