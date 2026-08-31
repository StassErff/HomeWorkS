// Переменные и синтаксис
public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763_789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 4
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        var bokser1 = 78.2;
        var bokser2 = 82.7;

        var totalWeight = bokser1 + bokser2;
        System.out.println(totalWeight);

        var difWeight = bokser2 - bokser1;
        System.out.println(difWeight);

        // Задача 7
        var remainsWeight = bokser2 % bokser1;
        System.out.println(remainsWeight);

        // Задача 8
        var hours = 640;
        var workHours = 8;

        var worker = hours / workHours;
        System.out.println(worker);
    }
}

// Переменные: типы и выбор
class HomeWork2 {
    public static void main(String[] args) {

        // Задание 1
        int human = 1_525_240_657;
        byte cat = 98;
        short dog = 16_546;
        long microbe = 6_400_567L;
        float speed = 24.55f;
        double weight = 105.76;

        System.out.println("Значение переменной human с типом int равно " + human);
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        System.out.println("Значение переменной dog с типом short равно " + dog);
        System.out.println("Значение переменной microbe с типом long равно " + microbe);
        System.out.println("Значение переменной speed с типом float равно " + speed);
        System.out.println("Значение переменной weight с типом double равно " + weight);

        // Задание 2
        float prise = 27.12f;
        long radius = 987_678_965_549L;
        float bingo = 2.786f;
        short car = 569;
        short numb = -159;
        int building = 27897;
        byte flowers = 67;

        // Задание 3
        int paper = 480;
        byte ludmila = 23;
        byte anna = 27;
        byte ekaterina = 30;

        int student = ludmila + anna + ekaterina;
        int studentPapers = paper / student;
        System.out.println("На каждого ученика рассчитано " + studentPapers + " листов бумаги");

        // Задание 4
        int bottleInMin = 16 / 2;
        int min20 = bottleInMin * 20;
        int day = (bottleInMin * 60) * 24;
        int days3 = day * 3;
        int month = day * 30;

        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + days3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

        // Задание 5
        int school = 120;
        int potWhite = 2;
        int potBraun = 4;
        int classPot = potWhite + potBraun;
        int classes = school / classPot;
        int potWhiteSchool = potWhite * classes;
        int potBraunSchool = potBraun * classes;

        System.out.println("В школе где " + classes + " классов, нужно " + potWhiteSchool + " банок белой краски и " + potBraunSchool + " банок коричневой краски");

        // Задание 6
        int banana = 80 * 5;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int eggs = 70 * 4;

        float breakfastGr = banana + milk + iceCream + eggs
        float breakfastKg = breakfastGr / 1000f;
        System.out.println(breakfastGr + breakfastKg);

        // Задание 7
        int loseWeight = 7000;
        int day250gr = loseWeight / 250;
        int day500gr = loseWeight / 500;
        int dayOnAverage = (day250gr + day500gr) / 2;
        System.out.println(dayOnAverage);

        // Задание 8
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;

        float mashaNew = masha * 1.1f;
        float denisNew = denis * 1.1f;
        float kristinaNew = kristina * 1.1f;

        int mashaYearBefore = masha * 12;
        int denisYearBefore = denis * 12;
        int kristinaYearBefore = kristina * 12;

        float mashaYearAfter = mashaNew * 12;
        float denisYearAfter = denisNew * 12;
        float kristinaYearAfter = kristinaNew * 12;

        float mashaSalaryDif = mashaYearAfter - mashaYearBefore;
        float denisSalaryDif = denisYearAfter - denisYearBefore;
        float kristinaSalaryDif = kristinaYearAfter - kristinaYearBefore;

        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + mashaSalaryDif + " рублей");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + denisSalaryDif + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + kristinaSalaryDif + " рублей");
    }
}