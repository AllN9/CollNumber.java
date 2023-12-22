import java.util.ArrayList;
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
        for (Entry<String, ArrayList<Integer>> entry:
            map.entrySet()) {
            String phones = "";
            for(int el:
                entry.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", entry.getKey(), phones.substring(0, phones.length() - 2));
            count += 1;
        }
        if (count == 0) {
            System.out.println("Справочник еще не сформирован!");
        }
    }
}
