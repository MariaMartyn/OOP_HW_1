package org.OOP_HW_1;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Human h1 = new Human(1, "Николай Васильевич", "муж");
        Human h2 = new Human(2, "Анна Петровна", "жен");
        Human h3 = new Human(3, "Петр Николаевич", "муж");
        Human h4 = new Human(4, "Светлана Николаевна", "жен");
        Human h5 = new Human(5, "Илья Семенович", "муж");
        Human h6 = new Human(6, "Екатерина Александровна", "жен");
        Human h7 = new Human(7, "Юлия Ильинична", "жен");
        Human h8 = new Human(8, "Дмитрий Петрович", "муж");
        Set<Human> setHuman = new LinkedHashSet<>(Arrays.asList(h1, h2, h3, h4, h5, h6, h7, h8));

        Person h1_1 = new Person(h1.getID(), h1.getName(), h1.getSex(), h2, null, new LinkedHashSet<>(Arrays.asList(h3, h4)), null);
        Person h2_1 = new Person(h2.getID(), h2.getName(), h2.getSex(), h1, null, new LinkedHashSet<>(Arrays.asList(h3, h4)), null);
        Person h3_1 = new Person(h3.getID(), h3.getName(), h3.getSex(), h6, new LinkedHashSet<>(Arrays.asList(h4)), new LinkedHashSet<>(Arrays.asList(h8)), new LinkedHashSet<>(Arrays.asList(h1, h2)));
        Person h4_1 = new Person(h4.getID(), h4.getName(), h4.getSex(), h5, new LinkedHashSet<>(Arrays.asList(h3)), new LinkedHashSet<>(Arrays.asList(h7)), new LinkedHashSet<>(Arrays.asList(h1, h2)));
        Person h5_1 = new Person(h5.getID(), h5.getName(), h5.getSex(), h4, null, new LinkedHashSet<>(Arrays.asList(h7)), null);
        Person h6_1 = new Person(h6.getID(), h6.getName(), h6.getSex(), h3, null, new LinkedHashSet<>(Arrays.asList(h8)), null);
        Person h7_1 = new Person(h7.getID(), h7.getName(), h7.getSex(), null, null, null, new LinkedHashSet<>(Arrays.asList(h5, h4)));
        Person h8_1 = new Person(h8.getID(), h8.getName(), h8.getSex(), null, null, null, new LinkedHashSet<>(Arrays.asList(h3,  h6)));
        Set<Person> setPerson = new LinkedHashSet<>(Arrays.asList(h1_1, h2_1, h3_1, h4_1, h5_1, h6_1, h7_1, h8_1));
        m.view(setHuman, setPerson);
    }

    public void view(Set<Human> human, Set<Person> person) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n" +
                "\nВыберите нужное действие: \n");
        System.out.println("1.Вывести весь список людей");
        System.out.println("2.Введите id интересующего человека");
        System.out.println("3.Выход");
        System.out.print("\n Укажите нужный пункт меню: \n");
        int choice = in.nextInt();
        in.nextLine();
        System.out.println(" ");
        switch (choice) {
            case 1:
                System.out.println(human);
            case 2:
                int choice1 = in.nextInt();
                in.nextLine();
                Integer flag = 0;
                for (Person item : person) {
                    if (item.getID() == choice1) {
                        System.out.println(
                                "\nДля " + item.getName() +
                                        " найдены следующие ближайшие родственники: ");
                        System.out.println(
                                "\nСупруг:        \t" + item.getWife_husband() +
                                        "\nДети:          \t" + item.getChildren() +
                                        "\nРодители:      \t" + item.getParents() +
                                        "\nБратья/Сестры: \t" + item.getBrothers_sisters() +
                                        "\n");
                        view(human, person);
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println("Неверно указан ID для поиска! Попробуйте снова!");
                    view(human, person);
                }
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Неверно указан пункт меню.");
        }
    }

}
