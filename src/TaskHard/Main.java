package TaskHard;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
        этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
        Среди отобранных значений отобрать только те, которые имеют нечетное количество
        букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.*/

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Vova");
        map.put(2, "Vlad");
        map.put(3, "Dimon");
        map.put(4, "Antoha");
        map.put(5, "Igor");
        map.put(6, "Sanya");
        map.put(7, "Alehandro");
        map.put(8, "Sergey");
        map.put(9, "Tanya");
        map.put(10, "Victoria");
        map.put(11, "Antonina");
        map.put(12, "Zinaida");
        map.put(13, "Vadim");
        map.put(14, "Petr");
        map.put(15, "Gleb");
        System.out.println(map);

        List<Integer> resultID = map.keySet().stream()
                .filter(a -> a == 1 || a == 2 || a == 5 || a == 8 || a == 9 || a == 13)
                .collect(Collectors.toList());
        System.out.println(resultID);

        int a = 0;
        HashMap<Integer, String> mapWithNewID = new HashMap<>();
        for (int i = 0; i < resultID.size(); i++) {
            a = resultID.get(i);
            mapWithNewID.put(a, map.get(a));
            //TODO: Нужно как-то значение старой мапы по его айдишникам впихнуть в значения новой мапы. Где-то в уроке по мапам было что-то подобное, чекни
        }
        System.out.println(mapWithNewID);

        List<String> resultValue = mapWithNewID.values().stream()
                .filter(b -> b.length() % 2 == 1)
                .collect(Collectors.toList());
        System.out.println(resultValue);

        for (int i = 0; i < resultValue.size(); i++) {
            StringBuilder reversed = new StringBuilder(resultValue.get(i)).reverse();
            resultValue.set(i, String.valueOf(reversed));
        }
        System.out.println();
        System.out.println(resultValue);
    }
}
