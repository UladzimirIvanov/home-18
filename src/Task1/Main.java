package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
        Stream'ов:
        - Удалить дубликаты
        - Оставить только четные элементы
        - Вывести сумму оставшихся элементов в стриме*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(31);
        list.add(23);
        list.add(20);
        list.add(30);
        list.add(44);
        list.add(12);
        System.out.println(list);

        int a = 0;
        List<Integer> result = list.stream()
                .distinct()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        for (int i = 0; i < result.size(); i++) {
            a = a + result.get(i);
        }
        System.out.println(result);
        System.out.println(a);
    }
}