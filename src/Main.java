import java.util.*;

public class Main {
    private static final String SCH_1 = "School № 1";
    private static final String SCH_4 = "School № 4";
    private static final String SCH_13 = "School № 13";

    public static void main(String[] args) {

        //Создаем перечень участников в олимпиадах в свободном порядке:
        Participants learner1 = new Participants(SCH_4, "Дмитрий Соколов", "physics");
        Participants learner2 = new Participants(SCH_1, "Илья Калинин", "mathematics");
        Participants learner3 = new Participants(SCH_4, "Иван Матвеев", "physics");
        Participants learner4 = new Participants(SCH_13, "Анна Крутова", "physics");
        Participants learner5 = new Participants(SCH_13, "Владимир Соловьев", "informatics");
        Participants learner6 = new Participants(SCH_4, "Дмитрий Соколов", "mathematics");
        Participants learner7 = new Participants(SCH_4, "Дмитрий Соколов", "informatics");
        Participants learner8 = new Participants(SCH_1, "Илья Калинин", "informatics");
        Participants learner9 = new Participants(SCH_13, "Анна Крутова", "mathematics");
        Participants learner10 = new Participants(SCH_13, "Владимир Соловьев", "physics");

        List<Participants> listPart = new ArrayList<>();

        listPart.add(learner1);
        listPart.add(learner2);
        listPart.add(learner3);
        listPart.add(learner4);
        listPart.add(learner5);
        listPart.add(learner6);
        listPart.add(learner7);
        listPart.add(learner8);
        listPart.add(learner9);
        listPart.add(learner10);

        //Добавляем коллекцию в HashSet для того, чтобы выяснить, сколько у нас уникальных участников и из каких они школ:
        Set<Participants> hashSetPart = new HashSet<>(listPart);
        for (Participants part : hashSetPart) {
            System.out.println(part);
        }

        System.out.println("------");

        //Добавляем коллекцию в TreeSet, чтобы расположить имена участников в алфавитном порядке:
        Set<Participants> treeSetPart = new TreeSet<>(new PartComparatorName());
        treeSetPart.addAll(hashSetPart);
        for (Participants part : treeSetPart) {
            System.out.println(part.getName());
        }

        System.out.println("------");

        //Создаем HashMap, чтобы определить, в олимпиадах по каким предметам участвует каждый ученик:
        Map<Participants, List> mapPart = new HashMap<>();

        //Коллекции, по которым храним список предметов, в олимпиадах которых участвует каждый конкретный ученик:
        List<String> subjects = new ArrayList<>(); //Дмитрий Соколов
        List<String> subjects1 = new ArrayList<>(); //Илья Калинин
        List<String> subjects2 = new ArrayList<>(); //Иван Матвеев
        List<String> subjects3 = new ArrayList<>(); //Анна Крутова
        List<String> subjects4 = new ArrayList<>(); //Владимир Соловьев

        for (Participants part : listPart) {
            if (part.getName().equals("Дмитрий Соколов")) {
                subjects.add(part.getSubject());
                mapPart.put(part, subjects);
            } else if (part.getName().equals("Илья Калинин")) {
                subjects1.add(part.getSubject());
                mapPart.put(part, subjects1);
            } else if (part.getName().equals("Иван Матвеев")) {
                subjects2.add(part.getSubject());
                mapPart.put(part, subjects2);
            } else if (part.getName().equals("Анна Крутова")) {
                subjects3.add(part.getSubject());
                mapPart.put(part, subjects3);
            } else if (part.getName().equals("Владимир Соловьев")) {
                subjects4.add(part.getSubject());
                mapPart.put(part, subjects4);
            }
        }

        //выводим в консоль наш mapPart:
        for (Map.Entry<Participants, List> mapEntry : mapPart.entrySet()) {
            System.out.println(mapEntry.getKey() + " участвует в олимпиадах по: " + mapEntry.getValue());
        }
    }
}

