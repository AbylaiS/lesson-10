import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {

//    enum Level{
//        LOW,
//        MEDIUM,
//        HIGH
//    }


    public static void main(String[] args) {
/*
        ArrayList<Integer> myInteger = new ArrayList<>();
        myInteger.add(1);
        myInteger.add(20);
        myInteger.add(-30);
        myInteger.add(5);

        Iterator<Integer> iterator = myInteger.iterator();
        System.out.println(iterator.next());

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
/*
        HashSet<Integer> myInteger = new HashSet<>();

        myInteger.add(1);
        myInteger.add(20);
        myInteger.add(-30);
        myInteger.add(5);

        for (int i = 0; i <= 30; i++){
            if (myInteger.contains(i)){
                System.out.println(i + "Было найдено");
            }
            else System.out.println("Не найдено");
        }

/*
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Avocado");
        fruits.add("Avocado");
        System.out.println(fruits);
        System.out.println(fruits.contains("Lime"));

        fruits.remove("Avocado");
        System.out.println(fruits.size());
//        fruits.clear();

        for (String fruit : fruits){
            System.out.println(fruits);
        }

/*
        LocalTime newTime = LocalTime.now();
        System.out.println(newTime);

        LocalDateTime newTime1 = LocalDateTime.now();
        System.out.println(newTime1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd - MM - yyy HH:mm:ss");
        String formatterDataTime = newTime1.format(formatter);
        System.out.println("После форматирования: " + formatterDataTime);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.println(name);
        double weight = scanner.nextDouble();
        System.out.println("Введите вес животного: ");
        System.out.println(weight);

        Color myColor = Color.BLACK;


        Level myLevel = Level.LOW;
        System.out.println(myLevel);

        switch (myLevel) {
            case LOW: {
                System.out.println("Low level");
                break;
            }
            case MEDIUM: {
                System.out.println("Medium level");
                break;
            }
            case HIGH: {
                System.out.println("High  level");
                break;
            }
        }

        for (Level level : Level.values()) {
            System.out.println(level);
        }




        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Avocado");
        System.out.println(fruits);
        System.out.println(fruits.get(0));
        fruits.set(0, "Lime");
        System.out.println(fruits.get(0));
        fruits.remove(0);
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
        System.out.println(fruits.size());

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Avocado");
        System.out.println(fruits);
        System.out.println(fruits.get(0));
        fruits.set(0 , "Lime");
        System.out.println(fruits.get(0));
        fruits.remove(0);
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
        System.out.println(fruits.size());

        fruits.addFirst("Apple");
        fruits.addLast("Apple");


        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        ArrayList<Integer> myInteger = new ArrayList<Integer>();
        myInteger.add(1);
        myInteger.add(20);
        myInteger.add(-29);
        myInteger.add(5);

        Collections.sort(myInteger);
        Collections.sort(fruits);

        for (Integer i : myInteger) {
            System.out.println(i);
        }

        HashMap<String , String> cities =new HashMap<String , String>();
        cities.put("Казахстан" , "Алматы" );
        cities.put("Сша" , "Вашингтон");
        cities.put("Англия" ,"Лондон");
        cities.put("Германия" , "Берлин");
        System.out.println(cities);
        System.out.println(cities.get("Казахстан"));

        cities.clear();
        System.out.println(cities.size());

        for (String key : cities.keySet()){
            System.out.println("Ключ:" + key + ", значение: " + cities.get(key));
        }

        HashMap<String , Double> products = new HashMap<>();
        products.put("Laptop", 551321.0);
        products.put("Iphone", 657020.0);
        products.put("Headphones", 65032.0);
        products.put("AppleWatch", 175080.0);

        for (String key : products.keySet()){
            System.out.println("Продукт: " + key + " ,Цена:" + products.get(key));
        }
*/

        //HomeWork

//      №1

//        ArrayList<Colors> colors = new ArrayList<>();
//        colors.add(Colors.BLACK);
//        colors.add(Colors.ORANGE);
//        colors.add(Colors.BLACK);
//        colors.add(Colors.BROWN);
//        System.out.println(colors);


//        Color myColors = Color.BLACK;
//        System.out.println(myColors);

//      №2
//
//        for (Weekdays weekday : Weekdays.values()) {
//            Weekdays.isHoliday(weekday);
//        }
//
//      №3
//
//        Lamborghini lamborghini = new Lamborghini();
//        lamborghini.Speed();
//        lamborghini.Models();
//
//      №4
//
//        Student student = new Student();
//        student.addAndPrintGrades();
//
//      Создал справочник без класса просто в Main,надеюсь так тоже можно
//
//      №5
//
//        HashMap<String, String> phonebook = new HashMap<>();
//        Scanner input = new Scanner(System.in);
//        while (true) {
//            System.out.println("Справочная книга");
//            System.out.println("Нажмите :1. что бы добавить контакт");
//            System.out.println("Нажмите :2. что бы посмотреть информацию о телефонной книге");
//            System.out.println("Нажмите :3. что бы обновить контакт");
//            System.out.println("Нажмите :4. что бы найти контакт");
//            System.out.println("Нажмите :5. что бы выйти из программы");
//            System.out.print("Введите значение: ");
//            int choice = input.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.print("Введите имя: ");
//                    String name = input.next();
//                    System.out.print("Введите номер телефона: ");
//                    String phone = input.next();
//                    phonebook.put(name, phone);
//                    System.out.println("Контакт успешно добавлен");
//                    break;
//                case 2:
//                    if (phonebook.isEmpty()) {
//                        System.out.println("Контакт не найден");
//                    } else {
//                        System.out.println("Имя\t\tТелефон");
//                        for (String key : phonebook.keySet()) {
//                            System.out.println(key + "\t\t" + phonebook.get(key));
//                        }
//                    }
//                    break;
//                case 3:
//                    System.out.print("Введите имя: ");
//                    name = input.next();
//                    if (!phonebook.containsKey(name)) {
//                        System.out.println("Контакт не найден");
//                    } else {
//                        System.out.print("Введите новый номер: ");
//                        phone = input.next();
//                        phonebook.put(name, phone);
//                        System.out.println("Контакт успешно обновлён");
//                    }
//                    break;
//                case 4:
//                    System.out.print("Введите имя: ");
//                    name = input.next();
//                    if (!phonebook.containsKey(name)) {
//                        System.out.println("Контакт не найден");
//                    } else {
//                        System.out.println("Имя\t\tТелефон");
//                        System.out.println(name + "\t\t" + phonebook.get(name));
//                    }
//                    break;
//                case 5:
//                    System.out.println("Выход из программы ...");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Неверный набор. Попробуйте еще раз.");
//
//
//            }
//        }

//        №6

//        ArrayList<Colors> colors1 = new ArrayList<>();
//        colors1.add(Colors.BLUE);
//        colors1.add(Colors.PINK);
//        colors1.add(Colors.BLACK);
//        colors1.add(Colors.GREEN);
//        System.out.println(colors1);

//      №7

//        Examination examination = new Examination();
//        examination.addExamination();

//     №8

//        ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Orange");
//        fruits.add("Avocado");
//        fruits.set(2,"Lime");
//        System.out.println(fruits);

//     №9

//        LinkedList<String> fruits = new LinkedList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Orange");
//        fruits.add("Avocado");
//        System.out.println("Первый элемент :"+ fruits.getFirst());
//        System.out.println("Последний элемент : " + fruits.getLast());

//     №10

//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        int firstIndex = 2;
//        int secondIndex = 4;
//
//        int temp = list.get(firstIndex);
//        list.set(firstIndex, list.get(secondIndex));
//        list.set(secondIndex, temp);
//
//        System.out.println("Обновленный связанный список: " + list);

//      №11
//        Set<Integer> exp1 = new HashSet<>();
//        exp1.add(66);
//        exp1.add(2);
//        exp1.add(3);
//        exp1.add(45);
//
//        Set<Integer> exp2 = new HashSet<>();
//        exp2.add(3);
//        exp2.add(7);
//        exp2.add(55);
//        exp2.add(66);
//
//        exp1.retainAll(exp2);
//
//        System.out.println("Сравнения двух HashSet: " + exp1);
//

//      №12
//        Set<Integer> set = new HashSet<>();
//        if (set.isEmpty()) {
//            System.out.println("Набор пустой.");
//        } else {
//            System.out.println("Набор не пустой.");
//        }

//      №13
//        Map<String, String> map1 = new HashMap<>();
//        map1.put("Тетрадь", "Гитара");
//        map1.put("Компас ", "Карта");
//        map1.put("Очки", "Книга");
//        map1.put("Интернет", "Телефон");
//
//        Map<String, String> map2 = new HashMap<>(map1);
//
//        System.out.println("Оригинальная Запись: " + map1);
//        System.out.println("Копия: " + map2);

//      №14

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");
        map.put(4, "Четыре");

        String valueToFind = "Три";

        if (map.containsValue(valueToFind)) {
            System.out.println("Запись содержит значение '" + valueToFind + "'.");
        } else {
            System.out.println("Запись не содержит значение '" + valueToFind + "'.");
        }
    }
}