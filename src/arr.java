import java.util.*;

public class arr {
    public static void main(String[] args) {

        Map<String, Integer> hm = new HashMap<>();
        String[] words = {"Котик", "Собачка", "Юла", "Быль", "Котолампа", "Рыба", "Котик", "Песок", "Земля",
                "Вода", "Сказка", "Песок", "Быль", "Пыль", "Юла", "Краб", "Трава", "Акула", "Рыба"};
        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }
}



