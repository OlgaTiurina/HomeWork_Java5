import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        HashMap<Integer, String> people = new HashMap<>();

        people.put(1, "Соколова Алевтина Сергеевна 45 ж");
        people.put(2, "Сорокин Николай Игоервич 19 м");
        people.put(3, "Смирнов Сергей Сергеевич 29 м");
        people.put(4, "Рожкова МАрия Андреевна 24 ж");
        people.put(5, "Кудрявцева Алла Семеновна 37 ж");

        if(!people.containsKey(6)) {
            people.put(6, "Самсонов Кирилл Викторович 38 м");
        }

        List<Map.Entry<Integer, String>> list = new ArrayList<>(people.entrySet());

        for (Map.Entry<Integer, String> parameter: list) {
            String[] parts = parameter.getValue().split(" ");
            String surname = parts[0];
            String name = parts[1].charAt(0)  + ".";
            String patronymic = parts[2].charAt(0) + ".";
            String age = parts[3];
            String gender = parts[4];
            System.out.println(surname + " " + patronymic + " " + age + " " + gender.toUpperCase());
        }

    }
}