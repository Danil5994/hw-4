//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        int age = 17;
        if (age >= 18) {
            System.out.printf("ты совершеннолетний!");
        } else {
            System.out.printf("Тебе нужно подождать совершеннолетия!");
        }

        //task2

        int temperature = 3;
        if (temperature < 5) {
            System.out.printf("надо одеть шапку!");
        }
        if (temperature >= 5){
            System.out.printf("шапку одевать ненадо!");
        }

        //task 3

        int speed = 50;
        if (speed > 60) {
            System.out.printf("Вы превысили скорость, придется заплатить штраф!");
        } else {
            System.out.printf("скорость стабильна,можно ездить спокойно");
        }

        //task 4


        int age2 = 35;

        if (age2 < 2){
            System.out.printf("Если возраст человека равен " + age2 + " то ему нужно cидеть дома");
        }
        if (age2 >= 2 && age2 <= 6) {
            System.out.printf("Если возраст человека равен " + age2 + " то ему нужно ходить в детский сад");
        }
        if (age2 > 7 && age2 < 17){
            System.out.printf("Если возраст человека равен " + age2 + " то ему нужно ходить в школу");
        }
        if (age2 > 18 && age2 < 24){
            System.out.printf("Если возраст человека равен " + age2 + " то ему нужно ходить в университет");
        }
        if (age2 > 24){
            System.out.printf("Если возраст человека равен " + age2 + " то ему нужно ходить на работу");
        }

        //task 5


        int child = 14;
        if (child <= 5) {
            System.out.printf("если ребёнку " + child + " не может кататься на аттракционе!");
        }
        if (child >= 5 && child <= 14) {
            System.out.printf("если ребёнку " + child + " то он может кататься на аттракционе только в присутсвии взрослого!");
        }
        if (child > 14){
            System.out.printf("если ребёнку " + child + " то он может кататься спокойно без взрослых!");
        }

        // task 6

        int places = 15;
        if (places < 60){
            System.out.printf(" сидячие места есть ");
        }else if (places > 60 && places < 102){
            System.out.printf(" сидячие места заняты, остальные могут постоять");
        }else if (places > 102){
            System.out.printf("вагон забит");
        }


        // task 7

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.printf("число one больше остальных");
        }else if(two > one && two > three){
            System.out.printf("число two больше остальных");
        }else if (three > two && three > one) {
            System.out.printf("число three больше остальных");
        }




    }

}
