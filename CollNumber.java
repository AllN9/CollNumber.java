import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CollNumber{
       // Метод, который добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    // Метод, который печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (Entry<String, ArrayList<Integer>> entry:
            map.entrySet()) {
            for(int el:
                entry.getValue()){
                    list.add(el);
            }
            Collections.sort(list, Comparator.reverseOrder());
            System.out.printf("%s: %s \n", entry.getKey(), list);
            count += 1;
            list.removeAll(list);
        }
        if (count == 0) {
            System.out.println("Справочник еще не сформирован!");
        }
    }
}
