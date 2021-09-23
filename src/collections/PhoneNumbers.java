package collections;

import java.util.*;


public class PhoneNumbers {
    public static void main(String args[]) {
        HashMap<String, String> numberAndNames = new HashMap<>();
        add(numberAndNames);
        get(numberAndNames);
    }
    public static void add(HashMap<String, String> numberAndNames){
        numberAndNames.put("89156789483", "Иванов");
        numberAndNames.put("89264574565", "Петров");
        numberAndNames.put("89246557657", "Сидоров");
        numberAndNames.put("89561546794", "Иванов");
        numberAndNames.put("89874567423", "Иванов");
        for (Map.Entry<String, String> o : numberAndNames.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
    }
    public static void get(HashMap<String, String> numberAndNames){
        List<String> numbers = new ArrayList<>(List.of());
        for (String key : numberAndNames.keySet()) {
            if (Objects.equals(numberAndNames.get(key), "Иванов")){
                numbers.add(key);
            }
        }
        System.out.println(numbers);
    }
}


