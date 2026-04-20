public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int age = 19;
        System.out.println();
        System.out.println("Задание №1");
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 2;
        System.out.println();
        System.out.println("Задание №2");
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        int speed = 80;
        System.out.println();
        System.out.println("Задание №3");
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        int age1 = 25;
        System.out.println();
        System.out.println("Задание №4");
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен" + age1 + ", то его место в университете");
        } else if (age1 > 24) {
            System.out.println("Если возраст человека равен" + age1 + ", то ему пора ходить на работу");
        }

        int age2 = 10;
        boolean hasAdult = true; // true — взрослый есть, false — взрослого нет
        System.out.println();
        System.out.println("Задание №5");
        if (age2 < 5) {
            System.out.println("Если возраст ребенка равен" + age2 + ", то ему нельзя кататься на аттракционе");
        } else if (age2 >= 5 && age2 < 14) {
            if (hasAdult) {
                System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе (нужно сопровождение)");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + age2 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int totalCapacity = 102;
        int seatingCapacity = 60;
        int passengersCount = 70;
        System.out.println();
        System.out.println("Задание №6");
        if (passengersCount >= totalCapacity) {
            System.out.println("Вагон уже полностью забит.");
        } else {
            if (passengersCount < seatingCapacity) {
                System.out.println("В вагоне есть сидячие места.");
            } else {
                System.out.println("В вагоне остались только стоячие места.");
            }
        }

        int one = 9;
        int two = 47;
        int three = 19;
        System.out.println();
        System.out.println("Задание №7");
        if (one >= two && one >= three) {
            System.out.println("Большее число — " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Большее число — " + two);
        } else {
            System.out.println("Большее число — " + three );
        }
    }
}