package collections;

import java.util.*;

public class Capital {
    public static void main(String[] args) {
        List<String> listCapital = Arrays.asList("Афины", "Белград", "Берлин", "Брюссель", "Будапешт", "Валлетта",
                "Варшава", "Ватикан", "Вена", "Вильнюс", "Копенгаген", "Лиссабон", "Лондон", "Белград", "Белград",
                "Будапешт", "Валлетта", "Ватикан");
        Set<String> uniqueCapital = new HashSet<>(listCapital);//unigue capitals
            System.out.println("Number unique capitals: " + uniqueCapital.size() + "\n" + "List unique capitals: " + uniqueCapital);

            Map<String, Integer> wordsCapital = new HashMap<>();
            for (String key : listCapital) wordsCapital.put(key, wordsCapital.getOrDefault(key, 0) + 1);
            for (Map.Entry<String, Integer> o : wordsCapital.entrySet()) {
                System.out.println(o.getKey() + ": " + o.getValue());
        }
//    listCapital.forEach(s -> System.out.println(s.toUpperCase()));
//             String town = listCapital.stream().filter(s -> s.equals("Агроба")).findFirst().orElseThrow(NoSuchElementException::new);
//        System.out.println(town);
    }
}
