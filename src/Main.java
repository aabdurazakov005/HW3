public class Main {
    public static void main(String[] args) {
        byte a = 1;
        short b = 3367;
        int c = 2341775;
        long d = 12324353476576L;
        float e = 3.47f;
        double f = 4543.43256;
        System.out.println("Задание №1");
        System.out.println("Значение переменной а с типом byte равно " + a);
        System.out.println("Значение переменной b с типо short равно " + b);
        System.out.println("Значение переменной с с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной е с типом float равно " + e);
        System.out.println("Значение переменной f с типои double равно " + f);
        System.out.println(" ");
        float firstNumber = 27.12f;
        long secondNumber = 987678965549L;
        float thirdNumber = 2.786f;
        short fourthNumber = 569;
        short fifthNumber = -159;
        short sixthNumber = 27897;
        byte seventhNumber = 67;
        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        short paperSheets = 480;
        int totalStudents = classLP + classAS + classEA;
        int sheetOnEach = paperSheets / totalStudents;
        System.out.println("Задание №3");
        System.out.println("На каждого ученика рассчитано " + sheetOnEach + " листов бумаги");
        System.out.println(" ");
        byte bottlesOneMinute = 16 / 2;
        int bottlesTwentyMinutes = bottlesOneMinute * 20;
        int bottlesOneDay = bottlesOneMinute * 1440;
        int bottlesThreeDays = bottlesOneMinute * 4320;
        int bottlesOneMonth = bottlesOneDay * 30;
        System.out.println("Задание №4");
        System.out.println("За 20 минут машина произвела " + bottlesTwentyMinutes + " штук бутылок");
        System.out.println("За один день машина произвела " + bottlesOneDay + " штук бутылок");
        System.out.println("За три дня машина произвела " + bottlesThreeDays + " штук бутылок");
        System.out.println("За один месяц машина произвела " + bottlesOneMonth + " штук бутылок");
        System.out.println(" ");
        byte whitePaintOneClassroom = 2;
        byte brownPaintOneClassroom = 4;
        byte totalPaintCans = 120;
        int cansOneClassroom = whitePaintOneClassroom + brownPaintOneClassroom;
        int classrooms = totalPaintCans / cansOneClassroom;
        int totalWhite = whitePaintOneClassroom * classrooms;
        int totalBrown = brownPaintOneClassroom * classrooms;
        System.out.println("Задание №5");
        System.out.println("В школе, где " + classrooms + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
        System.out.println(" ");
        short bananasWeight = 5 * 80;
        short milkWeight = 200 / 100 * 105;
        short icecreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;
        int weightGr = bananasWeight + milkWeight + icecreamWeight + eggsWeight;
        int grPerKg = 1000;
        float weightKg = weightGr/(float)grPerKg;
        System.out.println("Задание №6");
        System.out.println("Результат в граммах " + weightGr + " грамм");
        System.out.println("результат в килограммах " + weightKg + " кг");
        System.out.println(" ");
        short totalWeight = 7000;
        short weightCutting1 = 250;
        short weightCutting2 = 500;
        int amountDays1 = totalWeight / weightCutting1;
        int amountDay2 = totalWeight / weightCutting2;
        System.out.println("Задание №7");
        System.out.println("Количество дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм равно " + amountDays1);
        System.out.println("Количество дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм равно " + amountDay2);
        System.out.println(" ");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        byte months = 12;
        double increase = 1.1;
        int yearSalaryMasha = salaryMasha * months;
        int yearSalaryDenis = salaryDenis * months;
        int yearSalaryKristina = salaryKristina * months;
        double increaseMasha = salaryMasha * increase;
        double increaseDenis = salaryDenis * increase;
        double increaseKristina = salaryKristina * increase;
        double afterIncreaseM = yearSalaryMasha + increaseMasha;
        double afterIncreaseD = yearSalaryDenis + increaseDenis;
        double afterIncreaseK = yearSalaryKristina + increaseKristina;
        double differenceM = afterIncreaseM - yearSalaryMasha;
        double differenceD = afterIncreaseD - yearSalaryDenis;
        double differenceK = afterIncreaseK - yearSalaryKristina;
        System.out.println("Задание №8");
        System.out.println("Маша теперь получает " + afterIncreaseM + " рублей. Зарплата выросла на " + differenceM + " рублей");
        System.out.println("Денис теперь получает " + afterIncreaseD + " рублей. Зарплата выросла на " + differenceD + " рублей");
        System.out.println("Кристина теперь получает " + afterIncreaseK + " рублей. Зарплата выросла на " + differenceK + " рублей");
    }
}