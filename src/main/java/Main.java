public class Main {

    public static void main(String[] args) {

        System.out.println("Exersice1");
        int age = 30;
        if (age >= 18) {
            System.out.printf("Если возраст человека равен %s, то он совершеннолетний%n", age);
        } else {
            System.out.printf("Если возраст человека равен %s, он не достиг совершеннолетия, нужно немного подождать%n", age);
        }
        System.out.println("_________________________");

        System.out.println("Exersice2");
        int t = -3;
        if (t < 5) {
            System.out.printf("На улице %s градусов, нужно надеть шапку%n", t);
        } else {
            System.out.printf("На улице %s градусов, можно идти без шапки%n", t);
        }
        System.out.println("_________________________");

        System.out.println("Exersice3");
        int v = 55;
        if (v >= 60) {
            System.out.printf("Если скорость %s, то придется заплатить штраф%n", v);
        } else {
            System.out.printf("Если скорость %s можно ездить спокойно%n", v);
        }
        System.out.println("_________________________");

        System.out.println("Exersice4");
        age = 1;
        if (age > 24) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить на работу%n", age);
        } else if (age >= 18 && age <= 24) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в университет%n", age);
        } else if (age >= 7 && age <= 17) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходит в школу%n", age);
        } else if (age >= 2 && age <= 6) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в детский сад%n", age);
        } else {
            System.out.printf("Если возраст человека равен %s, то можно ползать%n", age);
        }
        System.out.println("_________________________");

        System.out.println("Exercise 5");
        age = 14;
        if (age < 5) {
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься на аттракционе%n", age);
        } else if (age <= 14) {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе, но только в сопровождении взрослого%n",
                              age);
        } else {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься на аттракционе без сопровождения взрослого%n", age);
        }
        System.out.println("_________________________");

        System.out.println("Exersice6");
        int quantityPers = 1030;
        int maxChair = 60;
        int maxСapacity = 102;
        int remainder;
        if (maxСapacity < quantityPers) {
            remainder = quantityPers - maxСapacity;
            System.out.printf("Место в вагоне для %s не хватило, перейдите в другой вагон%n", remainder);
        } else if (quantityPers > maxChair && maxСapacity >= quantityPers) {
            remainder = quantityPers - maxChair;
            System.out.printf("Место в вагоне хватит всем, но %s человек будет стоять%n", remainder);
        } else {
            System.out.printf("Место в вагоне хватит всем, все %s человек будет сидеть%n", quantityPers);
        }
        System.out.println("_________________________");

        System.out.println("Exersice7");
        int one = 431;
        int two = 1121;
        int three = 155;

        int max;

        if (one >= two && one >= three) {
            max = one;
        } else if (two >= one && two >= three) {
            max = two;
        } else {
            max = three;
        }

        System.out.println("Наибольшее число: " + max);
        System.out.println("_________________________");
    }
}
