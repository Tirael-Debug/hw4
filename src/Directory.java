import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory {
    
        public Map<String, List<String>> directory_hw=new HashMap<>();
        public List<String> phone_number_list;
        public void add(String Surname, String phone_number) {
            spravka();
            if (directory_hw.containsKey(Surname)) {
                phone_number_list=directory_hw.get(Surname);
                phone_number_list.add(phone_number);
                directory_hw.put(Surname,phone_number_list);
            }
            else {
                phone_number_list=new ArrayList<>();
                phone_number_list.add(phone_number);
                directory_hw.put(Surname,phone_number_list);
            }
        }
        public List<String> get(String Surname) {
            return directory_hw.get(Surname);
        }
        public static void spravka(){
            Directory directory=new Directory();
            directory.add("Petrov","123");
            directory.add("Ivanov","456");
            directory.add("Petrov","123");
            directory.add("Lala","789");
            System.out.println(directory.get("Petrov"));
        }
    }