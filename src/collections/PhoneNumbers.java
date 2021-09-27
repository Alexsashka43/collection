package collections;

import java.util.*;


public class PhoneNumbers {
    public static void main(String args[]) {
        Map<String, List<String>> numberAndNames = new HashMap<String, List<String>>();

        add(numberAndNames);
        get(numberAndNames);

    }
    public static void add(Map<String, List<String>> numberAndNames){
        numberAndNames.put("Петров", Arrays.asList("89264574565"));
        numberAndNames.put("Васильев", Arrays.asList("89246557657", "89157387564"));
        numberAndNames.put("Иванов", Arrays.asList("89156789483", "89561546794", "89874567423"));
    }

    public static void get(Map<String, List<String>> numberAndNames){
        System.out.println(numberAndNames.get("Иванов"));
        System.out.println(numberAndNames.get("Васильев"));
    }
}


